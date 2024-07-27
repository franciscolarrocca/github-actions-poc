package com.fl.actions_poc.controller;

import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping(path = "/api")
public class ActionsRestController {

    @GetMapping("/add")
    public Map<String, Integer> add(@RequestParam int a, @RequestParam int b) {
        int result = a + b;
        return Map.of("result", result);
    }

    @GetMapping("/multiply")
    public Map<String, Integer> multiply(@RequestParam int a, @RequestParam int b) {
        int result = a * b;
        return Map.of("result", result);
    }


}