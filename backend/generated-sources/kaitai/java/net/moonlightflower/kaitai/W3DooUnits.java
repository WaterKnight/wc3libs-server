// This is a generated file! Please edit source .ksy file and use kaitai-struct-compiler to rebuild

package net.moonlightflower.kaitai;

import io.kaitai.struct.ByteBufferKaitaiStream;
import io.kaitai.struct.KaitaiStruct;
import io.kaitai.struct.KaitaiStream;
import java.io.IOException;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;

public class W3DooUnits extends KaitaiStruct {
    public static W3DooUnits fromFile(String fileName) throws IOException {
        return new W3DooUnits(new ByteBufferKaitaiStream(fileName));
    }

    public enum AutocastActive {
        INACTIVE(0),
        ACTIVE(1);

        private final long id;
        AutocastActive(long id) { this.id = id; }
        public long id() { return id; }
        private static final Map<Long, AutocastActive> byId = new HashMap<Long, AutocastActive>(2);
        static {
            for (AutocastActive e : AutocastActive.values())
                byId.put(e.id(), e);
        }
        public static AutocastActive byId(long id) { return byId.get(id); }
    }

    public W3DooUnits(KaitaiStream _io) {
        this(_io, null, null);
    }

    public W3DooUnits(KaitaiStream _io, KaitaiStruct _parent) {
        this(_io, _parent, null);
    }

    public W3DooUnits(KaitaiStream _io, KaitaiStruct _parent, W3DooUnits _root) {
        super(_io);
        this._parent = _parent;
        this._root = _root == null ? this : _root;
        _read();
    }
    private void _read() {
        this.fileId = new W3id(this._io);
        this.version = this._io.readU4le();
        this.subVersion = this._io.readU4le();
        this.numUnit = this._io.readU4le();
        this.unit = new ArrayList<Unit>();
        for (int i = 0; i < numUnit(); i++) {
            this.unit.add(new Unit(this._io, this, _root));
        }
    }
    public static class RandomBuildingItem extends KaitaiStruct {
        public static RandomBuildingItem fromFile(String fileName) throws IOException {
            return new RandomBuildingItem(new ByteBufferKaitaiStream(fileName));
        }

        public RandomBuildingItem(KaitaiStream _io) {
            this(_io, null, null);
        }

        public RandomBuildingItem(KaitaiStream _io, W3DooUnits.Random _parent) {
            this(_io, _parent, null);
        }

        public RandomBuildingItem(KaitaiStream _io, W3DooUnits.Random _parent, W3DooUnits _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.level = this._io.readU1();
            this.unknown1 = this._io.readU1();
            this.unknown2 = this._io.readU1();
            this.itemClass = this._io.readU1();
        }
        private int level;
        private int unknown1;
        private int unknown2;
        private int itemClass;
        private W3DooUnits _root;
        private W3DooUnits.Random _parent;
        public int level() { return level; }
        public int unknown1() { return unknown1; }
        public int unknown2() { return unknown2; }
        public int itemClass() { return itemClass; }
        public W3DooUnits _root() { return _root; }
        public W3DooUnits.Random _parent() { return _parent; }
    }
    public static class Random extends KaitaiStruct {
        public static Random fromFile(String fileName) throws IOException {
            return new Random(new ByteBufferKaitaiStream(fileName));
        }

        public Random(KaitaiStream _io) {
            this(_io, null, null);
        }

        public Random(KaitaiStream _io, W3DooUnits.Unit _parent) {
            this(_io, _parent, null);
        }

