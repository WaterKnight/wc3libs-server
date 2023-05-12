package net.moonlightflower.wc3server.service;

import io.kaitai.struct.ByteBufferKaitaiStream;
import net.moonlightflower.kaitai.W3Doo;
import net.moonlightflower.wc3server.service.dependency.KaitaiSerializer;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class DooService {
    public String convertToJson(byte[] bytes) throws IOException {
        final W3Doo doo = new W3Doo(new ByteBufferKaitaiStream(bytes));

        return KaitaiSerializer.serialize(doo);
    }
}
