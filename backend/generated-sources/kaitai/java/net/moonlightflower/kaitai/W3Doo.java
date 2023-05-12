// This is a generated file! Please edit source .ksy file and use kaitai-struct-compiler to rebuild

package net.moonlightflower.kaitai;

import io.kaitai.struct.ByteBufferKaitaiStream;
import io.kaitai.struct.KaitaiStruct;
import io.kaitai.struct.KaitaiStream;
import java.io.IOException;
import java.util.ArrayList;

public class W3Doo extends KaitaiStruct {
    public static W3Doo fromFile(String fileName) throws IOException {
        return new W3Doo(new ByteBufferKaitaiStream(fileName));
    }

    public W3Doo(KaitaiStream _io) {
        this(_io, null, null);
    }

    public W3Doo(KaitaiStream _io, KaitaiStruct _parent) {
        this(_io, _parent, null);
    }

    public W3Doo(KaitaiStream _io, KaitaiStruct _parent, W3Doo _root) {
        super(_io);
        this._parent = _parent;
        this._root = _root == null ? this : _root;
        _read();
    }
    private void _read() {
        this.fileId = new W3id(this._io);
        this.version = this._io.readU4le();
        this.subVersion = this._io.readU4le();
        this.numDoodad = this._io.readU4le();
        this.doodad = new ArrayList<Doodad>();
        for (int i = 0; i < numDoodad(); i++) {
            this.doodad.add(new Doodad(this._io, this, _root));
        }
        this.specialDoodadVersion = this._io.readU4le();
        this.numSpecialDoodad = this._io.readU4le();
        this.specialDoodad = new ArrayList<SpecialDoodad>();
        for (int i = 0; i < numSpecialDoodad(); i++) {
            this.specialDoodad.add(new SpecialDoodad(this._io, this, _root));
        }
    }
    public static class Doodad extends KaitaiStruct {
        public static Doodad fromFile(String fileName) throws IOException {
            return new Doodad(new ByteBufferKaitaiStream(fileName));
        }

        public Doodad(KaitaiStream _io) {
            this(_io, null, null);
        }

        public Doodad(KaitaiStream _io, W3Doo _parent) {
            this(_io, _parent, null);
        }

        public Doodad(KaitaiStream _io, W3Doo _parent, W3Doo _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.id = new W3id(this._io);
            this.variation = this._io.readU4le();
            this.x = this._io.readF4le();
            this.y = this._io.readF4le();
            this.z = this._io.readF4le();
            this.angle = this._io.readF4le();
            this.scaleX = this._io.readF4le();
            this.scaleY = this._io.readF4le();
            this.scaleZ = this._io.readF4le();
            this.skinId = new W3id(this._io);
            this.flags = this._io.readU1();
            this.life = this._io.readU1();
            this.randomItemSetPtr = this._io.readU4le();
            this.numItemSet = this._io.readU4le();
            this.itemSet = new ArrayList<ItemSet>();
            for (int i = 0; i < numItemSet(); i++) {
                this.itemSet.add(new ItemSet(this._io, this, _root));
            }
            this.editorId = this._io.readU4le();
        }
        private W3id id;
        private long variation;
        private float x;
        private float y;
        private float z;
        private float angle;
        private float scaleX;
        private float scaleY;
        private float scaleZ;
        private W3id skinId;
        private int flags;
        private int life;
        private long randomItemSetPtr;
        private long numItemSet;
        private ArrayList<ItemSet> itemSet;
        private long editorId;
        private W3Doo _root;
        private W3Doo _parent;
        public W3id id() { return id; }
        public long variation() { return variation; }
        public float x() { return x; }
        public float y() { return y; }
        public float z() { return z; }
        public float angle() { return angle; }
        public float scaleX() { return scaleX; }
        public float scaleY() { return scaleY; }
        public float scaleZ() { return scaleZ; }
        public W3id skinId() { return skinId; }
        public int flags() { return flags; }
        public int life() { return life; }
        public long randomItemSetPtr() { return randomItemSetPtr; }
        public long numItemSet() { return numItemSet; }
        public ArrayList<ItemSet> itemSet() { return itemSet; }
        public long editorId() { return editorId; }
        public W3Doo _root() { return _root; }
        public W3Doo _parent() { return _parent; }
    }
    public static class ItemSet extends KaitaiStruct {
        public static ItemSet fromFile(String fileName) throws IOException {
            return new ItemSet(new ByteBufferKaitaiStream(fileName));
        }

