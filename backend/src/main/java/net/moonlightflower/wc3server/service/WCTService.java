package net.moonlightflower.wc3server.service;

import io.kaitai.struct.ByteBufferKaitaiStream;
import net.moonlightflower.kaitai.W3Wct;
import net.moonlightflower.wc3server.service.dependency.KaitaiSerializer;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class WCTService {
    public String convertToJson(byte[] bytes) throws IOException {
        final W3Wct wct = new W3Wct(new ByteBufferKaitaiStream(bytes));

        return KaitaiSerializer.serialize(wct);
    }
}
