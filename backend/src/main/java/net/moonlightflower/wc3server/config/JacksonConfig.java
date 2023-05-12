package net.moonlightflower.wc3server.config;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.Module;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import net.moonlightflower.kaitai.W3W3i;
import net.moonlightflower.wc3server.service.dependency.KaitaiSerializer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.swing.*;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.Timer;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

@Configuration
public class JacksonConfig {
    @Autowired
    private ObjectMapper objectMapper;
    @Bean
    public Module w3iModule() {
        final SimpleModule module = new SimpleModule() {};
        module.addSerializer(W3W3i.class, new StdSerializer<>(W3W3i.class) {
            @Override
            public void serialize(W3W3i value, JsonGenerator gen, SerializerProvider provider) throws IOException {
                gen.writeRaw(KaitaiSerializer.serialize(value));
            }
        });
        return module;
    }
}
