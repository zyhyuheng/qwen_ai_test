package com.example.ai.qwen.qwen_ai_test.service;

import dev.langchain4j.service.spring.AiService;
import reactor.core.publisher.Flux;

/**
 * tools中配置的是包含@Tool注解的bean名称，
 * 注册在springboot容器中的名称，
 * 如果为自定义设置则默认为类名首字母小写
 */
@AiService(tools = { "calculator","myTestAiService","scoreService" })
public interface AiFunctionAssistant {
    /**
     * AI 函数调用聊天入口
     * 
     * @param message
     * @return
     */
    Flux<String> chat(String message);
}
