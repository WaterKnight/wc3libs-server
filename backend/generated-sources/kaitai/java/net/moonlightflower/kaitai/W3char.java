// This is a generated file! Please edit source .ksy file and use kaitai-struct-compiler to rebuild

package net.moonlightflower.kaitai;

import io.kaitai.struct.ByteBufferKaitaiStream;
import io.kaitai.struct.KaitaiStruct;
import io.kaitai.struct.KaitaiStream;
import java.io.IOException;
import java.nio.charset.Charset;

public class W3char extends KaitaiStruct {
    public static W3char fromFile(String fileName) throws IOException {
        return new W3char(new ByteBufferKaitaiStream(fileName));
    }

    public W3char(KaitaiStream _io) {
        this(_io, null, null);
    }

    public W3char(KaitaiStream _io, KaitaiStruct _parent) {
        this(_io, _parent, null);
    }

    public W3char(KaitaiStream _io, KaitaiStruct _parent, W3char _root) {
        super(_io);
        this._parent = _parent;
        this._root = _root == null ? this : _root;
        _read();
    }
    private void _read() {
        this.value = new String(this._io.readBytes(1), Charset.forName("ASCII"));
    }
    private String value;
    private W3char _root;
    private KaitaiStruct _parent;
    public String value() { return value; }
    public W3char _root() { return _root; }
    public KaitaiStruct _parent() { return _parent; }
}
