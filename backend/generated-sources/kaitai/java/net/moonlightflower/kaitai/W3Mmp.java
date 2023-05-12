// This is a generated file! Please edit source .ksy file and use kaitai-struct-compiler to rebuild

package net.moonlightflower.kaitai;

import io.kaitai.struct.ByteBufferKaitaiStream;
import io.kaitai.struct.KaitaiStruct;
import io.kaitai.struct.KaitaiStream;
import java.io.IOException;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;

public class W3Mmp extends KaitaiStruct {
    public static W3Mmp fromFile(String fileName) throws IOException {
        return new W3Mmp(new ByteBufferKaitaiStream(fileName));
    }

    public enum IconType {
        GOLD_MINE(0),
        HOUSE(1),
        PLAYER_START(2),
        NEUTRAL(3),
        NEUTRAL_SMALL(4);

        private final long id;
        IconType(long id) { this.id = id; }
        public long id() { return id; }
        private static final Map<Long, IconType> byId = new HashMap<Long, IconType>(5);
        static {
            for (IconType e : IconType.values())
                byId.put(e.id(), e);
        }
        public static IconType byId(long id) { return byId.get(id); }
    }

    public W3Mmp(KaitaiStream _io) {
        this(_io, null, null);
    }

    public W3Mmp(KaitaiStream _io, KaitaiStruct _parent) {
        this(_io, _parent, null);
    }

    public W3Mmp(KaitaiStream _io, KaitaiStruct _parent, W3Mmp _root) {
        super(_io);
        this._parent = _parent;
        this._root = _root == null ? this : _root;
        _read();
    }
    private void _read() {
        this.version = this._io.readU4le();
        this.iconsChunk = new IconsChunk(this._io, this, _root);
    }
    public static class IconsChunk extends KaitaiStruct {
        public static IconsChunk fromFile(String fileName) throws IOException {
            return new IconsChunk(new ByteBufferKaitaiStream(fileName));
        }

        public IconsChunk(KaitaiStream _io) {
            this(_io, null, null);
        }

        public IconsChunk(KaitaiStream _io, W3Mmp _parent) {
            this(_io, _parent, null);
        }

        public IconsChunk(KaitaiStream _io, W3Mmp _parent, W3Mmp _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.numIcon = this._io.readU4le();
            this.icon = new ArrayList<Icon>();
            for (int i = 0; i < numIcon(); i++) {
                this.icon.add(new Icon(this._io, this, _root));
            }
        }
        private long numIcon;
        private ArrayList<Icon> icon;
        private W3Mmp _root;
        private W3Mmp _parent;
        public long numIcon() { return numIcon; }
        public ArrayList<Icon> icon() { return icon; }
        public W3Mmp _root() { return _root; }
        public W3Mmp _parent() { return _parent; }
    }
    public static class Icon extends KaitaiStruct {
        public static Icon fromFile(String fileName) throws IOException {
            return new Icon(new ByteBufferKaitaiStream(fileName));
        }

        public Icon(KaitaiStream _io) {
            this(_io, null, null);
        }

        public Icon(KaitaiStream _io, W3Mmp.IconsChunk _parent) {
            this(_io, _parent, null);
        }

        public Icon(KaitaiStream _io, W3Mmp.IconsChunk _parent, W3Mmp _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.iconType = W3Mmp.IconType.byId(this._io.readU4le());
            this.x = this._io.readU4le();
            this.y = this._io.readU4le();
            this.color = new Color(this._io, this, _root);
        }
        private IconType iconType;
        private long x;
        private long y;
        private Color color;
        private W3Mmp _root;
        private W3Mmp.IconsChunk _parent;
        public IconType iconType() { return iconType; }
        public long x() { return x; }
        public long y() { return y; }
        public Color color() { return color; }
        public W3Mmp _root() { return _root; }
        public W3Mmp.IconsChunk _parent() { return _parent; }
    }
    public static class Color extends KaitaiStruct {
        public static Color fromFile(String fileName) throws IOException {
            return new Color(new ByteBufferKaitaiStream(fileName));
        }

        public Color(KaitaiStream _io) {
            this(_io, null, null);
        }

        public Color(KaitaiStream _io, W3Mmp.Icon _parent) {
            this(_io, _parent, null);
        }

        public Color(KaitaiStream _io, W3Mmp.Icon _parent, W3Mmp _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.blue = this._io.readU1();
            this.green = this._io.readU1();
            this.red = this._io.readU1();
            this.alpha = this._io.readU1();
        }
        private int blue;
        private int green;
        private int red;
        private int alpha;
        private W3Mmp _root;
        private W3Mmp.Icon _parent;
        public int blue() { return blue; }
        public int green() { return green; }
        public int red() { return red; }
        public int alpha() { return alpha; }
        public W3Mmp _root() { return _root; }
        public W3Mmp.Icon _parent() { return _parent; }
    }
    private long version;
    private IconsChunk iconsChunk;
    private W3Mmp _root;
    private KaitaiStruct _parent;
    public long version() { return version; }
    public IconsChunk iconsChunk() { return iconsChunk; }
    public W3Mmp _root() { return _root; }
    public KaitaiStruct _parent() { return _parent; }
}
