// This is a generated file! Please edit source .ksy file and use kaitai-struct-compiler to rebuild

package net.moonlightflower.kaitai;

import io.kaitai.struct.ByteBufferKaitaiStream;
import io.kaitai.struct.KaitaiStruct;
import io.kaitai.struct.KaitaiStream;
import java.io.IOException;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;

public class W3W3a extends KaitaiStruct {
    public static W3W3a fromFile(String fileName) throws IOException {
        return new W3W3a(new ByteBufferKaitaiStream(fileName));
    }

    public enum VarTypes {
        INT(0),
        REAL(1),
        UNREAL(2),
        STRING(3);

        private final long id;
        VarTypes(long id) { this.id = id; }
        public long id() { return id; }
        private static final Map<Long, VarTypes> byId = new HashMap<Long, VarTypes>(4);
        static {
            for (VarTypes e : VarTypes.values())
                byId.put(e.id(), e);
        }
        public static VarTypes byId(long id) { return byId.get(id); }
    }

    public W3W3a(KaitaiStream _io) {
        this(_io, null, null);
    }

    public W3W3a(KaitaiStream _io, KaitaiStruct _parent) {
        this(_io, _parent, null);
    }

    public W3W3a(KaitaiStream _io, KaitaiStruct _parent, W3W3a _root) {
        super(_io);
        this._parent = _parent;
        this._root = _root == null ? this : _root;
        _read();
    }
    private void _read() {
        this.version = this._io.readU4le();
        this.originalObjectsChunk = new ObjectsChunk(this._io, this, _root);
        this.customObjectsChunk = new ObjectsChunk(this._io, this, _root);
    }
    public static class ObjectsChunk extends KaitaiStruct {
        public static ObjectsChunk fromFile(String fileName) throws IOException {
            return new ObjectsChunk(new ByteBufferKaitaiStream(fileName));
        }

        public ObjectsChunk(KaitaiStream _io) {
            this(_io, null, null);
        }

        public ObjectsChunk(KaitaiStream _io, W3W3a _parent) {
            this(_io, _parent, null);
        }

        public ObjectsChunk(KaitaiStream _io, W3W3a _parent, W3W3a _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.numObj = this._io.readU4le();
            this.obj = new ArrayList<Obj>();
            for (int i = 0; i < numObj(); i++) {
                this.obj.add(new Obj(this._io, this, _root));
            }
        }
        private long numObj;
        private ArrayList<Obj> obj;
        private W3W3a _root;
        private W3W3a _parent;
        public long numObj() { return numObj; }
        public ArrayList<Obj> obj() { return obj; }
        public W3W3a _root() { return _root; }
        public W3W3a _parent() { return _parent; }
    }
    public static class Obj extends KaitaiStruct {
        public static Obj fromFile(String fileName) throws IOException {
            return new Obj(new ByteBufferKaitaiStream(fileName));
        }

        public Obj(KaitaiStream _io) {
            this(_io, null, null);
        }

        public Obj(KaitaiStream _io, W3W3a.ObjectsChunk _parent) {
            this(_io, _parent, null);
        }

        public Obj(KaitaiStream _io, W3W3a.ObjectsChunk _parent, W3W3a _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.baseId = new W3id(this._io);
            this.newId = new W3id(this._io);
            this.numUnknown = this._io.readU4le();
            this.unknown = new ArrayList<Long>();
            for (int i = 0; i < numUnknown(); i++) {
                this.unknown.add(this._io.readU4le());
            }
            this.numMod = this._io.readU4le();
            this.mod = new ArrayList<Mod>();
            for (int i = 0; i < numMod(); i++) {
                this.mod.add(new Mod(this._io, this, _root));
            }
        }
        private W3id baseId;
        private W3id newId;
        private long numUnknown;
        private ArrayList<Long> unknown;
        private long numMod;
        private ArrayList<Mod> mod;
        private W3W3a _root;
        private W3W3a.ObjectsChunk _parent;
        public W3id baseId() { return baseId; }
        public W3id newId() { return newId; }
        public long numUnknown() { return numUnknown; }
        public ArrayList<Long> unknown() { return unknown; }
        public long numMod() { return numMod; }
        public ArrayList<Mod> mod() { return mod; }
        public W3W3a _root() { return _root; }
        public W3W3a.ObjectsChunk _parent() { return _parent; }
    }
    public static class Mod extends KaitaiStruct {
        public static Mod fromFile(String fileName) throws IOException {
            return new Mod(new ByteBufferKaitaiStream(fileName));
        }

        public Mod(KaitaiStream _io) {
            this(_io, null, null);
        }

        public Mod(KaitaiStream _io, W3W3a.Obj _parent) {
            this(_io, _parent, null);
        }

        public Mod(KaitaiStream _io, W3W3a.Obj _parent, W3W3a _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.modId = new W3id(this._io);
            this.varType = W3W3a.VarTypes.byId(this._io.readU4le());
            this.level = this._io.readU4le();
            this.dataPt = this._io.readU4le();
            {
                VarTypes on = varType();
                if (on != null) {
                    switch (varType()) {
                    case INT: {
                        this.value = (Object) (this._io.readU4le());
                        break;
                    }
                    case REAL: {
                        this.value = (Object) (this._io.readF4le());
                        break;
                    }
                    case UNREAL: {
                        this.value = (Object) (this._io.readF4le());
                        break;
                    }
                    default: {
                        this.value = new W3str(this._io);
                        break;
                    }
                    }
                } else {
                    this.value = new W3str(this._io);
                }
            }
            this.endToken = new W3id(this._io);
        }
        private W3id modId;
        private VarTypes varType;
        private long level;
        private long dataPt;
        private Object value;
        private W3id endToken;
        private W3W3a _root;
        private W3W3a.Obj _parent;
        public W3id modId() { return modId; }
        public VarTypes varType() { return varType; }
        public long level() { return level; }
        public long dataPt() { return dataPt; }
        public Object value() { return value; }
        public W3id endToken() { return endToken; }
        public W3W3a _root() { return _root; }
        public W3W3a.Obj _parent() { return _parent; }
    }
    private long version;
    private ObjectsChunk originalObjectsChunk;
    private ObjectsChunk customObjectsChunk;
    private W3W3a _root;
    private KaitaiStruct _parent;
    public long version() { return version; }
    public ObjectsChunk originalObjectsChunk() { return originalObjectsChunk; }
    public ObjectsChunk customObjectsChunk() { return customObjectsChunk; }
    public W3W3a _root() { return _root; }
    public KaitaiStruct _parent() { return _parent; }
}