        public Random(KaitaiStream _io, W3DooUnits.Unit _parent, W3DooUnits _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.randomType = this._io.readU2le();
            this.randomTypeRest = this._io.readU2le();
            switch (randomType()) {
            case 0: {
                this.value = new RandomBuildingItem(this._io, this, _root);
                break;
            }
            case 1: {
                this.value = new W3iGroup(this._io, this, _root);
                break;
            }
            case 2: {
                this.value = new CustomGroup(this._io, this, _root);
                break;
            }
            }
        }
        private int randomType;
        private int randomTypeRest;
        private KaitaiStruct value;
        private W3DooUnits _root;
        private W3DooUnits.Unit _parent;
        public int randomType() { return randomType; }
        public int randomTypeRest() { return randomTypeRest; }
        public KaitaiStruct value() { return value; }
        public W3DooUnits _root() { return _root; }
        public W3DooUnits.Unit _parent() { return _parent; }
    }
    public static class W3iGroup extends KaitaiStruct {
        public static W3iGroup fromFile(String fileName) throws IOException {
            return new W3iGroup(new ByteBufferKaitaiStream(fileName));
        }

        public W3iGroup(KaitaiStream _io) {
            this(_io, null, null);
        }

        public W3iGroup(KaitaiStream _io, W3DooUnits.Random _parent) {
            this(_io, _parent, null);
        }

        public W3iGroup(KaitaiStream _io, W3DooUnits.Random _parent, W3DooUnits _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.index = this._io.readU4le();
            this.columnIndex = this._io.readU4le();
        }
        private long index;
        private long columnIndex;
        private W3DooUnits _root;
        private W3DooUnits.Random _parent;
        public long index() { return index; }
        public long columnIndex() { return columnIndex; }
        public W3DooUnits _root() { return _root; }
        public W3DooUnits.Random _parent() { return _parent; }
    }
    public static class AbilityMod extends KaitaiStruct {
        public static AbilityMod fromFile(String fileName) throws IOException {
            return new AbilityMod(new ByteBufferKaitaiStream(fileName));
        }

        public AbilityMod(KaitaiStream _io) {
            this(_io, null, null);
        }

        public AbilityMod(KaitaiStream _io, W3DooUnits.Unit _parent) {
            this(_io, _parent, null);
        }

        public AbilityMod(KaitaiStream _io, W3DooUnits.Unit _parent, W3DooUnits _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.id = new W3id(this._io);
            this.autocastActive = W3DooUnits.AutocastActive.byId(this._io.readU4le());
            this.level = this._io.readU4le();
        }
        private W3id id;
        private AutocastActive autocastActive;
        private long level;
        private W3DooUnits _root;
        private W3DooUnits.Unit _parent;
        public W3id id() { return id; }
        public AutocastActive autocastActive() { return autocastActive; }
        public long level() { return level; }
        public W3DooUnits _root() { return _root; }
        public W3DooUnits.Unit _parent() { return _parent; }
    }
    public static class ItemSet extends KaitaiStruct {
        public static ItemSet fromFile(String fileName) throws IOException {
            return new ItemSet(new ByteBufferKaitaiStream(fileName));
        }

        public ItemSet(KaitaiStream _io) {
            this(_io, null, null);
        }

        public ItemSet(KaitaiStream _io, W3DooUnits.Unit _parent) {
            this(_io, _parent, null);
        }

        public ItemSet(KaitaiStream _io, W3DooUnits.Unit _parent, W3DooUnits _root) {
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
        private W3DooUnits _root;
        private W3DooUnits.Unit _parent;
        public long numItem() { return numItem; }
        public ArrayList<Item> item() { return item; }
        public W3DooUnits _root() { return _root; }
        public W3DooUnits.Unit _parent() { return _parent; }
    }
    public static class CustomGroup extends KaitaiStruct {
        public static CustomGroup fromFile(String fileName) throws IOException {
            return new CustomGroup(new ByteBufferKaitaiStream(fileName));
        }

        public CustomGroup(KaitaiStream _io) {
            this(_io, null, null);
        }

        public CustomGroup(KaitaiStream _io, W3DooUnits.Random _parent) {
            this(_io, _parent, null);
        }

