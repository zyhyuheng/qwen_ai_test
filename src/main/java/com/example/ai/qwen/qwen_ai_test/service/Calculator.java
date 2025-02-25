package com.example.ai.qwen.qwen_ai_test.service;

import org.springframework.stereotype.Component;

import dev.langchain4j.agent.tool.Tool;

@Component
public class Calculator {
    @Tool("计算字符串的长度")
    int stringLength(String s) {
        System.out.println("调用字符串长度 s='" + s + "'");
        return s.length();
    }

    @Tool("计算两个数字的和")
    int add(int a, int b) {
        System.out.println("调用加法 a=" + a + ", b=" + b);
        return a + b;
    }

    @Tool("计算一个数字的平方根")
    double sqrt(int x) {
        System.out.println("调用平方根 x=" + x);
        return Math.sqrt(x);
    }

}
