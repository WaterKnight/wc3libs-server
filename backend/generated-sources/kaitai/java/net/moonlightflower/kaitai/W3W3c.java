// This is a generated file! Please edit source .ksy file and use kaitai-struct-compiler to rebuild

package net.moonlightflower.kaitai;

import io.kaitai.struct.ByteBufferKaitaiStream;
import io.kaitai.struct.KaitaiStruct;
import io.kaitai.struct.KaitaiStream;
import java.io.IOException;
import java.util.ArrayList;

public class W3W3c extends KaitaiStruct {
    public static W3W3c fromFile(String fileName) throws IOException {
        return new W3W3c(new ByteBufferKaitaiStream(fileName));
    }

    public W3W3c(KaitaiStream _io) {
        this(_io, null, null);
    }

    public W3W3c(KaitaiStream _io, KaitaiStruct _parent) {
        this(_io, _parent, null);
    }

    public W3W3c(KaitaiStream _io, KaitaiStruct _parent, W3W3c _root) {
        super(_io);
        this._parent = _parent;
        this._root = _root == null ? this : _root;
        _read();
    }
    private void _read() {
        this.version = this._io.readU4le();
        this.numCamera = this._io.readU4le();
        this.camera = new ArrayList<Camera>();
        for (int i = 0; i < numCamera(); i++) {
            this.camera.add(new Camera(this._io, this, _root));
        }
    }
    public static class Camera extends KaitaiStruct {
        public static Camera fromFile(String fileName) throws IOException {
            return new Camera(new ByteBufferKaitaiStream(fileName));
        }

        public Camera(KaitaiStream _io) {
            this(_io, null, null);
        }

        public Camera(KaitaiStream _io, W3W3c _parent) {
            this(_io, _parent, null);
        }

        public Camera(KaitaiStream _io, W3W3c _parent, W3W3c _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.targetX = this._io.readF4le();
            this.targetY = this._io.readF4le();
            this.targetZ = this._io.readF4le();
            this.angle = this._io.readF4le();
            this.angleOfAttack = this._io.readF4le();
            this.distance = this._io.readF4le();
            this.roll = this._io.readF4le();
            this.fieldOfView = this._io.readF4le();
            this.farClipping = this._io.readF4le();
            this.unknown = this._io.readF4le();
            this.name = new W3str(this._io);
        }
        private float targetX;
        private float targetY;
        private float targetZ;
        private float angle;
        private float angleOfAttack;
        private float distance;
        private float roll;
        private float fieldOfView;
        private float farClipping;
        private float unknown;
        private W3str name;
        private W3W3c _root;
        private W3W3c _parent;
        public float targetX() { return targetX; }
        public float targetY() { return targetY; }
        public float targetZ() { return targetZ; }
        public float angle() { return angle; }
        public float angleOfAttack() { return angleOfAttack; }
        public float distance() { return distance; }
        public float roll() { return roll; }
        public float fieldOfView() { return fieldOfView; }
        public float farClipping() { return farClipping; }
        public float unknown() { return unknown; }
        public W3str name() { return name; }
        public W3W3c _root() { return _root; }
        public W3W3c _parent() { return _parent; }
    }
    private long version;
    private long numCamera;
    private ArrayList<Camera> camera;
    private W3W3c _root;
    private KaitaiStruct _parent;
    public long version() { return version; }
    public long numCamera() { return numCamera; }
    public ArrayList<Camera> camera() { return camera; }
    public W3W3c _root() { return _root; }
    public KaitaiStruct _parent() { return _parent; }
}
