import React from 'react';
import './App.css';
import { W3V } from './W3V';
import { Tab, TabList, TabPanel, Tabs } from 'react-tabs';
import { W3I } from './W3I';
import './tabs-style.css';
import { Doo } from './Doo';
import { DooUnits } from './DooUnits';
import { W3A } from './W3A';
import { W3C } from './W3C';
import { W3R } from './W3R';
import { W3S } from './W3S';
import { MMP } from './MMP';
import { SHD } from './SHD';
import { W3E } from './W3E';
import { WCT } from './WCT';
import { WPM } from './WPM';

const App = () => {
  return (
    <div className="App">
      <Tabs>
        <TabList style={{
          display: 'flex',
          margin: 0,
          marginBlock: 0,
          paddingInline: 0
        }}>
          <Tab>
            W3I
          </Tab>
          <Tab>
            W3V
          </Tab>
          <Tab>
            Doo
          </Tab>
          <Tab>
            DooUnits
          </Tab>
          <Tab>
            W3A
          </Tab>
          <Tab>
            W3C
          </Tab>
          <Tab>
            W3R
          </Tab>
          <Tab>
            W3S
          </Tab>
          <Tab>
            MMP
          </Tab>
          <Tab>
            SHD
          </Tab>
          <Tab>
            WPM
          </Tab>
          <Tab>
            W3E
          </Tab>
          <Tab>
            WCT
          </Tab>
        </TabList>
        <TabPanel>
          <W3I />
        </TabPanel>
        <TabPanel>
          <W3V />
        </TabPanel>
        <TabPanel>
          <Doo />
        </TabPanel>
        <TabPanel>
          <DooUnits />
        </TabPanel>
        <TabPanel>
          <W3A />
        </TabPanel>
        <TabPanel>
          <W3C />
        </TabPanel>
        <TabPanel>
          <W3R />
        </TabPanel>
        <TabPanel>
          <W3S />
        </TabPanel>
        <TabPanel>
          <MMP />
        </TabPanel>
        <TabPanel>
          <SHD />
        </TabPanel>
        <TabPanel>
          <WPM />
        </TabPanel>
        <TabPanel>
          <W3E />
        </TabPanel>
        <TabPanel>
          <WCT />
        </TabPanel>
      </Tabs>
    </div>
  );
}

export default App;
