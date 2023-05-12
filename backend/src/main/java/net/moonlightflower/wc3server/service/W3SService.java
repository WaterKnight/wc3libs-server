package net.moonlightflower.wc3server.service;

import io.kaitai.struct.ByteBufferKaitaiStream;
import net.moonlightflower.kaitai.W3W3s;
import net.moonlightflower.wc3server.service.dependency.KaitaiSerializer;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class W3SService {
    public String convertToJson(byte[] bytes) throws IOException {
        final W3W3s w3s = new W3W3s(new ByteBufferKaitaiStream(bytes));

        return KaitaiSerializer.serialize(w3s);
    }
}
