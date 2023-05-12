// This is a generated file! Please edit source .ksy file and use kaitai-struct-compiler to rebuild

package net.moonlightflower.kaitai;

import io.kaitai.struct.ByteBufferKaitaiStream;
import io.kaitai.struct.KaitaiStruct;
import io.kaitai.struct.KaitaiStream;
import java.io.IOException;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;

public class W3W3i extends KaitaiStruct {
    public static W3W3i fromFile(String fileName) throws IOException {
        return new W3W3i(new ByteBufferKaitaiStream(fileName));
    }

    public enum GameDataVersion {
        ROC(0),
        TFT(1);

        private final long id;
        GameDataVersion(long id) { this.id = id; }
        public long id() { return id; }
        private static final Map<Long, GameDataVersion> byId = new HashMap<Long, GameDataVersion>(2);
        static {
            for (GameDataVersion e : GameDataVersion.values())
                byId.put(e.id(), e);
        }
        public static GameDataVersion byId(long id) { return byId.get(id); }
    }

    public enum Tileset {
        ASHENVALE(65),
        BARRENS(66),
        FELWOOD(67),
        DUNGEON(68),
        LORDAERON_FALL(70),
        UNDERGROUND(71),
        ICECROWN(73),
        DALARAN_RUINS(74),
        BLACK_CITADEL(75),
        LORDAERON_SUMMER(76),
        NORTHREND(78),
        OUTLAND(79),
        VILLAGE_FALL(81),
        VILLAGE(86),
        LORDAERON_WINTER(87),
        DALARAN(88),
        CITYSCAPE(89),
        SUNKEN_RUINS(90);

        private final long id;
        Tileset(long id) { this.id = id; }
        public long id() { return id; }
        private static final Map<Long, Tileset> byId = new HashMap<Long, Tileset>(18);
        static {
            for (Tileset e : Tileset.values())
                byId.put(e.id(), e);
        }
        public static Tileset byId(long id) { return byId.get(id); }
    }

    public enum ScriptLanguage {
        JASS(0),
        LUA(1);

        private final long id;
        ScriptLanguage(long id) { this.id = id; }
        public long id() { return id; }
        private static final Map<Long, ScriptLanguage> byId = new HashMap<Long, ScriptLanguage>(2);
        static {
            for (ScriptLanguage e : ScriptLanguage.values())
                byId.put(e.id(), e);
        }
        public static ScriptLanguage byId(long id) { return byId.get(id); }
    }

    public enum PlayerController {
        NONE(0),
        HUMAN(1),
        CPU(2),
        NEUTRAL(3),
        RESCUABLE(4);

        private final long id;
        PlayerController(long id) { this.id = id; }
        public long id() { return id; }
        private static final Map<Long, PlayerController> byId = new HashMap<Long, PlayerController>(5);
        static {
            for (PlayerController e : PlayerController.values())
                byId.put(e.id(), e);
        }
        public static PlayerController byId(long id) { return byId.get(id); }
    }

    public enum FogType {
        LINEAR(0),
        EXP(1),
        EXP2(2);

        private final long id;
        FogType(long id) { this.id = id; }
        public long id() { return id; }
        private static final Map<Long, FogType> byId = new HashMap<Long, FogType>(3);
        static {
            for (FogType e : FogType.values())
                byId.put(e.id(), e);
        }
        public static FogType byId(long id) { return byId.get(id); }
    }

    public enum GameDataSet {
        DEFAULT(0),
        CUSTOM(1),
        MELEE(2);

        private final long id;
        GameDataSet(long id) { this.id = id; }
        public long id() { return id; }
        private static final Map<Long, GameDataSet> byId = new HashMap<Long, GameDataSet>(3);
        static {
            for (GameDataSet e : GameDataSet.values())
                byId.put(e.id(), e);
        }
        public static GameDataSet byId(long id) { return byId.get(id); }
    }

    public enum PlayerRace {
        SELECTABLE(0),
        HUMAN(1),
        ORC(2),
        UNDEAD(3),
        NIGHT_ELF(4);

        private final long id;
        PlayerRace(long id) { this.id = id; }
        public long id() { return id; }
        private static final Map<Long, PlayerRace> byId = new HashMap<Long, PlayerRace>(5);
        static {
            for (PlayerRace e : PlayerRace.values())
                byId.put(e.id(), e);
        }
        public static PlayerRace byId(long id) { return byId.get(id); }
    }

    public W3W3i(KaitaiStream _io) {
        this(_io, null, null);
    }

    public W3W3i(KaitaiStream _io, KaitaiStruct _parent) {
        this(_io, _parent, null);
    }

    public W3W3i(KaitaiStream _io, KaitaiStruct _parent, W3W3i _root) {
        super(_io);
        this._parent = _parent;
        this._root = _root == null ? this : _root;
        _read();
    }
    private void _read() {
        this.version = this._io.readU4le();
        if (version() >= 16) {
            this.saves = this._io.readU4le();
        }
        if (version() >= 16) {
            this.editorVersion = this._io.readU4le();
        }
        if (version() >= 27) {
            this.gameVersion = new GameVersion(this._io, this, _root);
        }
        this.mapNameRaw = new W3str(this._io);
        this.author = new W3str(this._io);
        if (version() >= 8) {
            this.recommendedPlayers = new W3str(this._io);
        }
        if (version() <= 3) {
            this.unknownV0ToV3 = new UnknownV0ToV3(this._io, this, _root);
        }
        if ( ((version() > 3) && (version() <= 8)) ) {
            this.unknownV4ToV8 = new UnknownV4ToV8(this._io, this, _root);
        }
        this.unknownString = new W3str(this._io);
        this.cameraBounds = new CameraBounds(this._io, this, _root);
        if (version() >= 14) {
            this.margins = new Margins(this._io, this, _root);
        }
        if (version() >= 1) {
            this.mapWidth = this._io.readU4le();
        }
        if (version() >= 1) {
            this.mapHeight = this._io.readU4le();
        }
        if ( ((version() >= 2) && (version() <= 8)) ) {
            this.unknownV3Int1 = this._io.readU4le();
        }
        if (version() >= 2) {
            this.flags = new Flags(this._io, this, _root);
        }
        if (version() >= 8) {
            this.tileset = Tileset.byId(this._io.readU1());
        }
        this.loadingScreen = new LoadingScreen(this._io, this, _root);
        if (version() >= 17) {
            this.gameDataSet = GameDataSet.byId(this._io.readU4le());
        }
        if (version() <= 17) {
            this.unknownPath = new W3str(this._io);
        }
        if (version() >= 13) {
            this.prologueScreen = new PrologueScreen(this._io, this, _root);
        }
        if (version() >= 19) {
            this.fog = new Fog(this._io, this, _root);
        }
        if (version() >= 21) {
            this.globalWeatherId = new W3id(this._io);
        }
        if (version() >= 22) {
            this.soundEnvironment = new W3str(this._io);
        }
        if (version() >= 23) {
            this.lightEnvironment = new W3char(this._io);
        }
        if (version() >= 25) {
            this.waterColor = new WaterColor(this._io, this, _root);
        }
        if (version() >= 28) {
            this.scriptLanguage = ScriptLanguage.byId(this._io.readU4le());
        }
        if (version() >= 29) {
            this._raw_supportedGraphicsModes = this._io.readBytes(4);
            KaitaiStream _io__raw_supportedGraphicsModes = new ByteBufferKaitaiStream(_raw_supportedGraphicsModes);
            this.supportedGraphicsModes = new GraphicsModes(_io__raw_supportedGraphicsModes, this, _root);
        }
        if (version() >= 30) {
            this.gameDataVersion = GameDataVersion.byId(this._io.readU4le());
        }
        this.playersChunk = new PlayersChunk(this._io, this, _root);
        this.forcesChunk = new ForcesChunk(this._io, this, _root);
        if (version() >= 6) {
            this.upgradesChunk = new UpgradesChunk(this._io, this, _root);
        }
        if (version() >= 7) {
            this.techsChunk = new TechsChunk(this._io, this, _root);
        }
        if (version() >= 12) {
            this.randomUnitTablesChunk = new RandomUnitTablesChunk(this._io, this, _root);
        }
        if (version() >= 24) {
            this.randomItemTablesChunk = new RandomItemTablesChunk(this._io, this, _root);
        }
        if ( ((version() == 26) || (version() == 27)) ) {
            this.scriptLanguage2 = this._io.readU4le();
        }
    }
    public static class WaterColor extends KaitaiStruct {
        public static WaterColor fromFile(String fileName) throws IOException {
            return new WaterColor(new ByteBufferKaitaiStream(fileName));
        }

