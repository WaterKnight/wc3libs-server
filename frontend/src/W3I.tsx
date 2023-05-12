import { useState, useCallback } from "react";
import SyntaxHighlighter from "react-syntax-highlighter";
import { W3IDropZone } from "./W3IDropZone";
import { Tab, TabList, TabPanel, Tabs } from "react-tabs";
import yaml from "js-yaml";
import { ForcesChunk, PlayersChunk, W3W3i } from 'backend-api';
import { CompactTable } from '@table-library/react-table-library/compact';
import { useTree } from '@table-library/react-table-library/tree';
import { useTheme } from '@table-library/react-table-library/theme';
import { getTheme } from '@table-library/react-table-library/baseline';
import './tabs-style.css';
import { Table } from "@table-library/react-table-library";

type W3IData = {
  mapNameRaw: {
    value: string;
  };
  version: number;
  editorVersion: number;
  gameVersion: {
    major: number;
    minor: number;
    revision: number;
    build: number;
  }
  author: {
    value: string;
  };
  recommendedPlayers: {
    value: string;
  };
  cameraBounds: {
    cameraBoundLeft: {
      x: number;
      y: number;
    };
    cameraBoundBottom: {
      x: number;
      y: number;
    };
    cameraBoundRight: {
      x: number;
      y: number;
    };
    cameraBoundTop: {
      x: number;
      y: number;
    };
  };
  margins: {
    left: number;
    right: number;
    bottom: number;
    top: number;
  };
  mapWidth: number;
  mapHeight: number;
  flags: {
    useCustomTechs: boolean;
    useCustomTeams: boolean;
    fixedPlayerParametersForCustomTeams: boolean;
    unexploredAreasPartiallyVisible: boolean;
    nonDefaultTilesetMapSizeLargeNeverBeenReducedToMedium: boolean;
    melee: boolean;
    changeAllyPriorities: boolean;
    hideMinimapOnPreviewScreens: boolean;
    useItemClassificationSystem: boolean;
    tftRequired: boolean;
    useTerrainFog: boolean;
    showWaterWavesOnRollingShores: boolean;
    showWaterWavesOnCliffShores: boolean;
    mapPropertiesMenuOpenedAtLeastOnce: boolean;
    useCustomUpgrades: boolean;
    useCustomAbilities: boolean;
    customWaterTintColor: boolean;
    flag17: boolean;
    flag18: boolean;
    flag19: boolean;
    flag20: boolean;
    useCustomAbilitySkin: boolean;
    useAccurateProbabilitiesForCalculation: boolean;
  };
}

export const W3I = () => {
  const [text, setText] = useState<string>();

  const handleResponse = useCallback((response: string) => {
    setText(response);
  }, []);

  return (
    <div className="App">
      W3I
      <W3IDropZone onResponse={handleResponse} />
      {/* {text && <pre style={{textAlign: 'left'}}>{JSON.stringify(JSON.parse(text), null, 2)}</pre>} */}
      {text && <W3IResult json={text} />}
    </div>
  );
}

type W3IResultProps = {
  json: string;
}

