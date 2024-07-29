package com.fl.actions_poc.controller.rest;

import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping(path = "/api")
public class ActionsRestController {

    @GetMapping("/add")
    public Map<String, Integer> add(@RequestParam int a, @RequestParam int b) {
        validateArguments(a, b);
        int result = a + b;
        return Map.of("result", result);
    }

    @GetMapping("/multiply")
    public Map<String, Integer> multiply(@RequestParam int a, @RequestParam int b) {
        validateArguments(a, b);
        int result = a * b;
        return Map.of("result", result);
    }

    private void validateArguments(int a, int b) {
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException("Both arguments 'a' and 'b' must be positive");
        }
    }


}