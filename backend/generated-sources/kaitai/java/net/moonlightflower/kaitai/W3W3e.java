// This is a generated file! Please edit source .ksy file and use kaitai-struct-compiler to rebuild

package net.moonlightflower.kaitai;

import io.kaitai.struct.ByteBufferKaitaiStream;
import io.kaitai.struct.KaitaiStruct;
import io.kaitai.struct.KaitaiStream;
import java.io.IOException;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;

public class W3W3e extends KaitaiStruct {
    public static W3W3e fromFile(String fileName) throws IOException {
        return new W3W3e(new ByteBufferKaitaiStream(fileName));
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

    public W3W3e(KaitaiStream _io) {
        this(_io, null, null);
    }

    public W3W3e(KaitaiStream _io, KaitaiStruct _parent) {
        this(_io, _parent, null);
    }

    public W3W3e(KaitaiStream _io, KaitaiStruct _parent, W3W3e _root) {
        super(_io);
        this._parent = _parent;
        this._root = _root == null ? this : _root;
        _read();
    }
    private void _read() {
        this.fileId = new W3id(this._io);
        this.version = this._io.readU4le();
        this.tileset = Tileset.byId(this._io.readU1());
        this.useCustomTileset = this._io.readU4le();
        this.numTileId = this._io.readU4le();
        this.tileId = new ArrayList<W3id>();
        for (int i = 0; i < numTileId(); i++) {
            this.tileId.add(new W3id(this._io));
        }
        this.numCliffTileId = this._io.readU4le();
        this.cliffTileId = new ArrayList<W3id>();
        for (int i = 0; i < numCliffTileId(); i++) {
            this.cliffTileId.add(new W3id(this._io));
        }
        this.mapWidth = this._io.readU4le();
        this.mapHeight = this._io.readU4le();
        this.centerOffsetX = this._io.readF4le();
        this.centerOffsetY = this._io.readF4le();
        this.tileNode = new ArrayList<TileNode>();
        for (int i = 0; i < (mapWidth() * mapHeight()); i++) {
            this.tileNode.add(new TileNode(this._io, this, _root));
        }
    }
    public static class TileNode extends KaitaiStruct {
        public static TileNode fromFile(String fileName) throws IOException {
            return new TileNode(new ByteBufferKaitaiStream(fileName));
        }

        public TileNode(KaitaiStream _io) {
            this(_io, null, null);
        }

        public TileNode(KaitaiStream _io, W3W3e _parent) {
            this(_io, _parent, null);
        }

        public TileNode(KaitaiStream _io, W3W3e _parent, W3W3e _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.groundHeight = this._io.readU2le();
            this.waterHeightAndBoundary = new WaterHeightAndBoundary(this._io, this, _root);
            this.flagsAndGroundTexture = new FlagsAndGroundTexture(this._io, this, _root);
            this.groundAndCliffVariation = this._io.readU1();
            this.cliffTextureAndLayerHeight = new CliffTextureAndLayerHeight(this._io, this, _root);
        }
        private int groundHeight;
        private WaterHeightAndBoundary waterHeightAndBoundary;
        private FlagsAndGroundTexture flagsAndGroundTexture;
        private int groundAndCliffVariation;
        private CliffTextureAndLayerHeight cliffTextureAndLayerHeight;
        private W3W3e _root;
        private W3W3e _parent;
        public int groundHeight() { return groundHeight; }
        public WaterHeightAndBoundary waterHeightAndBoundary() { return waterHeightAndBoundary; }
        public FlagsAndGroundTexture flagsAndGroundTexture() { return flagsAndGroundTexture; }
        public int groundAndCliffVariation() { return groundAndCliffVariation; }
        public CliffTextureAndLayerHeight cliffTextureAndLayerHeight() { return cliffTextureAndLayerHeight; }
        public W3W3e _root() { return _root; }
        public W3W3e _parent() { return _parent; }
    }
    public static class WaterHeightAndBoundary extends KaitaiStruct {
        public static WaterHeightAndBoundary fromFile(String fileName) throws IOException {
            return new WaterHeightAndBoundary(new ByteBufferKaitaiStream(fileName));
        }

        public WaterHeightAndBoundary(KaitaiStream _io) {
            this(_io, null, null);
        }

        public WaterHeightAndBoundary(KaitaiStream _io, W3W3e.TileNode _parent) {
            this(_io, _parent, null);
        }

        public WaterHeightAndBoundary(KaitaiStream _io, W3W3e.TileNode _parent, W3W3e _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.waterHeight = this._io.readBitsIntBe(15);
            this.flag = this._io.readBitsIntBe(1) != 0;
        }
        private long waterHeight;
        private boolean flag;
        private W3W3e _root;
        private W3W3e.TileNode _parent;
        public long waterHeight() { return waterHeight; }
        public boolean flag() { return flag; }
        public W3W3e _root() { return _root; }
        public W3W3e.TileNode _parent() { return _parent; }
    }
    public static class FlagsAndGroundTexture extends KaitaiStruct {
        public static FlagsAndGroundTexture fromFile(String fileName) throws IOException {
            return new FlagsAndGroundTexture(new ByteBufferKaitaiStream(fileName));
        }

        public FlagsAndGroundTexture(KaitaiStream _io) {
            this(_io, null, null);
        }

        public FlagsAndGroundTexture(KaitaiStream _io, W3W3e.TileNode _parent) {
            this(_io, _parent, null);
        }

        public FlagsAndGroundTexture(KaitaiStream _io, W3W3e.TileNode _parent, W3W3e _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.boundary2 = this._io.readBitsIntBe(1) != 0;
            this.water = this._io.readBitsIntBe(1) != 0;
            this.blight = this._io.readBitsIntBe(1) != 0;
            this.ramp = this._io.readBitsIntBe(1) != 0;
            this.texture = this._io.readBitsIntBe(4);
        }
        private boolean boundary2;
        private boolean water;
        private boolean blight;
        private boolean ramp;
        private long texture;
        private W3W3e _root;
        private W3W3e.TileNode _parent;
        public boolean boundary2() { return boundary2; }
        public boolean water() { return water; }
        public boolean blight() { return blight; }
        public boolean ramp() { return ramp; }
        public long texture() { return texture; }
        public W3W3e _root() { return _root; }
        public W3W3e.TileNode _parent() { return _parent; }
    }
    public static class CliffTextureAndLayerHeight extends KaitaiStruct {
        public static CliffTextureAndLayerHeight fromFile(String fileName) throws IOException {
            return new CliffTextureAndLayerHeight(new ByteBufferKaitaiStream(fileName));
        }

        public CliffTextureAndLayerHeight(KaitaiStream _io) {
            this(_io, null, null);
        }

        public CliffTextureAndLayerHeight(KaitaiStream _io, W3W3e.TileNode _parent) {
            this(_io, _parent, null);
        }

        public CliffTextureAndLayerHeight(KaitaiStream _io, W3W3e.TileNode _parent, W3W3e _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.layer = this._io.readBitsIntBe(4);
            this.texture = this._io.readBitsIntBe(4);
        }
        private long layer;
        private long texture;
        private W3W3e _root;
        private W3W3e.TileNode _parent;
        public long layer() { return layer; }
        public long texture() { return texture; }
        public W3W3e _root() { return _root; }
        public W3W3e.TileNode _parent() { return _parent; }
    }
    private W3id fileId;
    private long version;
    private Tileset tileset;
    private long useCustomTileset;
    private long numTileId;
    private ArrayList<W3id> tileId;
    private long numCliffTileId;
    private ArrayList<W3id> cliffTileId;
    private long mapWidth;
    private long mapHeight;
    private float centerOffsetX;
    private float centerOffsetY;
    private ArrayList<TileNode> tileNode;
    private W3W3e _root;
    private KaitaiStruct _parent;
    public W3id fileId() { return fileId; }
    public long version() { return version; }
    public Tileset tileset() { return tileset; }
    public long useCustomTileset() { return useCustomTileset; }
    public long numTileId() { return numTileId; }
    public ArrayList<W3id> tileId() { return tileId; }
    public long numCliffTileId() { return numCliffTileId; }
    public ArrayList<W3id> cliffTileId() { return cliffTileId; }
    public long mapWidth() { return mapWidth; }
    public long mapHeight() { return mapHeight; }
    public float centerOffsetX() { return centerOffsetX; }
    public float centerOffsetY() { return centerOffsetY; }
    public ArrayList<TileNode> tileNode() { return tileNode; }
    public W3W3e _root() { return _root; }
    public KaitaiStruct _parent() { return _parent; }
}
