package net.moonlightflower.wc3server.controller;

import lombok.RequiredArgsConstructor;
import net.moonlightflower.wc3server.service.DooService;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@RestController
@RequestMapping("doo")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class DooController {
    private final DooService dooService;

    @CrossOrigin(origins = "*")
    @PostMapping(value = "", consumes = MediaType.APPLICATION_OCTET_STREAM_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> convert(HttpServletRequest request) throws IOException {
        return ResponseEntity.ok(dooService.convertToJson(request.getInputStream().readAllBytes()));
    }
}
