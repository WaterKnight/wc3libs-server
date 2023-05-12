// This is a generated file! Please edit source .ksy file and use kaitai-struct-compiler to rebuild

package net.moonlightflower.kaitai;

import io.kaitai.struct.ByteBufferKaitaiStream;
import io.kaitai.struct.KaitaiStruct;
import io.kaitai.struct.KaitaiStream;
import java.io.IOException;
import java.util.ArrayList;

public class W3W3v extends KaitaiStruct {
    public static W3W3v fromFile(String fileName) throws IOException {
        return new W3W3v(new ByteBufferKaitaiStream(fileName));
    }

    public W3W3v(KaitaiStream _io) {
        this(_io, null, null);
    }

    public W3W3v(KaitaiStream _io, KaitaiStruct _parent) {
        this(_io, _parent, null);
    }

    public W3W3v(KaitaiStream _io, KaitaiStruct _parent, W3W3v _root) {
        super(_io);
        this._parent = _parent;
        this._root = _root == null ? this : _root;
        _read();
    }
    private void _read() {
        this.version = this._io.readU4le();
        this.numGameCache = this._io.readU4le();
        this.gameCache = new ArrayList<GameCache>();
        for (int i = 0; i < numGameCache(); i++) {
            this.gameCache.add(new GameCache(this._io, this, _root));
        }
    }
    public static class BooleanEntry extends KaitaiStruct {
        public static BooleanEntry fromFile(String fileName) throws IOException {
            return new BooleanEntry(new ByteBufferKaitaiStream(fileName));
        }

        public BooleanEntry(KaitaiStream _io) {
            this(_io, null, null);
        }

        public BooleanEntry(KaitaiStream _io, W3W3v.Category _parent) {
            this(_io, _parent, null);
        }

        public BooleanEntry(KaitaiStream _io, W3W3v.Category _parent, W3W3v _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.name = new W3str(this._io);
            this.value = this._io.readU4le();
        }
        private W3str name;
        private long value;
        private W3W3v _root;
        private W3W3v.Category _parent;
        public W3str name() { return name; }
        public long value() { return value; }
        public W3W3v _root() { return _root; }
        public W3W3v.Category _parent() { return _parent; }
    }
    public static class RealEntry extends KaitaiStruct {
        public static RealEntry fromFile(String fileName) throws IOException {
            return new RealEntry(new ByteBufferKaitaiStream(fileName));
        }

        public RealEntry(KaitaiStream _io) {
            this(_io, null, null);
        }

        public RealEntry(KaitaiStream _io, W3W3v.Category _parent) {
            this(_io, _parent, null);
        }

        public RealEntry(KaitaiStream _io, W3W3v.Category _parent, W3W3v _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.name = new W3str(this._io);
            this.value = this._io.readF4le();
        }
        private W3str name;
        private float value;
        private W3W3v _root;
        private W3W3v.Category _parent;
        public W3str name() { return name; }
        public float value() { return value; }
        public W3W3v _root() { return _root; }
        public W3W3v.Category _parent() { return _parent; }
    }
    public static class ItemFlags2 extends KaitaiStruct {
        public static ItemFlags2 fromFile(String fileName) throws IOException {
            return new ItemFlags2(new ByteBufferKaitaiStream(fileName));
        }

        public ItemFlags2(KaitaiStream _io) {
            this(_io, null, null);
        }

        public ItemFlags2(KaitaiStream _io, W3W3v.InventorySlot _parent) {
            this(_io, _parent, null);
        }

        public ItemFlags2(KaitaiStream _io, W3W3v.InventorySlot _parent, W3W3v _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.flag7 = this._io.readBitsIntBe(1) != 0;
            this.flag6 = this._io.readBitsIntBe(1) != 0;
            this.pawnable = this._io.readBitsIntBe(1) != 0;
            this.flag4 = this._io.readBitsIntBe(1) != 0;
            this.flag3 = this._io.readBitsIntBe(1) != 0;
            this.droppable = this._io.readBitsIntBe(1) != 0;
            this.activelyUsed = this._io.readBitsIntBe(1) != 0;
            this.flag0 = this._io.readBitsIntBe(1) != 0;
        }
        private boolean flag7;
        private boolean flag6;
        private boolean pawnable;
        private boolean flag4;
        private boolean flag3;
        private boolean droppable;
        private boolean activelyUsed;
        private boolean flag0;
        private W3W3v _root;
        private W3W3v.InventorySlot _parent;
        public boolean flag7() { return flag7; }
        public boolean flag6() { return flag6; }
        public boolean pawnable() { return pawnable; }
        public boolean flag4() { return flag4; }
        public boolean flag3() { return flag3; }
        public boolean droppable() { return droppable; }
        public boolean activelyUsed() { return activelyUsed; }
        public boolean flag0() { return flag0; }
        public W3W3v _root() { return _root; }
        public W3W3v.InventorySlot _parent() { return _parent; }
    }
    public static class UnitEntry extends KaitaiStruct {
        public static UnitEntry fromFile(String fileName) throws IOException {
            return new UnitEntry(new ByteBufferKaitaiStream(fileName));
        }

