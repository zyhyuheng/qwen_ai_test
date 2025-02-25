package com.example.ai.qwen.qwen_ai_test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ai.qwen.qwen_ai_test.service.AiFunctionAssistant;

import reactor.core.publisher.Flux;

@RestController
public class FunctionAssistantController {
    @Autowired
    private AiFunctionAssistant functionAssistant;

    @CrossOrigin("*") // 允许所有来源的请求
    @GetMapping(value = "/chat")
    public Flux<String> chat(String prompt) {
        return functionAssistant.chat(prompt);
    }

}
