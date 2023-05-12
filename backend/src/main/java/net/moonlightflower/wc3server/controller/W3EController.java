package net.moonlightflower.wc3server.controller;

import lombok.RequiredArgsConstructor;
import net.moonlightflower.wc3server.service.W3EService;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@RestController
@RequestMapping("w3e")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class W3EController {
    private final W3EService w3EService;

    @CrossOrigin(origins = "*")
    @PostMapping(value = "", consumes = MediaType.APPLICATION_OCTET_STREAM_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> convert(HttpServletRequest request) throws IOException {
        return ResponseEntity.ok(w3EService.convertToJson(request.getInputStream().readAllBytes()));
    }
}