        public ItemSet(KaitaiStream _io) {
            this(_io, null, null);
        }

        public ItemSet(KaitaiStream _io, W3Doo.Doodad _parent) {
            this(_io, _parent, null);
        }

        public ItemSet(KaitaiStream _io, W3Doo.Doodad _parent, W3Doo _root) {
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
        private W3Doo _root;
        private W3Doo.Doodad _parent;
        public long numItem() { return numItem; }
        public ArrayList<Item> item() { return item; }
        public W3Doo _root() { return _root; }
        public W3Doo.Doodad _parent() { return _parent; }
    }
    public static class Item extends KaitaiStruct {
        public static Item fromFile(String fileName) throws IOException {
            return new Item(new ByteBufferKaitaiStream(fileName));
        }

        public Item(KaitaiStream _io) {
            this(_io, null, null);
        }

        public Item(KaitaiStream _io, W3Doo.ItemSet _parent) {
            this(_io, _parent, null);
        }

        public Item(KaitaiStream _io, W3Doo.ItemSet _parent, W3Doo _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.id = new W3id(this._io);
            this.chance = this._io.readU4le();
        }
        private W3id id;
        private long chance;
        private W3Doo _root;
        private W3Doo.ItemSet _parent;
        public W3id id() { return id; }
        public long chance() { return chance; }
        public W3Doo _root() { return _root; }
        public W3Doo.ItemSet _parent() { return _parent; }
    }
    public static class SpecialDoodad extends KaitaiStruct {
        public static SpecialDoodad fromFile(String fileName) throws IOException {
            return new SpecialDoodad(new ByteBufferKaitaiStream(fileName));
        }

        public SpecialDoodad(KaitaiStream _io) {
            this(_io, null, null);
        }

        public SpecialDoodad(KaitaiStream _io, W3Doo _parent) {
            this(_io, _parent, null);
        }

        public SpecialDoodad(KaitaiStream _io, W3Doo _parent, W3Doo _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.id = new W3id(this._io);
            this.x = this._io.readF4le();
            this.y = this._io.readF4le();
            this.z = this._io.readF4le();
        }
        private W3id id;
        private float x;
        private float y;
        private float z;
        private W3Doo _root;
        private W3Doo _parent;
        public W3id id() { return id; }
        public float x() { return x; }
        public float y() { return y; }
        public float z() { return z; }
        public W3Doo _root() { return _root; }
        public W3Doo _parent() { return _parent; }
    }
    private W3id fileId;
    private long version;
    private long subVersion;
    private long numDoodad;
    private ArrayList<Doodad> doodad;
    private long specialDoodadVersion;
    private long numSpecialDoodad;
    private ArrayList<SpecialDoodad> specialDoodad;
    private W3Doo _root;
    private KaitaiStruct _parent;
    public W3id fileId() { return fileId; }
    public long version() { return version; }
    public long subVersion() { return subVersion; }
    public long numDoodad() { return numDoodad; }
    public ArrayList<Doodad> doodad() { return doodad; }
    public long specialDoodadVersion() { return specialDoodadVersion; }
    public long numSpecialDoodad() { return numSpecialDoodad; }
    public ArrayList<SpecialDoodad> specialDoodad() { return specialDoodad; }
    public W3Doo _root() { return _root; }
    public KaitaiStruct _parent() { return _parent; }
}
