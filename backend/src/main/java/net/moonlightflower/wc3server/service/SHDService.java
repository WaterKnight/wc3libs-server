package net.moonlightflower.wc3server.service;

import io.kaitai.struct.ByteBufferKaitaiStream;
import net.moonlightflower.kaitai.W3Shd;
import net.moonlightflower.wc3server.service.dependency.KaitaiSerializer;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class SHDService {
    public String convertToJson(byte[] bytes) throws IOException {
        final W3Shd shd = new W3Shd(new ByteBufferKaitaiStream(bytes));

        return KaitaiSerializer.serialize(shd);
    }
}
