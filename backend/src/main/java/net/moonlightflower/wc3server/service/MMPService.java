package net.moonlightflower.wc3server.service;

import io.kaitai.struct.ByteBufferKaitaiStream;
import net.moonlightflower.kaitai.W3Mmp;
import net.moonlightflower.wc3server.service.dependency.KaitaiSerializer;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class MMPService {
    public String convertToJson(byte[] bytes) throws IOException {
        final W3Mmp mmp = new W3Mmp(new ByteBufferKaitaiStream(bytes));

        return KaitaiSerializer.serialize(mmp);
    }
}