        public CustomGroup(KaitaiStream _io, W3DooUnits.Random _parent, W3DooUnits _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.numGroupUnit = this._io.readU4le();
            this.groupUnit = new ArrayList<Unit>();
            for (int i = 0; i < numGroupUnit(); i++) {
                this.groupUnit.add(new Unit(this._io, this, _root));
            }
        }
        private long numGroupUnit;
        private ArrayList<Unit> groupUnit;
        private W3DooUnits _root;
        private W3DooUnits.Random _parent;
        public long numGroupUnit() { return numGroupUnit; }
        public ArrayList<Unit> groupUnit() { return groupUnit; }
        public W3DooUnits _root() { return _root; }
        public W3DooUnits.Random _parent() { return _parent; }
    }
    public static class GroupUnit extends KaitaiStruct {
        public static GroupUnit fromFile(String fileName) throws IOException {
            return new GroupUnit(new ByteBufferKaitaiStream(fileName));
        }

        public GroupUnit(KaitaiStream _io) {
            this(_io, null, null);
        }

        public GroupUnit(KaitaiStream _io, KaitaiStruct _parent) {
            this(_io, _parent, null);
        }

        public GroupUnit(KaitaiStream _io, KaitaiStruct _parent, W3DooUnits _root) {
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
        private W3DooUnits _root;
        private KaitaiStruct _parent;
        public W3id id() { return id; }
        public long chance() { return chance; }
        public W3DooUnits _root() { return _root; }
        public KaitaiStruct _parent() { return _parent; }
    }
    public static class Unit extends KaitaiStruct {
        public static Unit fromFile(String fileName) throws IOException {
            return new Unit(new ByteBufferKaitaiStream(fileName));
        }

        public Unit(KaitaiStream _io) {
            this(_io, null, null);
        }

        public Unit(KaitaiStream _io, KaitaiStruct _parent) {
            this(_io, _parent, null);
        }

        public Unit(KaitaiStream _io, KaitaiStruct _parent, W3DooUnits _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.id = new W3id(this._io);
            this.variation = this._io.readU8le();
            this.x = this._io.readF4le();
            this.y = this._io.readF4le();
            this.z = this._io.readF4le();
            this.angle = this._io.readF4le();
            this.scaleX = this._io.readF4le();
            this.scaleY = this._io.readF4le();
            this.scaleZ = this._io.readF4le();
            this.flags = this._io.readU1();
            this.ownerIndex = this._io.readU4le();
            this.unknown1 = this._io.readU1();
            this.unknown2 = this._io.readU1();
            this.life = this._io.readU4le();
            this.mana = this._io.readU4le();
            this.droppedItemSetPtr = this._io.readU4le();
            this.numDroppedItemSet = this._io.readU4le();
            this.droppedItemSet = new ArrayList<ItemSet>();
            for (int i = 0; i < numDroppedItemSet(); i++) {
                this.droppedItemSet.add(new ItemSet(this._io, this, _root));
            }
            this.resourcesAmount = this._io.readU4le();
            this.targetAquisition = this._io.readF4le();
            this.heroLevel = this._io.readU4le();
            this.heroStrength = this._io.readU4le();
            this.heroAgility = this._io.readU4le();
            this.heroIntelligence = this._io.readU4le();
            this.numInventoryItem = this._io.readU4le();
            this.inventoryItem = new ArrayList<InventoryItem>();
            for (int i = 0; i < numInventoryItem(); i++) {
                this.inventoryItem.add(new InventoryItem(this._io, this, _root));
            }
            this.numAbilityMod = this._io.readU4le();
            this.abilityMod = new ArrayList<AbilityMod>();
            for (int i = 0; i < numAbilityMod(); i++) {
                this.abilityMod.add(new AbilityMod(this._io, this, _root));
            }
            this.random = new Random(this._io, this, _root);
            this.color = this._io.readU4le();
            this.waygate = this._io.readU4le();
            this.unitId = this._io.readU4le();
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
        private int flags;
        private long ownerIndex;
        private int unknown1;
        private int unknown2;
        private long life;
        private long mana;
        private long droppedItemSetPtr;
        private long numDroppedItemSet;
        private ArrayList<ItemSet> droppedItemSet;
        private long resourcesAmount;
        private float targetAquisition;
        private long heroLevel;
        private long heroStrength;
        private long heroAgility;
        private long heroIntelligence;
        private long numInventoryItem;
        private ArrayList<InventoryItem> inventoryItem;
        private long numAbilityMod;
        private ArrayList<AbilityMod> abilityMod;
        private Random random;
        private long color;
        private long waygate;
        private long unitId;
        private W3DooUnits _root;
        private KaitaiStruct _parent;
        public W3id id() { return id; }
        public long variation() { return variation; }
        public float x() { return x; }
        public float y() { return y; }
        public float z() { return z; }
        public float angle() { return angle; }
        public float scaleX() { return scaleX; }
        public float scaleY() { return scaleY; }
        public float scaleZ() { return scaleZ; }
        public int flags() { return flags; }
        public long ownerIndex() { return ownerIndex; }
        public int unknown1() { return unknown1; }
        public int unknown2() { return unknown2; }
        public long life() { return life; }
        public long mana() { return mana; }
        public long droppedItemSetPtr() { return droppedItemSetPtr; }
        public long numDroppedItemSet() { return numDroppedItemSet; }
        public ArrayList<ItemSet> droppedItemSet() { return droppedItemSet; }
        public long resourcesAmount() { return resourcesAmount; }
        public float targetAquisition() { return targetAquisition; }
        public long heroLevel() { return heroLevel; }
        public long heroStrength() { return heroStrength; }
        public long heroAgility() { return heroAgility; }
        public long heroIntelligence() { return heroIntelligence; }
        public long numInventoryItem() { return numInventoryItem; }
        public ArrayList<InventoryItem> inventoryItem() { return inventoryItem; }
        public long numAbilityMod() { return numAbilityMod; }
        public ArrayList<AbilityMod> abilityMod() { return abilityMod; }
        public Random random() { return random; }
        public long color() { return color; }
        public long waygate() { return waygate; }
        public long unitId() { return unitId; }
        public W3DooUnits _root() { return _root; }
        public KaitaiStruct _parent() { return _parent; }
    }
    public static class InventoryItem extends KaitaiStruct {
        public static InventoryItem fromFile(String fileName) throws IOException {
            return new InventoryItem(new ByteBufferKaitaiStream(fileName));
        }

