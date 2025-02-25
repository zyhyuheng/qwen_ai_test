package com.example.ai.qwen.qwen_ai_test.mapper;

import java.util.List;

import com.example.ai.qwen.qwen_ai_test.entity.MyTest;

public interface MyTestMapper {
    List<MyTest> findByNameAndEmailAndAge(String name, String email, int age);

    List<MyTest> findAll();
}
