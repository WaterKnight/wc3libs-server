package net.moonlightflower.wc3server.service;

import io.kaitai.struct.ByteBufferKaitaiStream;
import net.moonlightflower.kaitai.W3DooUnits;
import net.moonlightflower.wc3server.service.dependency.KaitaiSerializer;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class DooUnitsService {
    public String convertToJson(byte[] bytes) throws IOException {
        final W3DooUnits dooUnits = new W3DooUnits(new ByteBufferKaitaiStream(bytes));

        return KaitaiSerializer.serialize(dooUnits);
    }
}
