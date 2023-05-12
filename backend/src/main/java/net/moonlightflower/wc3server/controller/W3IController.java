package net.moonlightflower.wc3server.controller;

import lombok.RequiredArgsConstructor;
import net.moonlightflower.kaitai.W3W3i;
import net.moonlightflower.wc3server.service.W3IService;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@RestController
@RequestMapping("w3i")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class W3IController {
    private final W3IService w3IService;

    @CrossOrigin(origins = "*")
    @PostMapping(value = "", consumes = MediaType.APPLICATION_OCTET_STREAM_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<W3W3i> convert(HttpServletRequest request) throws IOException {
        return ResponseEntity.ok(w3IService.convertToJson(request.getInputStream().readAllBytes()));
    }
}