const W3IResult = ({json}: W3IResultProps) => {
  const w3i = JSON.parse(json) as W3W3i;
  return (
    <Tabs>
      <TabList style={{
          display: 'flex',
          margin: 0,
          marginBlock: 0,
          paddingInline: 0
        }}
      >
        <Tab>JSON</Tab>
        <Tab>YAML</Tab>
        <Tab>Visual</Tab>
      </TabList>

      <TabPanel>
        <SyntaxHighlighter
          language="json"
          customStyle={{
            textAlign: 'left'
          }}
        >
          {JSON.stringify(JSON.parse(json), null, 2)}
        </SyntaxHighlighter>
      </TabPanel>
      <TabPanel>
        <SyntaxHighlighter
          language="yaml"
          customStyle={{
            textAlign: 'left'
          }}
        >
          {yaml.dump(JSON.parse(json))}
        </SyntaxHighlighter>
      </TabPanel>
      <TabPanel>
        <div style={{
          display: 'flex',
          flexFlow: 'column nowrap',
          textAlign: 'left',
          margin: '1em',
          gap: '0.5em'
        }}>
          <span>Map Name: {w3i.mapName}</span>
          <span>Saves: {w3i.saves}</span>
          <span>Supported Graphic Modes: {'HD: '}{renderBoolean(w3i.supportedGraphicsModes?.hd)} {'SD: '}{renderBoolean(w3i.supportedGraphicsModes?.sd)}</span>
          <span>Editor Version: {w3i.editorVersion}</span>
          <span>Recommended Players: {w3i.recommendedPlayers?.value}</span>
          <span style={{textTransform: 'capitalize'}}>Script Language: {w3i.scriptLanguage?.toLowerCase()}</span>
          <span>Light Environment: {w3i.lightEnvironment?.value === '\0' ? 'None' : w3i.lightEnvironment?.value}</span>
          <span style={{display: 'flex', alignItems: 'center'}}><span>Water Color: {w3i.waterColor?.red} {w3i.waterColor?.green} {w3i.waterColor?.blue} {w3i.waterColor?.alpha}</span>{w3i.waterColor && renderColor(w3i.waterColor)}</span>
          <span>Sound Environment: {w3i.soundEnvironment?.value}</span>
          <span>Game Version: {w3i.gameVersion?.major}.{w3i.gameVersion?.minor}.{w3i.gameVersion?.revision}.{w3i.gameVersion?.build}</span>
          <span>Map Dimensions: {w3i.mapWidth} x {w3i.mapHeight}</span>
          <span style={{textTransform: "capitalize"}}>Tileset: {w3i.tileset?.replace("_", " ").toLowerCase()}</span>
          <span style={{display: 'flex', alignItems: 'center'}}>
            <span>Fog: <span style={{textTransform: 'capitalize'}}>{w3i.fog?.fogType?.toLocaleLowerCase()}</span> {w3i.fog?.fogDensity?.toFixed(2) ?? 0} {w3i.fog?.fogZStart} {w3i.fog?.fogZEnd} {w3i.fog?.fogColorRed} {w3i.fog?.fogColorGreen} {w3i.fog?.fogColorBlue} {w3i.fog?.fogColorAlpha}</span>
            {w3i.fog && renderColor({red: w3i.fog?.fogColorRed, green: w3i.fog?.fogColorGreen, blue: w3i.fog?.fogColorBlue, alpha: w3i.fog?.fogColorAlpha})}
          </span>
          <span>Script Language2: {w3i.scriptLanguage2}</span>
          <span>Global Weather Id: {w3i.globalWeatherId?.value === '\0\0\0\0' ? 'None' : w3i.globalWeatherId?.value}</span>
          <span>Margins: {w3i.margins?.bottom} {w3i.margins?.left} {w3i.margins?.right} {w3i.margins?.top}</span>
          <span style={{textTransform: 'capitalize'}}>Game Data Set: {w3i.gameDataSet?.toLowerCase()}</span>
          <span>Game Data Version: {w3i.gameDataVersion}</span>
          <FlagsTable w3i={w3i} />
          <span>{`Loading Screen: ${w3i.loadingScreen?.customLoadingScreenPath?.value} ${w3i.loadingScreen?.loadingScreenIndex === -1 ? 'None' : w3i.loadingScreen?.loadingScreenIndex} ${w3i.loadingScreen?.loadingScreenTitle?.value} ${w3i.loadingScreen?.loadingScreenSubtitle?.value} ${w3i.loadingScreen?.loadingScreenText?.value}`}</span>
          <span>{`Prologue Screen: ${w3i.prologueScreen?.prologueScreenPath?.value} ${w3i.prologueScreen?.prologueScreenTitle?.value} ${w3i.prologueScreen?.prologueScreenSubtitle?.value} ${w3i.prologueScreen?.prologueScreenText?.value}`}</span>
          <span>{`Camera Bounds: bottom left: (${w3i.cameraBounds?.cameraBoundBottomLeft?.x}, ${w3i.cameraBounds?.cameraBoundBottomLeft?.y}) top right: (${w3i.cameraBounds?.cameraBoundTopRight?.x}, ${w3i.cameraBounds?.cameraBoundTopRight?.y}) top left: (${w3i.cameraBounds?.cameraBoundTopLeft?.x}, ${w3i.cameraBounds?.cameraBoundTopLeft?.y}) bottom right: (${w3i.cameraBounds?.cameraBoundBottomRight?.x}, ${w3i.cameraBounds?.cameraBoundBottomRight?.y})`}</span>
          <PlayerTable w3i={w3i} />
          <ForceTable w3i={w3i} />
        </div>
      </TabPanel>
    </Tabs>
  );
}