        public InventoryItem(KaitaiStream _io) {
            this(_io, null, null);
        }

        public InventoryItem(KaitaiStream _io, W3DooUnits.Unit _parent) {
            this(_io, _parent, null);
        }

        public InventoryItem(KaitaiStream _io, W3DooUnits.Unit _parent, W3DooUnits _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.slot = this._io.readU4le();
            this.id = new W3id(this._io);
        }
        private long slot;
        private W3id id;
        private W3DooUnits _root;
        private W3DooUnits.Unit _parent;
        public long slot() { return slot; }
        public W3id id() { return id; }
        public W3DooUnits _root() { return _root; }
        public W3DooUnits.Unit _parent() { return _parent; }
    }
    public static class Item extends KaitaiStruct {
        public static Item fromFile(String fileName) throws IOException {
            return new Item(new ByteBufferKaitaiStream(fileName));
        }

        public Item(KaitaiStream _io) {
            this(_io, null, null);
        }

        public Item(KaitaiStream _io, W3DooUnits.ItemSet _parent) {
            this(_io, _parent, null);
        }

        public Item(KaitaiStream _io, W3DooUnits.ItemSet _parent, W3DooUnits _root) {
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
        private W3DooUnits _root;
        private W3DooUnits.ItemSet _parent;
        public W3id id() { return id; }
        public long chance() { return chance; }
        public W3DooUnits _root() { return _root; }
        public W3DooUnits.ItemSet _parent() { return _parent; }
    }
    private W3id fileId;
    private long version;
    private long subVersion;
    private long numUnit;
    private ArrayList<Unit> unit;
    private W3DooUnits _root;
    private KaitaiStruct _parent;
    public W3id fileId() { return fileId; }
    public long version() { return version; }
    public long subVersion() { return subVersion; }
    public long numUnit() { return numUnit; }
    public ArrayList<Unit> unit() { return unit; }
    public W3DooUnits _root() { return _root; }
    public KaitaiStruct _parent() { return _parent; }
}
