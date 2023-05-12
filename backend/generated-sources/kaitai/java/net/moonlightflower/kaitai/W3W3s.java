// This is a generated file! Please edit source .ksy file and use kaitai-struct-compiler to rebuild

package net.moonlightflower.kaitai;

import io.kaitai.struct.ByteBufferKaitaiStream;
import io.kaitai.struct.KaitaiStruct;
import io.kaitai.struct.KaitaiStream;
import java.io.IOException;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.nio.charset.Charset;

public class W3W3s extends KaitaiStruct {
    public static W3W3s fromFile(String fileName) throws IOException {
        return new W3W3s(new ByteBufferKaitaiStream(fileName));
    }

    public enum Channel {
        DEFAULT(-1),
        GENERAL(0),
        UNIT_SELECTION(1),
        UNIT_ACKNOWLEDGEMENT(2),
        UNIT_MOVEMENT(3),
        UNIT_READY(4),
        COMBAT(5),
        ERROR(6),
        MUSIC(7),
        USER_INTERFACE(8),
        MOVEMENT_LOOPING(9),
        AMBIENT(10),
        ANIMATION(11),
        BUILDING(12),
        BIRTH(13),
        FIRE(14);

        private final long id;
        Channel(long id) { this.id = id; }
        public long id() { return id; }
        private static final Map<Long, Channel> byId = new HashMap<Long, Channel>(16);
        static {
            for (Channel e : Channel.values())
                byId.put(e.id(), e);
        }
        public static Channel byId(long id) { return byId.get(id); }
    }

    public W3W3s(KaitaiStream _io) {
        this(_io, null, null);
    }

    public W3W3s(KaitaiStream _io, KaitaiStruct _parent) {
        this(_io, _parent, null);
    }

    public W3W3s(KaitaiStream _io, KaitaiStruct _parent, W3W3s _root) {
        super(_io);
        this._parent = _parent;
        this._root = _root == null ? this : _root;
        _read();
    }
    private void _read() {
        this.version = this._io.readU4le();
        this.numSound = this._io.readU4le();
        this.sound = new ArrayList<Sound>();
        for (int i = 0; i < numSound(); i++) {
            this.sound.add(new Sound(this._io, this, _root));
        }
    }
    public static class W3str extends KaitaiStruct {
        public static W3str fromFile(String fileName) throws IOException {
            return new W3str(new ByteBufferKaitaiStream(fileName));
        }

        public W3str(KaitaiStream _io) {
            this(_io, null, null);
        }

        public W3str(KaitaiStream _io, W3W3s.Sound _parent) {
            this(_io, _parent, null);
        }

        public W3str(KaitaiStream _io, W3W3s.Sound _parent, W3W3s _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.value = new String(this._io.readBytesTerm((byte) 0, false, true, true), Charset.forName("UTF-8"));
        }
        private String value;
        private W3W3s _root;
        private W3W3s.Sound _parent;
        public String value() { return value; }
        public W3W3s _root() { return _root; }
        public W3W3s.Sound _parent() { return _parent; }
    }
    public static class Sound extends KaitaiStruct {
        public static Sound fromFile(String fileName) throws IOException {
            return new Sound(new ByteBufferKaitaiStream(fileName));
        }

        public Sound(KaitaiStream _io) {
            this(_io, null, null);
        }

        public Sound(KaitaiStream _io, W3W3s _parent) {
            this(_io, _parent, null);
        }

