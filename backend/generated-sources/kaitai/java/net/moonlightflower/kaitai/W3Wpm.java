// This is a generated file! Please edit source .ksy file and use kaitai-struct-compiler to rebuild

package net.moonlightflower.kaitai;

import io.kaitai.struct.ByteBufferKaitaiStream;
import io.kaitai.struct.KaitaiStruct;
import io.kaitai.struct.KaitaiStream;
import java.io.IOException;
import java.util.ArrayList;

public class W3Wpm extends KaitaiStruct {
    public static W3Wpm fromFile(String fileName) throws IOException {
        return new W3Wpm(new ByteBufferKaitaiStream(fileName));
    }

    public W3Wpm(KaitaiStream _io) {
        this(_io, null, null);
    }

    public W3Wpm(KaitaiStream _io, KaitaiStruct _parent) {
        this(_io, _parent, null);
    }

    public W3Wpm(KaitaiStream _io, KaitaiStruct _parent, W3Wpm _root) {
        super(_io);
        this._parent = _parent;
        this._root = _root == null ? this : _root;
        _read();
    }
    private void _read() {
        this.fileId = new W3id(this._io);
        this.version = this._io.readU4le();
        this.width = this._io.readU4le();
        this.height = this._io.readU4le();
        this.pathingNode = new ArrayList<Integer>();
        for (int i = 0; i < (width() * height()); i++) {
            this.pathingNode.add(this._io.readU1());
        }
    }
    private W3id fileId;
    private long version;
    private long width;
    private long height;
    private ArrayList<Integer> pathingNode;
    private W3Wpm _root;
    private KaitaiStruct _parent;
    public W3id fileId() { return fileId; }
    public long version() { return version; }
    public long width() { return width; }
    public long height() { return height; }
    public ArrayList<Integer> pathingNode() { return pathingNode; }
    public W3Wpm _root() { return _root; }
    public KaitaiStruct _parent() { return _parent; }
}
