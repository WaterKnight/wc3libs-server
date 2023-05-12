package net.moonlightflower.wc3server.service;

import io.kaitai.struct.ByteBufferKaitaiStream;
import net.moonlightflower.kaitai.W3W3v;
import net.moonlightflower.wc3libs.bin.Wc3BinInputStream;
import net.moonlightflower.wc3server.service.dependency.KaitaiSerializer;
import org.springframework.stereotype.Service;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import net.moonlightflower.wc3libs.bin.Packed;

@Service
public class W3VService {
    public String convertToJson(byte[] bytes) throws IOException {
        final byte[] bytesUncompressed = Packed.decompress(new Wc3BinInputStream(new ByteArrayInputStream(bytes))).writeToByteArray();
        final W3W3v w3v = new W3W3v(new ByteBufferKaitaiStream(bytesUncompressed));

        return KaitaiSerializer.serialize(w3v);
    }
}