        public Sound(KaitaiStream _io, W3W3s _parent, W3W3s _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.name = new W3str(this._io, this, _root);
            this.path = new W3str(this._io, this, _root);
            this.eax = new W3str(this._io, this, _root);
            this._raw_flags = this._io.readBytes(4);
            KaitaiStream _io__raw_flags = new ByteBufferKaitaiStream(_raw_flags);
            this.flags = new Flags(_io__raw_flags, this, _root);
            this.fadeInRate = this._io.readU4le();
            this.fadeOutRate = this._io.readU4le();
            this.volume = this._io.readS4le();
            this.pitch = this._io.readF4le();
            this.unknown1 = this._io.readU4le();
            this.unknown2 = this._io.readS4le();
            this.channel = W3W3s.Channel.byId(this._io.readS4le());
            this.minDistance = this._io.readF4le();
            this.maxDistance = this._io.readF4le();
            this.cutoffDistance = this._io.readF4le();
            this.unknown3 = this._io.readF4le();
            this.unknown4 = this._io.readF4le();
            this.unknown5 = this._io.readF4le();
            this.unknown6 = this._io.readU4le();
            this.unknown7 = this._io.readF4le();
            this.unknown8 = this._io.readF4le();
            if (_root().version() >= 3) {
                this.varName = new W3str(this._io, this, _root);
            }
            if (_root().version() >= 3) {
                this.internalSoundName = new W3str(this._io, this, _root);
            }
            if (_root().version() >= 3) {
                this.soundPath = new W3str(this._io, this, _root);
            }
            if (_root().version() >= 3) {
                this.unknown9 = this._io.readF4le();
            }
            if (_root().version() >= 3) {
                this.unknown10 = this._io.readU1();
            }
            if (_root().version() >= 3) {
                this.unknown11 = this._io.readU4le();
            }
            if (_root().version() >= 3) {
                this.unknown12 = this._io.readU4le();
            }
            if (_root().version() >= 3) {
                this.unknown13 = this._io.readU4le();
            }
            if (_root().version() >= 3) {
                this.unknown14 = this._io.readU1();
            }
            if (_root().version() >= 3) {
                this.unknown15 = this._io.readU4le();
            }
        }
        private W3str name;
        private W3str path;
        private W3str eax;
        private Flags flags;
        private long fadeInRate;
        private long fadeOutRate;
        private int volume;
        private float pitch;
        private long unknown1;
        private int unknown2;
        private Channel channel;
        private float minDistance;
        private float maxDistance;
        private float cutoffDistance;
        private float unknown3;
        private float unknown4;
        private float unknown5;
        private long unknown6;
        private float unknown7;
        private float unknown8;
        private W3str varName;
        private W3str internalSoundName;
        private W3str soundPath;
        private Float unknown9;
        private Integer unknown10;
        private Long unknown11;
        private Long unknown12;
        private Long unknown13;
        private Integer unknown14;
        private Long unknown15;
        private W3W3s _root;
        private W3W3s _parent;
        private byte[] _raw_flags;
        public W3str name() { return name; }
        public W3str path() { return path; }
        public W3str eax() { return eax; }
        public Flags flags() { return flags; }
        public long fadeInRate() { return fadeInRate; }
        public long fadeOutRate() { return fadeOutRate; }
        public int volume() { return volume; }
        public float pitch() { return pitch; }
        public long unknown1() { return unknown1; }
        public int unknown2() { return unknown2; }
        public Channel channel() { return channel; }
        public float minDistance() { return minDistance; }
        public float maxDistance() { return maxDistance; }
        public float cutoffDistance() { return cutoffDistance; }
        public float unknown3() { return unknown3; }
        public float unknown4() { return unknown4; }
        public float unknown5() { return unknown5; }
        public long unknown6() { return unknown6; }
        public float unknown7() { return unknown7; }
        public float unknown8() { return unknown8; }
        public W3str varName() { return varName; }
        public W3str internalSoundName() { return internalSoundName; }
        public W3str soundPath() { return soundPath; }
        public Float unknown9() { return unknown9; }
        public Integer unknown10() { return unknown10; }
        public Long unknown11() { return unknown11; }
        public Long unknown12() { return unknown12; }
        public Long unknown13() { return unknown13; }
        public Integer unknown14() { return unknown14; }
        public Long unknown15() { return unknown15; }
        public W3W3s _root() { return _root; }
        public W3W3s _parent() { return _parent; }
        public byte[] _raw_flags() { return _raw_flags; }
    }
    public static class Flags extends KaitaiStruct {
        public static Flags fromFile(String fileName) throws IOException {
            return new Flags(new ByteBufferKaitaiStream(fileName));
        }

        public Flags(KaitaiStream _io) {
            this(_io, null, null);
        }

        public Flags(KaitaiStream _io, W3W3s.Sound _parent) {
            this(_io, _parent, null);
        }

        public Flags(KaitaiStream _io, W3W3s.Sound _parent, W3W3s _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.isLooping = this._io.readBitsIntBe(1) != 0;
            this.isSound = this._io.readBitsIntBe(1) != 0;
            this.stopWhenOutOfRange = this._io.readBitsIntBe(1) != 0;
            this.isMusic = this._io.readBitsIntBe(1) != 0;
        }
        private boolean isLooping;
        private boolean isSound;
        private boolean stopWhenOutOfRange;
        private boolean isMusic;
        private W3W3s _root;
        private W3W3s.Sound _parent;
        public boolean isLooping() { return isLooping; }
        public boolean isSound() { return isSound; }
        public boolean stopWhenOutOfRange() { return stopWhenOutOfRange; }
        public boolean isMusic() { return isMusic; }
        public W3W3s _root() { return _root; }
        public W3W3s.Sound _parent() { return _parent; }
    }
    private long version;
    private long numSound;
    private ArrayList<Sound> sound;
    private W3W3s _root;
    private KaitaiStruct _parent;
    public long version() { return version; }
    public long numSound() { return numSound; }
    public ArrayList<Sound> sound() { return sound; }
    public W3W3s _root() { return _root; }
    public KaitaiStruct _parent() { return _parent; }
}