        public UnitEntry(KaitaiStream _io) {
            this(_io, null, null);
        }

        public UnitEntry(KaitaiStream _io, W3W3v.Category _parent) {
            this(_io, _parent, null);
        }

        public UnitEntry(KaitaiStream _io, W3W3v.Category _parent, W3W3v _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.name = new W3str(this._io);
            this.unitId = new W3id(this._io);
            this.numInventorySlot = this._io.readU4le();
            this.inventorySlot = new ArrayList<InventorySlot>();
            for (int i = 0; i < numInventorySlot(); i++) {
                this.inventorySlot.add(new InventorySlot(this._io, this, _root));
            }
            this.experience = this._io.readU4le();
            this.levelMinusOne = this._io.readU4le();
            this.unusedSkillPoints = this._io.readU4le();
            this.unknown0 = this._io.readU2le();
            this.heroProperNameIndex = this._io.readU2le();
            this.str = this._io.readU4le();
            this.strPlus = this._io.readF4le();
            this.agi = this._io.readU4le();
            this.moveSpeedIncrementFromAgi = this._io.readF4le();
            this.attackSpeedIncrementFromAgi = this._io.readF4le();
            this.agiPlus = this._io.readF4le();
            this.intelligence = this._io.readU4le();
            this.intPlus = this._io.readF4le();
            this.numHeroSkill = this._io.readU4le();
            this.heroSkill = new ArrayList<HeroSkill>();
            for (int i = 0; i < numHeroSkill(); i++) {
                this.heroSkill.add(new HeroSkill(this._io, this, _root));
            }
            if (false) {
                this.unknown4 = new ArrayList<Long>();
                for (int i = 0; i < 5; i++) {
                    this.unknown4.add(this._io.readU4le());
                }
            }
            this.lifeIncrement = this._io.readF4le();
            this.manaIncrement = this._io.readF4le();
            this.sightRangeDay = this._io.readF4le();
            this.unknown7 = new ArrayList<Integer>();
            for (int i = 0; i < 4; i++) {
                this.unknown7.add(this._io.readU1());
            }
            this.atkIncrement1 = this._io.readU4le();
            this.atkIncrement2 = this._io.readU4le();
            this.armorIncrement = this._io.readF4le();
            this.unknown8 = new ArrayList<Integer>();
            for (int i = 0; i < 2; i++) {
                this.unknown8.add(this._io.readU1());
            }
        }
        private W3str name;
        private W3id unitId;
        private long numInventorySlot;
        private ArrayList<InventorySlot> inventorySlot;
        private long experience;
        private long levelMinusOne;
        private long unusedSkillPoints;
        private int unknown0;
        private int heroProperNameIndex;
        private long str;
        private float strPlus;
        private long agi;
        private float moveSpeedIncrementFromAgi;
        private float attackSpeedIncrementFromAgi;
        private float agiPlus;
        private long intelligence;
        private float intPlus;
        private long numHeroSkill;
        private ArrayList<HeroSkill> heroSkill;
        private ArrayList<Long> unknown4;
        private float lifeIncrement;
        private float manaIncrement;
        private float sightRangeDay;
        private ArrayList<Integer> unknown7;
        private long atkIncrement1;
        private long atkIncrement2;
        private float armorIncrement;
        private ArrayList<Integer> unknown8;
        private W3W3v _root;
        private W3W3v.Category _parent;
        public W3str name() { return name; }
        public W3id unitId() { return unitId; }
        public long numInventorySlot() { return numInventorySlot; }
        public ArrayList<InventorySlot> inventorySlot() { return inventorySlot; }
        public long experience() { return experience; }
        public long levelMinusOne() { return levelMinusOne; }
        public long unusedSkillPoints() { return unusedSkillPoints; }
        public int unknown0() { return unknown0; }
        public int heroProperNameIndex() { return heroProperNameIndex; }
        public long str() { return str; }
        public float strPlus() { return strPlus; }
        public long agi() { return agi; }
        public float moveSpeedIncrementFromAgi() { return moveSpeedIncrementFromAgi; }
        public float attackSpeedIncrementFromAgi() { return attackSpeedIncrementFromAgi; }
        public float agiPlus() { return agiPlus; }
        public long intelligence() { return intelligence; }
        public float intPlus() { return intPlus; }
        public long numHeroSkill() { return numHeroSkill; }
        public ArrayList<HeroSkill> heroSkill() { return heroSkill; }
        public ArrayList<Long> unknown4() { return unknown4; }
        public float lifeIncrement() { return lifeIncrement; }
        public float manaIncrement() { return manaIncrement; }
        public float sightRangeDay() { return sightRangeDay; }
        public ArrayList<Integer> unknown7() { return unknown7; }
        public long atkIncrement1() { return atkIncrement1; }
        public long atkIncrement2() { return atkIncrement2; }
        public float armorIncrement() { return armorIncrement; }
        public ArrayList<Integer> unknown8() { return unknown8; }
        public W3W3v _root() { return _root; }
        public W3W3v.Category _parent() { return _parent; }
    }
    public static class HeroSkill extends KaitaiStruct {
        public static HeroSkill fromFile(String fileName) throws IOException {
            return new HeroSkill(new ByteBufferKaitaiStream(fileName));
        }