        public WaterColor(KaitaiStream _io) {
            this(_io, null, null);
        }

        public WaterColor(KaitaiStream _io, W3W3i _parent) {
            this(_io, _parent, null);
        }

        public WaterColor(KaitaiStream _io, W3W3i _parent, W3W3i _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.red = this._io.readU1();
            this.green = this._io.readU1();
            this.blue = this._io.readU1();
            this.alpha = this._io.readU1();
        }
        private int red;
        private int green;
        private int blue;
        private int alpha;
        private W3W3i _root;
        private W3W3i _parent;

        /**
         * red value 0-255
         */
        public int red() { return red; }

        /**
         * green value 0-255
         */
        public int green() { return green; }

        /**
         * blue value 0-255
         */
        public int blue() { return blue; }

        /**
         * alpha value 0-255
         */
        public int alpha() { return alpha; }
        public W3W3i _root() { return _root; }
        public W3W3i _parent() { return _parent; }
    }
    public static class PlayerBitmap extends KaitaiStruct {
        public static PlayerBitmap fromFile(String fileName) throws IOException {
            return new PlayerBitmap(new ByteBufferKaitaiStream(fileName));
        }

        public PlayerBitmap(KaitaiStream _io) {
            this(_io, null, null);
        }

        public PlayerBitmap(KaitaiStream _io, KaitaiStruct _parent) {
            this(_io, _parent, null);
        }

        public PlayerBitmap(KaitaiStream _io, KaitaiStruct _parent, W3W3i _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.isMember = new ArrayList<Boolean>();
            for (int i = 0; i < 32; i++) {
                this.isMember.add(this._io.readBitsIntBe(1) != 0);
            }
        }
        private ArrayList<Boolean> isMember;
        private W3W3i _root;
        private KaitaiStruct _parent;
        public ArrayList<Boolean> isMember() { return isMember; }
        public W3W3i _root() { return _root; }
        public KaitaiStruct _parent() { return _parent; }
    }
    public static class CameraBounds extends KaitaiStruct {
        public static CameraBounds fromFile(String fileName) throws IOException {
            return new CameraBounds(new ByteBufferKaitaiStream(fileName));
        }

        public CameraBounds(KaitaiStream _io) {
            this(_io, null, null);
        }

        public CameraBounds(KaitaiStream _io, W3W3i _parent) {
            this(_io, _parent, null);
        }

        public CameraBounds(KaitaiStream _io, W3W3i _parent, W3W3i _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.cameraBoundBottomLeft = new Point2d(this._io, this, _root);
            this.cameraBoundTopRight = new Point2d(this._io, this, _root);
            this.cameraBoundTopLeft = new Point2d(this._io, this, _root);
            this.cameraBoundBottomRight = new Point2d(this._io, this, _root);
        }
        private Point2d cameraBoundBottomLeft;
        private Point2d cameraBoundTopRight;
        private Point2d cameraBoundTopLeft;
        private Point2d cameraBoundBottomRight;
        private W3W3i _root;
        private W3W3i _parent;
        public Point2d cameraBoundBottomLeft() { return cameraBoundBottomLeft; }
        public Point2d cameraBoundTopRight() { return cameraBoundTopRight; }
        public Point2d cameraBoundTopLeft() { return cameraBoundTopLeft; }
        public Point2d cameraBoundBottomRight() { return cameraBoundBottomRight; }
        public W3W3i _root() { return _root; }
        public W3W3i _parent() { return _parent; }
    }
    public static class Force extends KaitaiStruct {
        public static Force fromFile(String fileName) throws IOException {
            return new Force(new ByteBufferKaitaiStream(fileName));
        }

        public Force(KaitaiStream _io) {
            this(_io, null, null);
        }

        public Force(KaitaiStream _io, W3W3i.ForcesChunk _parent) {
            this(_io, _parent, null);
        }

        public Force(KaitaiStream _io, W3W3i.ForcesChunk _parent, W3W3i _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.flags = new ForceFlags(this._io, this, _root);
            this.players = new PlayerBitmap(this._io, this, _root);
            this.name = new W3str(this._io);
        }
        private ForceFlags flags;
        private PlayerBitmap players;
        private W3str name;
        private W3W3i _root;
        private W3W3i.ForcesChunk _parent;
        public ForceFlags flags() { return flags; }
        public PlayerBitmap players() { return players; }
        public W3str name() { return name; }
        public W3W3i _root() { return _root; }
        public W3W3i.ForcesChunk _parent() { return _parent; }
    }
    public static class GraphicsModes extends KaitaiStruct {
        public static GraphicsModes fromFile(String fileName) throws IOException {
            return new GraphicsModes(new ByteBufferKaitaiStream(fileName));
        }

        public GraphicsModes(KaitaiStream _io) {
            this(_io, null, null);
        }

