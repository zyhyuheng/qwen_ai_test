package com.example.ai.qwen.qwen_ai_test.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import dev.langchain4j.agent.tool.P;
import dev.langchain4j.agent.tool.Tool;

public class InvoiceHandler {
    private static final Logger LOGGER = LoggerFactory.getLogger(InvoiceHandler.class);
    @Tool("根据用户提交的开票信息进行开票")
    public String handle(@P("公司名称") String companyName, String dutyNumber,@P("金额保留两位有效数字") String amount) {
        LOGGER.info("companyName =>>>> {} dutyNumber =>>>> {} amount =>>>> {}", companyName, dutyNumber, amount);
        return "开票成功";
    }
}
