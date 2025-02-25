package com.example.ai.qwen.qwen_ai_test;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.ai.qwen.qwen_ai_test.mapper")
public class QwenAiTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(QwenAiTestApplication.class, args);
	}

}