        public GraphicsModes(KaitaiStream _io, W3W3i _parent) {
            this(_io, _parent, null);
        }

        public GraphicsModes(KaitaiStream _io, W3W3i _parent, W3W3i _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.rest = new ArrayList<Boolean>();
            for (int i = 0; i < 6; i++) {
                this.rest.add(this._io.readBitsIntBe(1) != 0);
            }
            this.sd = this._io.readBitsIntBe(1) != 0;
            this.hd = this._io.readBitsIntBe(1) != 0;
        }
        private ArrayList<Boolean> rest;
        private boolean sd;
        private boolean hd;
        private W3W3i _root;
        private W3W3i _parent;
        public ArrayList<Boolean> rest() { return rest; }
        public boolean sd() { return sd; }
        public boolean hd() { return hd; }
        public W3W3i _root() { return _root; }
        public W3W3i _parent() { return _parent; }
    }
    public static class UnknownV0ToV3 extends KaitaiStruct {
        public static UnknownV0ToV3 fromFile(String fileName) throws IOException {
            return new UnknownV0ToV3(new ByteBufferKaitaiStream(fileName));
        }

        public UnknownV0ToV3(KaitaiStream _io) {
            this(_io, null, null);
        }

        public UnknownV0ToV3(KaitaiStream _io, W3W3i _parent) {
            this(_io, _parent, null);
        }

        public UnknownV0ToV3(KaitaiStream _io, W3W3i _parent, W3W3i _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.unknownV0Int1 = this._io.readU4le();
            this.unknownV0Int2 = this._io.readU4le();
        }
        private long unknownV0Int1;
        private long unknownV0Int2;
        private W3W3i _root;
        private W3W3i _parent;
        public long unknownV0Int1() { return unknownV0Int1; }
        public long unknownV0Int2() { return unknownV0Int2; }
        public W3W3i _root() { return _root; }
        public W3W3i _parent() { return _parent; }
    }
    public static class UnknownV4ToV8 extends KaitaiStruct {
        public static UnknownV4ToV8 fromFile(String fileName) throws IOException {
            return new UnknownV4ToV8(new ByteBufferKaitaiStream(fileName));
        }

        public UnknownV4ToV8(KaitaiStream _io) {
            this(_io, null, null);
        }

        public UnknownV4ToV8(KaitaiStream _io, W3W3i _parent) {
            this(_io, _parent, null);
        }

        public UnknownV4ToV8(KaitaiStream _io, W3W3i _parent, W3W3i _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.unknownV4Int1 = this._io.readU4le();
            this.unknownV4Int2 = this._io.readU4le();
            this.unknownV4Int3 = this._io.readU4le();
            this.unknownV4Float1 = this._io.readF4le();
            this.unknownV4Float2 = this._io.readF4le();
            this.unknownV4Float3 = this._io.readF4le();
        }
        private long unknownV4Int1;
        private long unknownV4Int2;
        private long unknownV4Int3;
        private float unknownV4Float1;
        private float unknownV4Float2;
        private float unknownV4Float3;
        private W3W3i _root;
        private W3W3i _parent;
        public long unknownV4Int1() { return unknownV4Int1; }
        public long unknownV4Int2() { return unknownV4Int2; }
        public long unknownV4Int3() { return unknownV4Int3; }
        public float unknownV4Float1() { return unknownV4Float1; }
        public float unknownV4Float2() { return unknownV4Float2; }
        public float unknownV4Float3() { return unknownV4Float3; }
        public W3W3i _root() { return _root; }
        public W3W3i _parent() { return _parent; }
    }
    public static class ForcesChunk extends KaitaiStruct {
        public static ForcesChunk fromFile(String fileName) throws IOException {
            return new ForcesChunk(new ByteBufferKaitaiStream(fileName));
        }

        public ForcesChunk(KaitaiStream _io) {
            this(_io, null, null);
        }

        public ForcesChunk(KaitaiStream _io, W3W3i _parent) {
            this(_io, _parent, null);
        }

        public ForcesChunk(KaitaiStream _io, W3W3i _parent, W3W3i _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.numForce = this._io.readU4le();
            this.force = new ArrayList<Force>();
            for (int i = 0; i < numForce(); i++) {
                this.force.add(new Force(this._io, this, _root));
            }
        }
        private long numForce;
        private ArrayList<Force> force;
        private W3W3i _root;
        private W3W3i _parent;
        public long numForce() { return numForce; }
        public ArrayList<Force> force() { return force; }
        public W3W3i _root() { return _root; }
        public W3W3i _parent() { return _parent; }
    }
    public static class Flags extends KaitaiStruct {
        public static Flags fromFile(String fileName) throws IOException {
            return new Flags(new ByteBufferKaitaiStream(fileName));
        }

        public Flags(KaitaiStream _io) {
            this(_io, null, null);
        }

        public Flags(KaitaiStream _io, W3W3i _parent) {
            this(_io, _parent, null);
        }

