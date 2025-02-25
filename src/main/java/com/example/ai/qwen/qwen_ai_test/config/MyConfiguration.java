package com.example.ai.qwen.qwen_ai_test.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dev.langchain4j.model.chat.listener.ChatModelErrorContext;
import dev.langchain4j.model.chat.listener.ChatModelListener;
import dev.langchain4j.model.chat.listener.ChatModelRequestContext;
import dev.langchain4j.model.chat.listener.ChatModelResponseContext;

@Configuration
public class MyConfiguration {
    
    /**
     * 监听器，用于记录AI请求、响应和错误信息
     * @return
     */
    @Bean
    ChatModelListener chatModelListener() {
        return new ChatModelListener() {

            // 定义一个日志记录器
            private static final Logger log = LoggerFactory.getLogger(ChatModelListener.class);

            // 当收到请求时，记录请求信息
            @Override
            public void onRequest(ChatModelRequestContext requestContext) {
                log.info("onRequest(): {}", requestContext.chatRequest());
            }

            // 当收到响应时，记录响应信息
            @Override
            public void onResponse(ChatModelResponseContext responseContext) {
                log.info("onResponse(): {}", responseContext.chatResponse());
            }

            // 当发生错误时，记录错误信息
            @Override
            public void onError(ChatModelErrorContext errorContext) {
                log.info("onError(): {}", errorContext.error().getMessage());
            }
        };
    }
}