const FlagsTable = ({w3i}: {w3i: W3W3i}) => {
  type FlagNode = {
    id: string;
    name: string;
    value: boolean;
  };
  const nodes: FlagNode[] | undefined = Object.entries(w3i.flags ?? []).map((entry, index) => ({
    id: index.toString(),
    name: entry[0],
    value: entry[1]
  })) ?? [];
  
  const COLUMNS = [
    { label: 'Flag', renderCell: (flag: FlagNode) => flag.name },
    { label: 'Value', renderCell: (flag: FlagNode) => renderBoolean(flag.value) }
  ];

  const theme = useTheme(getTheme());

  const data = {nodes};

  const tree = useTree(data, {
    state: {}
  });

  return <CompactTable columns={COLUMNS} data={data} tree={tree} theme={theme} />;
};

const PlayerTable = ({w3i}: {w3i: W3W3i}) => {
  type PlayerNode = {
    id: string;
  } & NonNullable<PlayersChunk['player']>[number];
  const nodes: PlayerNode[] | undefined = w3i.playersChunk?.player?.map((player, index) => ({
    id: index.toString(),
    ...player
  })) ?? [];
  
  const COLUMNS = [
    { label: 'Num', renderCell: (player: PlayerNode) => player.num },
    {
      label: 'Name',
      renderCell: (player: PlayerNode) => player.name?.value,
    },
    { label: 'Race', renderCell: (player: PlayerNode) => <span style={{textTransform: 'capitalize'}}>{player.race?.replaceAll('_', ' ').toLocaleLowerCase()}</span> },
    {
      label: 'Fixed Position',
      renderCell: (player: PlayerNode) => renderBoolean(!!player.fixedPosition),
    },
    { label: 'Controller', renderCell: (player: PlayerNode) => <span style={{textTransform: 'capitalize'}}>{player.controller?.toLocaleLowerCase()}</span> },
  ];

  const theme = useTheme(getTheme());

  const data = {nodes};

  const tree = useTree(data, {
    state: {}
  });

  return <CompactTable columns={COLUMNS} data={data} tree={tree} theme={theme} />;
};

const ForceTable = ({w3i}: {w3i: W3W3i}) => {
  type ForceNode = {
    id: string;
  } & NonNullable<ForcesChunk['force']>[number];
  const nodes: ForceNode[] | undefined = w3i.forcesChunk?.force?.map((force, index) => ({
    id: index.toString(),
    ...force
  })) ?? [];
  
  const COLUMNS = [
    { label: 'Name', renderCell: (force: ForceNode) => force.name?.value },
    {
      label: 'Allied',
      renderCell: (force: ForceNode) => renderBoolean(force.flags?.allied),
    },
    { label: 'Allied Victory', renderCell: (force: ForceNode) => renderBoolean(force.flags?.alliedVictory) },
    {
      label: 'Share Advanced Unit Control',
      renderCell: (force: ForceNode) => renderBoolean(force.flags?.shareAdvancedUnitControl),
    },
    { label: 'Share Unit Control', renderCell: (force: ForceNode) => renderBoolean(force.flags?.shareUnitControl) },
    { label: 'Share Vision', renderCell: (force: ForceNode) => renderBoolean(force.flags?.shareVision) },
    { label: 'Players', renderCell: (force: ForceNode) => force.players?.isMember?.map((included, index) => included ? index : undefined).filter(index => index).join(',') },
  ];

  const theme = useTheme({
    Table: `
        --data-table-library_grid-template-columns: 11% 10% 10% 10% 10% 10% 39%;
      `,
  });

  const data = {nodes};

  const tree = useTree(data, {
    state: {}
  });

  return <CompactTable columns={COLUMNS} data={data} tree={tree} theme={theme} layout={{ custom: true }} />;
};

const renderBoolean = (val: boolean | undefined) => {
  if (val) {
    return <span style={{
      color: 'green',
      fontWeight: 'bold'
    }}>{"\u2713"}</span>;
  }

  return <span style={{
    color: 'red',
    fontWeight: 'bold'
  }}>{"\u2716"}</span>;
};

const renderColor = ({red, green, blue, alpha}: {red?: number; green?: number; blue?: number; alpha?: number}) => {
  return <span style={{marginLeft: "0.25em", width: "0.75em", height: "0.75em", border: "2px solid black", backgroundColor: `rgb(${red ?? 0}, ${green ?? 0}, ${blue ?? 0})`}}></span>;
}