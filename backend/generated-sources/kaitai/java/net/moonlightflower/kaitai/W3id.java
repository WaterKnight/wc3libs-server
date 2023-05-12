// This is a generated file! Please edit source .ksy file and use kaitai-struct-compiler to rebuild

package net.moonlightflower.kaitai;

import io.kaitai.struct.ByteBufferKaitaiStream;
import io.kaitai.struct.KaitaiStruct;
import io.kaitai.struct.KaitaiStream;
import java.io.IOException;
import java.nio.charset.Charset;

public class W3id extends KaitaiStruct {
    public static W3id fromFile(String fileName) throws IOException {
        return new W3id(new ByteBufferKaitaiStream(fileName));
    }

    public W3id(KaitaiStream _io) {
        this(_io, null, null);
    }

    public W3id(KaitaiStream _io, KaitaiStruct _parent) {
        this(_io, _parent, null);
    }

    public W3id(KaitaiStream _io, KaitaiStruct _parent, W3id _root) {
        super(_io);
        this._parent = _parent;
        this._root = _root == null ? this : _root;
        _read();
    }
    private void _read() {
        this.value = new String(this._io.readBytes(4), Charset.forName("ASCII"));
    }
    private String value;
    private W3id _root;
    private KaitaiStruct _parent;
    public String value() { return value; }
    public W3id _root() { return _root; }
    public KaitaiStruct _parent() { return _parent; }
}