        public HeroSkill(KaitaiStream _io) {
            this(_io, null, null);
        }

        public HeroSkill(KaitaiStream _io, W3W3v.UnitEntry _parent) {
            this(_io, _parent, null);
        }

        public HeroSkill(KaitaiStream _io, W3W3v.UnitEntry _parent, W3W3v _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.abilityId = new W3id(this._io);
            this.currentLevel = this._io.readU4le();
        }
        private W3id abilityId;
        private long currentLevel;
        private W3W3v _root;
        private W3W3v.UnitEntry _parent;
        public W3id abilityId() { return abilityId; }
        public long currentLevel() { return currentLevel; }
        public W3W3v _root() { return _root; }
        public W3W3v.UnitEntry _parent() { return _parent; }
    }
    public static class StringEntry extends KaitaiStruct {
        public static StringEntry fromFile(String fileName) throws IOException {
            return new StringEntry(new ByteBufferKaitaiStream(fileName));
        }

        public StringEntry(KaitaiStream _io) {
            this(_io, null, null);
        }

        public StringEntry(KaitaiStream _io, W3W3v.Category _parent) {
            this(_io, _parent, null);
        }

        public StringEntry(KaitaiStream _io, W3W3v.Category _parent, W3W3v _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.name = new W3str(this._io);
            this.value = new W3str(this._io);
        }
        private W3str name;
        private W3str value;
        private W3W3v _root;
        private W3W3v.Category _parent;
        public W3str name() { return name; }
        public W3str value() { return value; }
        public W3W3v _root() { return _root; }
        public W3W3v.Category _parent() { return _parent; }
    }
    public static class InventorySlot extends KaitaiStruct {
        public static InventorySlot fromFile(String fileName) throws IOException {
            return new InventorySlot(new ByteBufferKaitaiStream(fileName));
        }

        public InventorySlot(KaitaiStream _io) {
            this(_io, null, null);
        }

        public InventorySlot(KaitaiStream _io, W3W3v.UnitEntry _parent) {
            this(_io, _parent, null);
        }

