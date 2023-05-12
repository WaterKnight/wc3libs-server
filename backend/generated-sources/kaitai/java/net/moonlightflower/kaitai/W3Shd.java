// This is a generated file! Please edit source .ksy file and use kaitai-struct-compiler to rebuild

package net.moonlightflower.kaitai;

import io.kaitai.struct.ByteBufferKaitaiStream;
import io.kaitai.struct.KaitaiStruct;
import io.kaitai.struct.KaitaiStream;
import java.io.IOException;
import java.util.ArrayList;

public class W3Shd extends KaitaiStruct {
    public static W3Shd fromFile(String fileName) throws IOException {
        return new W3Shd(new ByteBufferKaitaiStream(fileName));
    }

    public W3Shd(KaitaiStream _io) {
        this(_io, null, null);
    }

    public W3Shd(KaitaiStream _io, KaitaiStruct _parent) {
        this(_io, _parent, null);
    }

    public W3Shd(KaitaiStream _io, KaitaiStruct _parent, W3Shd _root) {
        super(_io);
        this._parent = _parent;
        this._root = _root == null ? this : _root;
        _read();
    }
    private void _read() {
        this.shadowNode = new ArrayList<Integer>();
        {
            int i = 0;
            while (!this._io.isEof()) {
                this.shadowNode.add(this._io.readU1());
                i++;
            }
        }
    }
    private ArrayList<Integer> shadowNode;
    private W3Shd _root;
    private KaitaiStruct _parent;
    public ArrayList<Integer> shadowNode() { return shadowNode; }
    public W3Shd _root() { return _root; }
    public KaitaiStruct _parent() { return _parent; }
}
