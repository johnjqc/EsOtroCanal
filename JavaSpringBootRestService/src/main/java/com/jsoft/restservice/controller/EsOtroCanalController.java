package com.jsoft.restservice.controller;

import com.jsoft.restservice.dto.ResponseViewDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "videos")
public class EsOtroCanalController {

    @GetMapping(produces = "application/json")
    public ResponseViewDto getVideos() {

        return new ResponseViewDto("videos");
    }
}
