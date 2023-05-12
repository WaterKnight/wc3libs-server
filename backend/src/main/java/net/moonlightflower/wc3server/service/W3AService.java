package net.moonlightflower.wc3server.service;

import io.kaitai.struct.ByteBufferKaitaiStream;
import net.moonlightflower.kaitai.W3W3a;
import net.moonlightflower.wc3server.service.dependency.KaitaiSerializer;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class W3AService {
    public String convertToJson(byte[] bytes) throws IOException {
        final W3W3a w3a = new W3W3a(new ByteBufferKaitaiStream(bytes));

        return KaitaiSerializer.serialize(w3a);
    }
}