        public Flags(KaitaiStream _io, W3W3i _parent, W3W3i _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.useCustomTechs = this._io.readBitsIntBe(1) != 0;
            this.useCustomTeams = this._io.readBitsIntBe(1) != 0;
            this.fixedPlayerParametersForCustomTeams = this._io.readBitsIntBe(1) != 0;
            this.unexploredAreasPartiallyVisible = this._io.readBitsIntBe(1) != 0;
            this.nonDefaultTilesetMapSizeLargeNeverBeenReducedToMedium = this._io.readBitsIntBe(1) != 0;
            this.melee = this._io.readBitsIntBe(1) != 0;
            this.changeAllyPriorities = this._io.readBitsIntBe(1) != 0;
            this.hideMinimapOnPreviewScreens = this._io.readBitsIntBe(1) != 0;
            this.useItemClassificationSystem = this._io.readBitsIntBe(1) != 0;
            this.tftRequired = this._io.readBitsIntBe(1) != 0;
            this.useTerrainFog = this._io.readBitsIntBe(1) != 0;
            this.showWaterWavesOnRollingShores = this._io.readBitsIntBe(1) != 0;
            this.showWaterWavesOnCliffShores = this._io.readBitsIntBe(1) != 0;
            this.mapPropertiesMenuOpenedAtLeastOnce = this._io.readBitsIntBe(1) != 0;
            this.useCustomUpgrades = this._io.readBitsIntBe(1) != 0;
            this.useCustomAbilities = this._io.readBitsIntBe(1) != 0;
            this.customWaterTintColor = this._io.readBitsIntBe(1) != 0;
            this.flag17 = this._io.readBitsIntBe(1) != 0;
            this.flag18 = this._io.readBitsIntBe(1) != 0;
            this.flag19 = this._io.readBitsIntBe(1) != 0;
            this.flag20 = this._io.readBitsIntBe(1) != 0;
            this.useCustomAbilitySkin = this._io.readBitsIntBe(1) != 0;
            this.useAccurateProbabilitiesForCalculation = this._io.readBitsIntBe(1) != 0;
            this.rest = new ArrayList<Boolean>();
            for (int i = 0; i < 8; i++) {
                this.rest.add(this._io.readBitsIntBe(1) != 0);
            }
        }
        private boolean useCustomTechs;
        private boolean useCustomTeams;
        private boolean fixedPlayerParametersForCustomTeams;
        private boolean unexploredAreasPartiallyVisible;
        private boolean nonDefaultTilesetMapSizeLargeNeverBeenReducedToMedium;
        private boolean melee;
        private boolean changeAllyPriorities;
        private boolean hideMinimapOnPreviewScreens;
        private boolean useItemClassificationSystem;
        private boolean tftRequired;
        private boolean useTerrainFog;
        private boolean showWaterWavesOnRollingShores;
        private boolean showWaterWavesOnCliffShores;
        private boolean mapPropertiesMenuOpenedAtLeastOnce;
        private boolean useCustomUpgrades;
        private boolean useCustomAbilities;
        private boolean customWaterTintColor;
        private boolean flag17;
        private boolean flag18;
        private boolean flag19;
        private boolean flag20;
        private boolean useCustomAbilitySkin;
        private boolean useAccurateProbabilitiesForCalculation;
        private ArrayList<Boolean> rest;
        private W3W3i _root;
        private W3W3i _parent;
        public boolean useCustomTechs() { return useCustomTechs; }
        public boolean useCustomTeams() { return useCustomTeams; }
        public boolean fixedPlayerParametersForCustomTeams() { return fixedPlayerParametersForCustomTeams; }
        public boolean unexploredAreasPartiallyVisible() { return unexploredAreasPartiallyVisible; }
        public boolean nonDefaultTilesetMapSizeLargeNeverBeenReducedToMedium() { return nonDefaultTilesetMapSizeLargeNeverBeenReducedToMedium; }
        public boolean melee() { return melee; }
        public boolean changeAllyPriorities() { return changeAllyPriorities; }
        public boolean hideMinimapOnPreviewScreens() { return hideMinimapOnPreviewScreens; }
        public boolean useItemClassificationSystem() { return useItemClassificationSystem; }
        public boolean tftRequired() { return tftRequired; }
        public boolean useTerrainFog() { return useTerrainFog; }
        public boolean showWaterWavesOnRollingShores() { return showWaterWavesOnRollingShores; }
        public boolean showWaterWavesOnCliffShores() { return showWaterWavesOnCliffShores; }
        public boolean mapPropertiesMenuOpenedAtLeastOnce() { return mapPropertiesMenuOpenedAtLeastOnce; }
        public boolean useCustomUpgrades() { return useCustomUpgrades; }
        public boolean useCustomAbilities() { return useCustomAbilities; }
        public boolean customWaterTintColor() { return customWaterTintColor; }
        public boolean flag17() { return flag17; }
        public boolean flag18() { return flag18; }
        public boolean flag19() { return flag19; }
        public boolean flag20() { return flag20; }
        public boolean useCustomAbilitySkin() { return useCustomAbilitySkin; }
        public boolean useAccurateProbabilitiesForCalculation() { return useAccurateProbabilitiesForCalculation; }
        public ArrayList<Boolean> rest() { return rest; }
        public W3W3i _root() { return _root; }
        public W3W3i _parent() { return _parent; }
    }
    public static class PlayersChunk extends KaitaiStruct {
        public static PlayersChunk fromFile(String fileName) throws IOException {
            return new PlayersChunk(new ByteBufferKaitaiStream(fileName));
        }

        public PlayersChunk(KaitaiStream _io) {
            this(_io, null, null);
        }

        public PlayersChunk(KaitaiStream _io, W3W3i _parent) {
            this(_io, _parent, null);
        }

        public PlayersChunk(KaitaiStream _io, W3W3i _parent, W3W3i _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.numPlayer = this._io.readU4le();
            this.player = new ArrayList<Player>();
            for (int i = 0; i < numPlayer(); i++) {
                this.player.add(new Player(this._io, this, _root));
            }
        }
        private long numPlayer;
        private ArrayList<Player> player;
        private W3W3i _root;
        private W3W3i _parent;
        public long numPlayer() { return numPlayer; }
        public ArrayList<Player> player() { return player; }
        public W3W3i _root() { return _root; }
        public W3W3i _parent() { return _parent; }
    }
    public static class UpgradesChunk extends KaitaiStruct {
        public static UpgradesChunk fromFile(String fileName) throws IOException {
            return new UpgradesChunk(new ByteBufferKaitaiStream(fileName));
        }

        public UpgradesChunk(KaitaiStream _io) {
            this(_io, null, null);
        }

        public UpgradesChunk(KaitaiStream _io, W3W3i _parent) {
            this(_io, _parent, null);
        }

        public UpgradesChunk(KaitaiStream _io, W3W3i _parent, W3W3i _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.numUpgrade = this._io.readU4le();
            this.upgrade = new ArrayList<Upgrade>();
            for (int i = 0; i < numUpgrade(); i++) {
                this.upgrade.add(new Upgrade(this._io, this, _root));
            }
        }
        private long numUpgrade;
        private ArrayList<Upgrade> upgrade;
        private W3W3i _root;
        private W3W3i _parent;
        public long numUpgrade() { return numUpgrade; }
        public ArrayList<Upgrade> upgrade() { return upgrade; }
        public W3W3i _root() { return _root; }
        public W3W3i _parent() { return _parent; }
    }
    public static class Margins extends KaitaiStruct {
        public static Margins fromFile(String fileName) throws IOException {
            return new Margins(new ByteBufferKaitaiStream(fileName));
        }

        public Margins(KaitaiStream _io) {
            this(_io, null, null);
        }

        public Margins(KaitaiStream _io, W3W3i _parent) {
            this(_io, _parent, null);
        }

        public Margins(KaitaiStream _io, W3W3i _parent, W3W3i _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.left = this._io.readU4le();
            this.right = this._io.readU4le();
            this.bottom = this._io.readU4le();
            this.top = this._io.readU4le();
        }
        private long left;
        private long right;
        private long bottom;
        private long top;
        private W3W3i _root;
        private W3W3i _parent;
        public long left() { return left; }
        public long right() { return right; }
        public long bottom() { return bottom; }
        public long top() { return top; }
        public W3W3i _root() { return _root; }
        public W3W3i _parent() { return _parent; }
    }
    public static class Fog extends KaitaiStruct {
        public static Fog fromFile(String fileName) throws IOException {
            return new Fog(new ByteBufferKaitaiStream(fileName));
        }

