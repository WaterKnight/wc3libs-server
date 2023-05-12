package net.moonlightflower.wc3server.service;

import io.kaitai.struct.ByteBufferKaitaiStream;
import net.moonlightflower.kaitai.W3W3i;
import net.moonlightflower.wc3server.service.dependency.KaitaiSerializer;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class W3IService {
    public W3W3i convertToJson(byte[] bytes) throws IOException {
        return new W3W3i(new ByteBufferKaitaiStream(bytes));
    }
}
