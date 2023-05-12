package net.moonlightflower.wc3server.service;

import io.kaitai.struct.ByteBufferKaitaiStream;
import net.moonlightflower.kaitai.W3Wpm;
import net.moonlightflower.wc3server.service.dependency.KaitaiSerializer;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class WPMService {
    public String convertToJson(byte[] bytes) throws IOException {
        final W3Wpm wpm = new W3Wpm(new ByteBufferKaitaiStream(bytes));

        return KaitaiSerializer.serialize(wpm);
    }
}