        public Fog(KaitaiStream _io) {
            this(_io, null, null);
        }

        public Fog(KaitaiStream _io, W3W3i _parent) {
            this(_io, _parent, null);
        }

        public Fog(KaitaiStream _io, W3W3i _parent, W3W3i _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.fogType = W3W3i.FogType.byId(this._io.readU4le());
            this.fogZStart = this._io.readF4le();
            this.fogZEnd = this._io.readF4le();
            this.fogDensity = this._io.readF4le();
            this.fogColorBlue = this._io.readU1();
            this.fogColorGreen = this._io.readU1();
            this.fogColorRed = this._io.readU1();
            this.fogColorAlpha = this._io.readU1();
        }
        private FogType fogType;
        private float fogZStart;
        private float fogZEnd;
        private float fogDensity;
        private int fogColorBlue;
        private int fogColorGreen;
        private int fogColorRed;
        private int fogColorAlpha;
        private W3W3i _root;
        private W3W3i _parent;
        public FogType fogType() { return fogType; }
        public float fogZStart() { return fogZStart; }
        public float fogZEnd() { return fogZEnd; }
        public float fogDensity() { return fogDensity; }
        public int fogColorBlue() { return fogColorBlue; }
        public int fogColorGreen() { return fogColorGreen; }
        public int fogColorRed() { return fogColorRed; }
        public int fogColorAlpha() { return fogColorAlpha; }
        public W3W3i _root() { return _root; }
        public W3W3i _parent() { return _parent; }
    }
    public static class RandomUnitTable extends KaitaiStruct {
        public static RandomUnitTable fromFile(String fileName) throws IOException {
            return new RandomUnitTable(new ByteBufferKaitaiStream(fileName));
        }

        public RandomUnitTable(KaitaiStream _io) {
            this(_io, null, null);
        }

        public RandomUnitTable(KaitaiStream _io, W3W3i.RandomUnitTablesChunk _parent) {
            this(_io, _parent, null);
        }

        public RandomUnitTable(KaitaiStream _io, W3W3i.RandomUnitTablesChunk _parent, W3W3i _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.num = this._io.readU4le();
            this.name = new W3str(this._io);
            this.numColumnType = this._io.readU4le();
            this.columnType = new ArrayList<Long>();
            for (int i = 0; i < numColumnType(); i++) {
                this.columnType.add(this._io.readU4le());
            }
            this.numRow = this._io.readU4le();
            this.row = new ArrayList<RandomUnitTableRow>();
            for (int i = 0; i < numRow(); i++) {
                this.row.add(new RandomUnitTableRow(this._io, this, _root));
            }
        }
        private long num;
        private W3str name;
        private long numColumnType;
        private ArrayList<Long> columnType;
        private long numRow;
        private ArrayList<RandomUnitTableRow> row;
        private W3W3i _root;
        private W3W3i.RandomUnitTablesChunk _parent;
        public long num() { return num; }
        public W3str name() { return name; }
        public long numColumnType() { return numColumnType; }
        public ArrayList<Long> columnType() { return columnType; }
        public long numRow() { return numRow; }
        public ArrayList<RandomUnitTableRow> row() { return row; }
        public W3W3i _root() { return _root; }
        public W3W3i.RandomUnitTablesChunk _parent() { return _parent; }
    }
    public static class Point2d extends KaitaiStruct {
        public static Point2d fromFile(String fileName) throws IOException {
            return new Point2d(new ByteBufferKaitaiStream(fileName));
        }

        public Point2d(KaitaiStream _io) {
            this(_io, null, null);
        }

        public Point2d(KaitaiStream _io, KaitaiStruct _parent) {
            this(_io, _parent, null);
        }

        public Point2d(KaitaiStream _io, KaitaiStruct _parent, W3W3i _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.x = this._io.readF4le();
            this.y = this._io.readF4le();
        }
        private float x;
        private float y;
        private W3W3i _root;
        private KaitaiStruct _parent;
        public float x() { return x; }
        public float y() { return y; }
        public W3W3i _root() { return _root; }
        public KaitaiStruct _parent() { return _parent; }
    }
    public static class TechsChunk extends KaitaiStruct {
        public static TechsChunk fromFile(String fileName) throws IOException {
            return new TechsChunk(new ByteBufferKaitaiStream(fileName));
        }

        public TechsChunk(KaitaiStream _io) {
            this(_io, null, null);
        }

        public TechsChunk(KaitaiStream _io, W3W3i _parent) {
            this(_io, _parent, null);
        }

        public TechsChunk(KaitaiStream _io, W3W3i _parent, W3W3i _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.numTech = this._io.readU4le();
            this.tech = new ArrayList<Tech>();
            for (int i = 0; i < numTech(); i++) {
                this.tech.add(new Tech(this._io, this, _root));
            }
        }
        private long numTech;
        private ArrayList<Tech> tech;
        private W3W3i _root;
        private W3W3i _parent;
        public long numTech() { return numTech; }
        public ArrayList<Tech> tech() { return tech; }
        public W3W3i _root() { return _root; }
        public W3W3i _parent() { return _parent; }
    }
    public static class ItemSet extends KaitaiStruct {
        public static ItemSet fromFile(String fileName) throws IOException {
            return new ItemSet(new ByteBufferKaitaiStream(fileName));
        }

        public ItemSet(KaitaiStream _io) {
            this(_io, null, null);
        }

        public ItemSet(KaitaiStream _io, W3W3i.RandomItemTable _parent) {
            this(_io, _parent, null);
        }

        public ItemSet(KaitaiStream _io, W3W3i.RandomItemTable _parent, W3W3i _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.numItem = this._io.readU4le();
            this.item = new ArrayList<Item>();
            for (int i = 0; i < numItem(); i++) {
                this.item.add(new Item(this._io, this, _root));
            }
        }
        private long numItem;
        private ArrayList<Item> item;
        private W3W3i _root;
        private W3W3i.RandomItemTable _parent;
        public long numItem() { return numItem; }
        public ArrayList<Item> item() { return item; }
        public W3W3i _root() { return _root; }
        public W3W3i.RandomItemTable _parent() { return _parent; }
    }
    public static class Player extends KaitaiStruct {
        public static Player fromFile(String fileName) throws IOException {
            return new Player(new ByteBufferKaitaiStream(fileName));
        }

        public Player(KaitaiStream _io) {
            this(_io, null, null);
        }

        public Player(KaitaiStream _io, W3W3i.PlayersChunk _parent) {
            this(_io, _parent, null);
        }

