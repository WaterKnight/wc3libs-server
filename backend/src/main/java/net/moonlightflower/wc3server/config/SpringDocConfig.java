package net.moonlightflower.wc3server.config;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import io.swagger.v3.core.converter.AnnotatedType;
import io.swagger.v3.core.converter.ModelConverter;
import io.swagger.v3.core.converter.ModelConverters;
import io.swagger.v3.core.converter.ResolvedSchema;
import io.swagger.v3.core.jackson.ModelResolver;
import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.media.Schema;
import net.moonlightflower.kaitai.W3W3i;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;
import java.util.List;

@Configuration
public class SpringDocConfig {
    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI().components(new Components()
            .addSchemas("W3W3i", getSchemaWithDifferentDescription(W3W3i.class, "work Address" ))
        );
    }

    @Autowired
    private ObjectMapper objectMapper;

    @Autowired
    JacksonConfig jacksonConfig;

    private Schema getSchemaWithDifferentDescription(Class className, String description){
        SimpleBeanPropertyFilter theFilter = SimpleBeanPropertyFilter
                .serializeAllExcept("_io", "_parent", "_root");
        FilterProvider filters = new SimpleFilterProvider()
                .addFilter("myFilter", theFilter);

        final ByteArrayOutputStream bos = new ByteArrayOutputStream();

        ObjectMapper newObjectMapper = new ObjectMapper()
                .configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false)
                .setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY)
                //.setVisibility(PropertyAccessor.GETTER, JsonAutoDetect.Visibility.PUBLIC_ONLY)
                .setAnnotationIntrospector(new JacksonAnnotationIntrospector(){
                    @Override
                    public boolean hasIgnoreMarker(final AnnotatedMember m) {
                        final List<String> exclusions = Arrays.asList("_io", "_parent", "_root");
                        return exclusions.contains(m.getName()) || m.getName().startsWith("_raw") || super.hasIgnoreMarker(m);
                    }
                });

        newObjectMapper.writer(filters);

        ModelResolver modelResolver = new ModelResolver(newObjectMapper);
        //final ModelConverters converters = ModelConverters.getInstance().getConverters().get(0);
        //converters.addConverter(new ModelResolver(objectMapper));
        ModelConverters modelConverters = ModelConverters.getInstance();
        modelConverters.addConverter(modelResolver);
        ResolvedSchema resolvedSchema = modelConverters
                .resolveAsResolvedSchema(
                        new AnnotatedType(className).resolveAsRef(false));
        return resolvedSchema.schema;
    }
}
