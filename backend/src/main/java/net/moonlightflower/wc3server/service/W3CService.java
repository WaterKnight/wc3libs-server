package net.moonlightflower.wc3server.service;

import io.kaitai.struct.ByteBufferKaitaiStream;
import net.moonlightflower.kaitai.W3W3c;
import net.moonlightflower.wc3server.service.dependency.KaitaiSerializer;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class W3CService {
    public String convertToJson(byte[] bytes) throws IOException {
        final W3W3c w3c = new W3W3c(new ByteBufferKaitaiStream(bytes));

        return KaitaiSerializer.serialize(w3c);
    }
}