        public InventorySlot(KaitaiStream _io, W3W3v.UnitEntry _parent, W3W3v _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.itemId = new W3id(this._io);
            this.charges = this._io.readU4le();
            this._raw_flags = this._io.readBytes(1);
            KaitaiStream _io__raw_flags = new ByteBufferKaitaiStream(_raw_flags);
            this.flags = new ItemFlags(_io__raw_flags, this, _root);
            this._raw_flags2 = this._io.readBytes(1);
            KaitaiStream _io__raw_flags2 = new ByteBufferKaitaiStream(_raw_flags2);
            this.flags2 = new ItemFlags2(_io__raw_flags2, this, _root);
            this.flags3 = this._io.readU1();
            this.flags4 = this._io.readU1();
        }
        private W3id itemId;
        private long charges;
        private ItemFlags flags;
        private ItemFlags2 flags2;
        private int flags3;
        private int flags4;
        private W3W3v _root;
        private W3W3v.UnitEntry _parent;
        private byte[] _raw_flags;
        private byte[] _raw_flags2;
        public W3id itemId() { return itemId; }
        public long charges() { return charges; }
        public ItemFlags flags() { return flags; }
        public ItemFlags2 flags2() { return flags2; }
        public int flags3() { return flags3; }
        public int flags4() { return flags4; }
        public W3W3v _root() { return _root; }
        public W3W3v.UnitEntry _parent() { return _parent; }
        public byte[] _raw_flags() { return _raw_flags; }
        public byte[] _raw_flags2() { return _raw_flags2; }
    }
    public static class Category extends KaitaiStruct {
        public static Category fromFile(String fileName) throws IOException {
            return new Category(new ByteBufferKaitaiStream(fileName));
        }

        public Category(KaitaiStream _io) {
            this(_io, null, null);
        }

        public Category(KaitaiStream _io, W3W3v.GameCache _parent) {
            this(_io, _parent, null);
        }

        public Category(KaitaiStream _io, W3W3v.GameCache _parent, W3W3v _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.name = new W3str(this._io);
            this.reservedVarTypes = new ArrayList<Integer>();
            for (int i = 0; i < 5; i++) {
                this.reservedVarTypes.add(this._io.readU1());
            }
            this.filler = new ArrayList<Integer>();
            for (int i = 0; i < 15; i++) {
                this.filler.add(this._io.readU1());
            }
            this.numIntEntry = this._io.readU4le();
            this.intEntry = new ArrayList<IntEntry>();
            for (int i = 0; i < numIntEntry(); i++) {
                this.intEntry.add(new IntEntry(this._io, this, _root));
            }
            this.numRealEntry = this._io.readU4le();
            this.realEntry = new ArrayList<RealEntry>();
            for (int i = 0; i < numRealEntry(); i++) {
                this.realEntry.add(new RealEntry(this._io, this, _root));
            }
            this.numBooleanEntry = this._io.readU4le();
            this.booleanEntry = new ArrayList<BooleanEntry>();
            for (int i = 0; i < numBooleanEntry(); i++) {
                this.booleanEntry.add(new BooleanEntry(this._io, this, _root));
            }
            this.numUnitEntry = this._io.readU4le();
            this.unitEntry = new ArrayList<UnitEntry>();
            for (int i = 0; i < numUnitEntry(); i++) {
                this.unitEntry.add(new UnitEntry(this._io, this, _root));
            }
            this.numStringEntry = this._io.readU4le();
            this.stringEntry = new ArrayList<StringEntry>();
            for (int i = 0; i < numStringEntry(); i++) {
                this.stringEntry.add(new StringEntry(this._io, this, _root));
            }
        }
        private W3str name;
        private ArrayList<Integer> reservedVarTypes;
        private ArrayList<Integer> filler;
        private long numIntEntry;
        private ArrayList<IntEntry> intEntry;
        private long numRealEntry;
        private ArrayList<RealEntry> realEntry;
        private long numBooleanEntry;
        private ArrayList<BooleanEntry> booleanEntry;
        private long numUnitEntry;
        private ArrayList<UnitEntry> unitEntry;
        private long numStringEntry;
        private ArrayList<StringEntry> stringEntry;
        private W3W3v _root;
        private W3W3v.GameCache _parent;
        public W3str name() { return name; }
        public ArrayList<Integer> reservedVarTypes() { return reservedVarTypes; }
        public ArrayList<Integer> filler() { return filler; }
        public long numIntEntry() { return numIntEntry; }
        public ArrayList<IntEntry> intEntry() { return intEntry; }
        public long numRealEntry() { return numRealEntry; }
        public ArrayList<RealEntry> realEntry() { return realEntry; }
        public long numBooleanEntry() { return numBooleanEntry; }
        public ArrayList<BooleanEntry> booleanEntry() { return booleanEntry; }
        public long numUnitEntry() { return numUnitEntry; }
        public ArrayList<UnitEntry> unitEntry() { return unitEntry; }
        public long numStringEntry() { return numStringEntry; }
        public ArrayList<StringEntry> stringEntry() { return stringEntry; }
        public W3W3v _root() { return _root; }
        public W3W3v.GameCache _parent() { return _parent; }
    }
    public static class IntEntry extends KaitaiStruct {
        public static IntEntry fromFile(String fileName) throws IOException {
            return new IntEntry(new ByteBufferKaitaiStream(fileName));
        }

