package net.moonlightflower.wc3server.service.dependency;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;

public class KaitaiSerializer {
    public static byte[] serializeBinary(Object data) throws IOException {
        SimpleBeanPropertyFilter theFilter = SimpleBeanPropertyFilter
                .serializeAllExcept("_io", "_parent", "_root");
        FilterProvider filters = new SimpleFilterProvider()
                .addFilter("myFilter", theFilter);

        final ByteArrayOutputStream bos = new ByteArrayOutputStream();

        new ObjectMapper()
                .configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false)
                .setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY)
                //.setVisibility(PropertyAccessor.GETTER, JsonAutoDetect.Visibility.PUBLIC_ONLY)
                .setAnnotationIntrospector(new JacksonAnnotationIntrospector(){
                    @Override
                    public boolean hasIgnoreMarker(final AnnotatedMember m) {
                        final List<String> exclusions = Arrays.asList("_io", "_parent", "_root");
                        return exclusions.contains(m.getName()) || m.getName().startsWith("_raw") || super.hasIgnoreMarker(m);
                    }
                })
                .writer(filters)
                .writeValue(bos, data);

        return bos.toByteArray();
    }

    public static String serialize(Object data) throws IOException {
        SimpleBeanPropertyFilter theFilter = SimpleBeanPropertyFilter
                .serializeAllExcept("_io", "_parent", "_root");
        FilterProvider filters = new SimpleFilterProvider()
                .addFilter("myFilter", theFilter);

        final ByteArrayOutputStream bos = new ByteArrayOutputStream();

        new ObjectMapper()
                .configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false)
                .setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY)
                //.setVisibility(PropertyAccessor.GETTER, JsonAutoDetect.Visibility.PUBLIC_ONLY)
                .setAnnotationIntrospector(new JacksonAnnotationIntrospector(){
                    @Override
                    public boolean hasIgnoreMarker(final AnnotatedMember m) {
                        final List<String> exclusions = Arrays.asList("_io", "_parent", "_root");
                        return exclusions.contains(m.getName()) || m.getName().startsWith("_raw") || super.hasIgnoreMarker(m);
                    }
                })
                .writer(filters)
                .writeValue(bos, data);

        return bos.toString(StandardCharsets.UTF_8);
    }
}
