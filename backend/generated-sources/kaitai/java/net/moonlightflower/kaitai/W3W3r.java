// This is a generated file! Please edit source .ksy file and use kaitai-struct-compiler to rebuild

package net.moonlightflower.kaitai;

import io.kaitai.struct.ByteBufferKaitaiStream;
import io.kaitai.struct.KaitaiStruct;
import io.kaitai.struct.KaitaiStream;
import java.io.IOException;
import java.util.ArrayList;

public class W3W3r extends KaitaiStruct {
    public static W3W3r fromFile(String fileName) throws IOException {
        return new W3W3r(new ByteBufferKaitaiStream(fileName));
    }

    public W3W3r(KaitaiStream _io) {
        this(_io, null, null);
    }

    public W3W3r(KaitaiStream _io, KaitaiStruct _parent) {
        this(_io, _parent, null);
    }

    public W3W3r(KaitaiStream _io, KaitaiStruct _parent, W3W3r _root) {
        super(_io);
        this._parent = _parent;
        this._root = _root == null ? this : _root;
        _read();
    }
    private void _read() {
        this.version = this._io.readU4le();
        this.numRegion = this._io.readU4le();
        this.region = new ArrayList<Region>();
        for (int i = 0; i < numRegion(); i++) {
            this.region.add(new Region(this._io, this, _root));
        }
    }
    public static class Region extends KaitaiStruct {
        public static Region fromFile(String fileName) throws IOException {
            return new Region(new ByteBufferKaitaiStream(fileName));
        }

        public Region(KaitaiStream _io) {
            this(_io, null, null);
        }

        public Region(KaitaiStream _io, W3W3r _parent) {
            this(_io, _parent, null);
        }

        public Region(KaitaiStream _io, W3W3r _parent, W3W3r _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.left = this._io.readF4le();
            this.bottom = this._io.readF4le();
            this.right = this._io.readF4le();
            this.top = this._io.readF4le();
            this.name = new W3str(this._io);
            this.id = this._io.readU4le();
            this.weatherId = new W3id(this._io);
            this.ambientSound = new W3str(this._io);
            this.colorBlue = this._io.readU1();
            this.colorGreen = this._io.readU1();
            this.colorRed = this._io.readU1();
            this.endToken = this._io.readU1();
        }
        private float left;
        private float bottom;
        private float right;
        private float top;
        private W3str name;
        private long id;
        private W3id weatherId;
        private W3str ambientSound;
        private int colorBlue;
        private int colorGreen;
        private int colorRed;
        private int endToken;
        private W3W3r _root;
        private W3W3r _parent;
        public float left() { return left; }
        public float bottom() { return bottom; }
        public float right() { return right; }
        public float top() { return top; }
        public W3str name() { return name; }
        public long id() { return id; }
        public W3id weatherId() { return weatherId; }
        public W3str ambientSound() { return ambientSound; }
        public int colorBlue() { return colorBlue; }
        public int colorGreen() { return colorGreen; }
        public int colorRed() { return colorRed; }
        public int endToken() { return endToken; }
        public W3W3r _root() { return _root; }
        public W3W3r _parent() { return _parent; }
    }
    private long version;
    private long numRegion;
    private ArrayList<Region> region;
    private W3W3r _root;
    private KaitaiStruct _parent;
    public long version() { return version; }
    public long numRegion() { return numRegion; }
    public ArrayList<Region> region() { return region; }
    public W3W3r _root() { return _root; }
    public KaitaiStruct _parent() { return _parent; }
}