        public Player(KaitaiStream _io, W3W3i.PlayersChunk _parent, W3W3i _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.num = this._io.readU4le();
            this.controller = W3W3i.PlayerController.byId(this._io.readU4le());
            this.race = W3W3i.PlayerRace.byId(this._io.readU4le());
            this.fixedPosition = this._io.readU4le();
            this.name = new W3str(this._io);
            this.position = new Point2d(this._io, this, _root);
            if (_root().version() >= 5) {
                this.allyLowPriority = new PlayerBitmap(this._io, this, _root);
            }
            if (_root().version() >= 5) {
                this.allyHighPriority = new PlayerBitmap(this._io, this, _root);
            }
            if (_root().version() >= 31) {
                this.enemyLowPriority = new PlayerBitmap(this._io, this, _root);
            }
            if (_root().version() >= 31) {
                this.enemyHighPriority = new PlayerBitmap(this._io, this, _root);
            }
        }
        private long num;
        private PlayerController controller;
        private PlayerRace race;
        private long fixedPosition;
        private W3str name;
        private Point2d position;
        private PlayerBitmap allyLowPriority;
        private PlayerBitmap allyHighPriority;
        private PlayerBitmap enemyLowPriority;
        private PlayerBitmap enemyHighPriority;
        private W3W3i _root;
        private W3W3i.PlayersChunk _parent;
        public long num() { return num; }
        public PlayerController controller() { return controller; }
        public PlayerRace race() { return race; }
        public long fixedPosition() { return fixedPosition; }
        public W3str name() { return name; }
        public Point2d position() { return position; }
        public PlayerBitmap allyLowPriority() { return allyLowPriority; }
        public PlayerBitmap allyHighPriority() { return allyHighPriority; }
        public PlayerBitmap enemyLowPriority() { return enemyLowPriority; }
        public PlayerBitmap enemyHighPriority() { return enemyHighPriority; }
        public W3W3i _root() { return _root; }
        public W3W3i.PlayersChunk _parent() { return _parent; }
    }
    public static class RandomItemTable extends KaitaiStruct {
        public static RandomItemTable fromFile(String fileName) throws IOException {
            return new RandomItemTable(new ByteBufferKaitaiStream(fileName));
        }

        public RandomItemTable(KaitaiStream _io) {
            this(_io, null, null);
        }

        public RandomItemTable(KaitaiStream _io, W3W3i.RandomItemTablesChunk _parent) {
            this(_io, _parent, null);
        }

        public RandomItemTable(KaitaiStream _io, W3W3i.RandomItemTablesChunk _parent, W3W3i _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.num = this._io.readU4le();
            this.name = new W3str(this._io);
            this.numSet = this._io.readU4le();
            this.set = new ArrayList<ItemSet>();
            for (int i = 0; i < numSet(); i++) {
                this.set.add(new ItemSet(this._io, this, _root));
            }
        }
        private long num;
        private W3str name;
        private long numSet;
        private ArrayList<ItemSet> set;
        private W3W3i _root;
        private W3W3i.RandomItemTablesChunk _parent;
        public long num() { return num; }
        public W3str name() { return name; }
        public long numSet() { return numSet; }
        public ArrayList<ItemSet> set() { return set; }
        public W3W3i _root() { return _root; }
        public W3W3i.RandomItemTablesChunk _parent() { return _parent; }
    }
    public static class Tech extends KaitaiStruct {
        public static Tech fromFile(String fileName) throws IOException {
            return new Tech(new ByteBufferKaitaiStream(fileName));
        }

        public Tech(KaitaiStream _io) {
            this(_io, null, null);
        }

        public Tech(KaitaiStream _io, W3W3i.TechsChunk _parent) {
            this(_io, _parent, null);
        }

        public Tech(KaitaiStream _io, W3W3i.TechsChunk _parent, W3W3i _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.players = this._io.readU4le();
            this.id = new W3id(this._io);
        }
        private long players;
        private W3id id;
        private W3W3i _root;
        private W3W3i.TechsChunk _parent;
        public long players() { return players; }
        public W3id id() { return id; }
        public W3W3i _root() { return _root; }
        public W3W3i.TechsChunk _parent() { return _parent; }
    }
    public static class RandomUnitTableRow extends KaitaiStruct {
        public static RandomUnitTableRow fromFile(String fileName) throws IOException {
            return new RandomUnitTableRow(new ByteBufferKaitaiStream(fileName));
        }

        public RandomUnitTableRow(KaitaiStream _io) {
            this(_io, null, null);
        }

        public RandomUnitTableRow(KaitaiStream _io, W3W3i.RandomUnitTable _parent) {
            this(_io, _parent, null);
        }

        public RandomUnitTableRow(KaitaiStream _io, W3W3i.RandomUnitTable _parent, W3W3i _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.chance = new ArrayList<Long>();
            for (int i = 0; i < _parent().numColumnType(); i++) {
                this.chance.add(this._io.readU4le());
            }
        }
        private ArrayList<Long> chance;
        private W3W3i _root;
        private W3W3i.RandomUnitTable _parent;
        public ArrayList<Long> chance() { return chance; }
        public W3W3i _root() { return _root; }
        public W3W3i.RandomUnitTable _parent() { return _parent; }
    }
    public static class RandomItemTablesChunk extends KaitaiStruct {
        public static RandomItemTablesChunk fromFile(String fileName) throws IOException {
            return new RandomItemTablesChunk(new ByteBufferKaitaiStream(fileName));
        }

        public RandomItemTablesChunk(KaitaiStream _io) {
            this(_io, null, null);
        }

        public RandomItemTablesChunk(KaitaiStream _io, W3W3i _parent) {
            this(_io, _parent, null);
        }

        public RandomItemTablesChunk(KaitaiStream _io, W3W3i _parent, W3W3i _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.numTable = this._io.readU4le();
            this.table = new ArrayList<RandomItemTable>();
            for (int i = 0; i < numTable(); i++) {
                this.table.add(new RandomItemTable(this._io, this, _root));
            }
        }
        private long numTable;
        private ArrayList<RandomItemTable> table;
        private W3W3i _root;
        private W3W3i _parent;
        public long numTable() { return numTable; }
        public ArrayList<RandomItemTable> table() { return table; }
        public W3W3i _root() { return _root; }
        public W3W3i _parent() { return _parent; }
    }
    public static class PrologueScreen extends KaitaiStruct {
        public static PrologueScreen fromFile(String fileName) throws IOException {
            return new PrologueScreen(new ByteBufferKaitaiStream(fileName));
        }

        public PrologueScreen(KaitaiStream _io) {
            this(_io, null, null);
        }

        public PrologueScreen(KaitaiStream _io, W3W3i _parent) {
            this(_io, _parent, null);
        }