        public IntEntry(KaitaiStream _io) {
            this(_io, null, null);
        }

        public IntEntry(KaitaiStream _io, W3W3v.Category _parent) {
            this(_io, _parent, null);
        }

        public IntEntry(KaitaiStream _io, W3W3v.Category _parent, W3W3v _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.name = new W3str(this._io);
            this.value = this._io.readU4le();
        }
        private W3str name;
        private long value;
        private W3W3v _root;
        private W3W3v.Category _parent;
        public W3str name() { return name; }
        public long value() { return value; }
        public W3W3v _root() { return _root; }
        public W3W3v.Category _parent() { return _parent; }
    }
    public static class ItemFlags extends KaitaiStruct {
        public static ItemFlags fromFile(String fileName) throws IOException {
            return new ItemFlags(new ByteBufferKaitaiStream(fileName));
        }

        public ItemFlags(KaitaiStream _io) {
            this(_io, null, null);
        }

        public ItemFlags(KaitaiStream _io, W3W3v.InventorySlot _parent) {
            this(_io, _parent, null);
        }

        public ItemFlags(KaitaiStream _io, W3W3v.InventorySlot _parent, W3W3v _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.dropUponDeath = this._io.readBitsIntBe(1) != 0;
            this.perishable = this._io.readBitsIntBe(1) != 0;
            this.flag5 = this._io.readBitsIntBe(1) != 0;
            this.flag4 = this._io.readBitsIntBe(1) != 0;
            this.invulnerable = this._io.readBitsIntBe(1) != 0;
            this.flag2 = this._io.readBitsIntBe(1) != 0;
            this.flag1 = this._io.readBitsIntBe(1) != 0;
            this.flag0 = this._io.readBitsIntBe(1) != 0;
        }
        private boolean dropUponDeath;
        private boolean perishable;
        private boolean flag5;
        private boolean flag4;
        private boolean invulnerable;
        private boolean flag2;
        private boolean flag1;
        private boolean flag0;
        private W3W3v _root;
        private W3W3v.InventorySlot _parent;
        public boolean dropUponDeath() { return dropUponDeath; }
        public boolean perishable() { return perishable; }
        public boolean flag5() { return flag5; }
        public boolean flag4() { return flag4; }
        public boolean invulnerable() { return invulnerable; }
        public boolean flag2() { return flag2; }
        public boolean flag1() { return flag1; }
        public boolean flag0() { return flag0; }
        public W3W3v _root() { return _root; }
        public W3W3v.InventorySlot _parent() { return _parent; }
    }
    public static class GameCache extends KaitaiStruct {
        public static GameCache fromFile(String fileName) throws IOException {
            return new GameCache(new ByteBufferKaitaiStream(fileName));
        }

        public GameCache(KaitaiStream _io) {
            this(_io, null, null);
        }

        public GameCache(KaitaiStream _io, W3W3v _parent) {
            this(_io, _parent, null);
        }

        public GameCache(KaitaiStream _io, W3W3v _parent, W3W3v _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.name = new W3str(this._io);
            this.reserved = this._io.readU4le();
            this.numCategory = this._io.readU4le();
            this.category = new ArrayList<Category>();
            for (int i = 0; i < numCategory(); i++) {
                this.category.add(new Category(this._io, this, _root));
            }
        }
        private W3str name;
        private long reserved;
        private long numCategory;
        private ArrayList<Category> category;
        private W3W3v _root;
        private W3W3v _parent;
        public W3str name() { return name; }
        public long reserved() { return reserved; }
        public long numCategory() { return numCategory; }
        public ArrayList<Category> category() { return category; }
        public W3W3v _root() { return _root; }
        public W3W3v _parent() { return _parent; }
    }
    private long version;
    private long numGameCache;
    private ArrayList<GameCache> gameCache;
    private W3W3v _root;
    private KaitaiStruct _parent;
    public long version() { return version; }
    public long numGameCache() { return numGameCache; }
    public ArrayList<GameCache> gameCache() { return gameCache; }
    public W3W3v _root() { return _root; }
    public KaitaiStruct _parent() { return _parent; }
}
