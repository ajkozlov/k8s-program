package com.ms.intro.controller;

import com.ms.intro.dto.ResponseDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequiredArgsConstructor
@RequestMapping("/health")
public class HealthController {

    @Value("${song-properties.version}")
    private Integer version;

    @GetMapping
    public ResponseEntity<ResponseDTO> healthCheck() {
        var responseDto = new ResponseDTO();
        responseDto.setVersion(version);
        return ResponseEntity.ok(responseDto);
    }


}