        public PrologueScreen(KaitaiStream _io, W3W3i _parent, W3W3i _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            if (_root().version() >= 18) {
                this.prologueScreenPath = new W3str(this._io);
            }
            this.prologueScreenText = new W3str(this._io);
            this.prologueScreenTitle = new W3str(this._io);
            this.prologueScreenSubtitle = new W3str(this._io);
        }
        private W3str prologueScreenPath;
        private W3str prologueScreenText;
        private W3str prologueScreenTitle;
        private W3str prologueScreenSubtitle;
        private W3W3i _root;
        private W3W3i _parent;
        public W3str prologueScreenPath() { return prologueScreenPath; }
        public W3str prologueScreenText() { return prologueScreenText; }
        public W3str prologueScreenTitle() { return prologueScreenTitle; }
        public W3str prologueScreenSubtitle() { return prologueScreenSubtitle; }
        public W3W3i _root() { return _root; }
        public W3W3i _parent() { return _parent; }
    }
    public static class Upgrade extends KaitaiStruct {
        public static Upgrade fromFile(String fileName) throws IOException {
            return new Upgrade(new ByteBufferKaitaiStream(fileName));
        }

        public Upgrade(KaitaiStream _io) {
            this(_io, null, null);
        }

        public Upgrade(KaitaiStream _io, W3W3i.UpgradesChunk _parent) {
            this(_io, _parent, null);
        }

        public Upgrade(KaitaiStream _io, W3W3i.UpgradesChunk _parent, W3W3i _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.players = this._io.readU4le();
            this.id = new W3id(this._io);
            this.level = this._io.readU4le();
            this.availability = this._io.readU4le();
        }
        private long players;
        private W3id id;
        private long level;
        private long availability;
        private W3W3i _root;
        private W3W3i.UpgradesChunk _parent;
        public long players() { return players; }
        public W3id id() { return id; }
        public long level() { return level; }
        public long availability() { return availability; }
        public W3W3i _root() { return _root; }
        public W3W3i.UpgradesChunk _parent() { return _parent; }
    }
    public static class ForceFlags extends KaitaiStruct {
        public static ForceFlags fromFile(String fileName) throws IOException {
            return new ForceFlags(new ByteBufferKaitaiStream(fileName));
        }

        public ForceFlags(KaitaiStream _io) {
            this(_io, null, null);
        }

        public ForceFlags(KaitaiStream _io, W3W3i.Force _parent) {
            this(_io, _parent, null);
        }

        public ForceFlags(KaitaiStream _io, W3W3i.Force _parent, W3W3i _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.flag7 = this._io.readBitsIntBe(1) != 0;
            this.flag6 = this._io.readBitsIntBe(1) != 0;
            this.flag5 = this._io.readBitsIntBe(1) != 0;
            this.shareAdvancedUnitControl = this._io.readBitsIntBe(1) != 0;
            this.shareUnitControl = this._io.readBitsIntBe(1) != 0;
            this.shareVision = this._io.readBitsIntBe(1) != 0;
            this.alliedVictory = this._io.readBitsIntBe(1) != 0;
            this.allied = this._io.readBitsIntBe(1) != 0;
            this._io.alignToByte();
            this.rest = new ArrayList<Integer>();
            for (int i = 0; i < 3; i++) {
                this.rest.add(this._io.readU1());
            }
        }
        private boolean flag7;
        private boolean flag6;
        private boolean flag5;
        private boolean shareAdvancedUnitControl;
        private boolean shareUnitControl;
        private boolean shareVision;
        private boolean alliedVictory;
        private boolean allied;
        private ArrayList<Integer> rest;
        private W3W3i _root;
        private W3W3i.Force _parent;
        public boolean flag7() { return flag7; }
        public boolean flag6() { return flag6; }
        public boolean flag5() { return flag5; }
        public boolean shareAdvancedUnitControl() { return shareAdvancedUnitControl; }
        public boolean shareUnitControl() { return shareUnitControl; }
        public boolean shareVision() { return shareVision; }
        public boolean alliedVictory() { return alliedVictory; }
        public boolean allied() { return allied; }
        public ArrayList<Integer> rest() { return rest; }
        public W3W3i _root() { return _root; }
        public W3W3i.Force _parent() { return _parent; }
    }
    public static class GameVersion extends KaitaiStruct {
        public static GameVersion fromFile(String fileName) throws IOException {
            return new GameVersion(new ByteBufferKaitaiStream(fileName));
        }

        public GameVersion(KaitaiStream _io) {
            this(_io, null, null);
        }

        public GameVersion(KaitaiStream _io, W3W3i _parent) {
            this(_io, _parent, null);
        }

        public GameVersion(KaitaiStream _io, W3W3i _parent, W3W3i _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.major = this._io.readU4le();
            this.minor = this._io.readU4le();
            this.revision = this._io.readU4le();
            this.build = this._io.readU4le();
        }
        private long major;
        private long minor;
        private long revision;
        private long build;
        private W3W3i _root;
        private W3W3i _parent;
        public long major() { return major; }
        public long minor() { return minor; }
        public long revision() { return revision; }
        public long build() { return build; }
        public W3W3i _root() { return _root; }
        public W3W3i _parent() { return _parent; }
    }
    public static class LoadingScreen extends KaitaiStruct {
        public static LoadingScreen fromFile(String fileName) throws IOException {
            return new LoadingScreen(new ByteBufferKaitaiStream(fileName));
        }

        public LoadingScreen(KaitaiStream _io) {
            this(_io, null, null);
        }

        public LoadingScreen(KaitaiStream _io, W3W3i _parent) {
            this(_io, _parent, null);
        }

        public LoadingScreen(KaitaiStream _io, W3W3i _parent, W3W3i _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            if (_root().version() >= 17) {
                this.loadingScreenIndex = this._io.readS4le();
            }
            if ( ((_root().version() >= 10) && (_root().version() != 18) && (_root().version() != 19)) ) {
                this.customLoadingScreenPath = new W3str(this._io);
            }
            if (_root().version() >= 10) {
                this.loadingScreenText = new W3str(this._io);
            }
            if (_root().version() >= 11) {
                this.loadingScreenTitle = new W3str(this._io);
            }
            if (_root().version() >= 11) {
                this.loadingScreenSubtitle = new W3str(this._io);
            }
        }
        private Integer loadingScreenIndex;
        private W3str customLoadingScreenPath;
        private W3str loadingScreenText;
        private W3str loadingScreenTitle;
        private W3str loadingScreenSubtitle;
        private W3W3i _root;
        private W3W3i _parent;
        public Integer loadingScreenIndex() { return loadingScreenIndex; }
        public W3str customLoadingScreenPath() { return customLoadingScreenPath; }
        public W3str loadingScreenText() { return loadingScreenText; }
        public W3str loadingScreenTitle() { return loadingScreenTitle; }
        public W3str loadingScreenSubtitle() { return loadingScreenSubtitle; }
        public W3W3i _root() { return _root; }
        public W3W3i _parent() { return _parent; }
    }
    public static class RandomUnitTablesChunk extends KaitaiStruct {
        public static RandomUnitTablesChunk fromFile(String fileName) throws IOException {
            return new RandomUnitTablesChunk(new ByteBufferKaitaiStream(fileName));
        }

        public RandomUnitTablesChunk(KaitaiStream _io) {
            this(_io, null, null);
        }

        public RandomUnitTablesChunk(KaitaiStream _io, W3W3i _parent) {
            this(_io, _parent, null);
        }

        public RandomUnitTablesChunk(KaitaiStream _io, W3W3i _parent, W3W3i _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.numTable = this._io.readU4le();
            this.table = new ArrayList<RandomUnitTable>();
            for (int i = 0; i < numTable(); i++) {
                this.table.add(new RandomUnitTable(this._io, this, _root));
            }
        }
        private long numTable;
        private ArrayList<RandomUnitTable> table;
        private W3W3i _root;
        private W3W3i _parent;
        public long numTable() { return numTable; }
        public ArrayList<RandomUnitTable> table() { return table; }
        public W3W3i _root() { return _root; }
        public W3W3i _parent() { return _parent; }
    }
    public static class Item extends KaitaiStruct {
        public static Item fromFile(String fileName) throws IOException {
            return new Item(new ByteBufferKaitaiStream(fileName));
        }

        public Item(KaitaiStream _io) {
            this(_io, null, null);
        }

        public Item(KaitaiStream _io, W3W3i.ItemSet _parent) {
            this(_io, _parent, null);
        }

        public Item(KaitaiStream _io, W3W3i.ItemSet _parent, W3W3i _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.chance = this._io.readU4le();
            this.id = new W3id(this._io);
        }
        private long chance;
        private W3id id;
        private W3W3i _root;
        private W3W3i.ItemSet _parent;

        /**
         * Chance this item will be rolled.
         */
        public long chance() { return chance; }

        /**
         * FourCC of the item, can be iRND for random item.
         */
        public W3id id() { return id; }
        public W3W3i _root() { return _root; }
        public W3W3i.ItemSet _parent() { return _parent; }
    }
    private String mapName;

    /**
     * Name of the map.
     */
    public String mapName() {
        if (this.mapName != null)
            return this.mapName;
        this.mapName = mapNameRaw().value();
        return this.mapName;
    }
    private long version;
    private Long saves;
    private Long editorVersion;
    private GameVersion gameVersion;
    private W3str mapNameRaw;
    private W3str author;
    private W3str recommendedPlayers;
    private UnknownV0ToV3 unknownV0ToV3;
    private UnknownV4ToV8 unknownV4ToV8;
    private W3str unknownString;
    private CameraBounds cameraBounds;
    private Margins margins;
    private Long mapWidth;
    private Long mapHeight;
    private Long unknownV3Int1;
    private Flags flags;
    private Tileset tileset;
    private LoadingScreen loadingScreen;
    private GameDataSet gameDataSet;
    private W3str unknownPath;
    private PrologueScreen prologueScreen;
    private Fog fog;
    private W3id globalWeatherId;
    private W3str soundEnvironment;
    private W3char lightEnvironment;
    private WaterColor waterColor;
    private ScriptLanguage scriptLanguage;
    private GraphicsModes supportedGraphicsModes;
    private GameDataVersion gameDataVersion;
    private PlayersChunk playersChunk;
    private ForcesChunk forcesChunk;
    private UpgradesChunk upgradesChunk;
    private TechsChunk techsChunk;
    private RandomUnitTablesChunk randomUnitTablesChunk;
    private RandomItemTablesChunk randomItemTablesChunk;
    private Long scriptLanguage2;
    private W3W3i _root;
    private KaitaiStruct _parent;
    private byte[] _raw_supportedGraphicsModes;

    /**
     * The version of the format.
     */
    public long version() { return version; }

    /**
     * How many times the map was saved in the editor.
     */
    public Long saves() { return saves; }

    /**
     * What version of the editor was used to make this file.
     */
    public Long editorVersion() { return editorVersion; }

    /**
     * For what version of the game this file was made.
     */
    public GameVersion gameVersion() { return gameVersion; }
    public W3str mapNameRaw() { return mapNameRaw; }
    public W3str author() { return author; }
    public W3str recommendedPlayers() { return recommendedPlayers; }
    public UnknownV0ToV3 unknownV0ToV3() { return unknownV0ToV3; }
    public UnknownV4ToV8 unknownV4ToV8() { return unknownV4ToV8; }
    public W3str unknownString() { return unknownString; }
    public CameraBounds cameraBounds() { return cameraBounds; }
    public Margins margins() { return margins; }
    public Long mapWidth() { return mapWidth; }
    public Long mapHeight() { return mapHeight; }
    public Long unknownV3Int1() { return unknownV3Int1; }
    public Flags flags() { return flags; }
    public Tileset tileset() { return tileset; }
    public LoadingScreen loadingScreen() { return loadingScreen; }
    public GameDataSet gameDataSet() { return gameDataSet; }
    public W3str unknownPath() { return unknownPath; }
    public PrologueScreen prologueScreen() { return prologueScreen; }
    public Fog fog() { return fog; }
    public W3id globalWeatherId() { return globalWeatherId; }
    public W3str soundEnvironment() { return soundEnvironment; }
    public W3char lightEnvironment() { return lightEnvironment; }
    public WaterColor waterColor() { return waterColor; }
    public ScriptLanguage scriptLanguage() { return scriptLanguage; }
    public GraphicsModes supportedGraphicsModes() { return supportedGraphicsModes; }
    public GameDataVersion gameDataVersion() { return gameDataVersion; }
    public PlayersChunk playersChunk() { return playersChunk; }
    public ForcesChunk forcesChunk() { return forcesChunk; }
    public UpgradesChunk upgradesChunk() { return upgradesChunk; }
    public TechsChunk techsChunk() { return techsChunk; }
    public RandomUnitTablesChunk randomUnitTablesChunk() { return randomUnitTablesChunk; }
    public RandomItemTablesChunk randomItemTablesChunk() { return randomItemTablesChunk; }
    public Long scriptLanguage2() { return scriptLanguage2; }
    public W3W3i _root() { return _root; }
    public KaitaiStruct _parent() { return _parent; }
    public byte[] _raw_supportedGraphicsModes() { return _raw_supportedGraphicsModes; }
}
