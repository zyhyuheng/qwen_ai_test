package com.example.ai.qwen.qwen_ai_test.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ai.qwen.qwen_ai_test.entity.MyTest;
import com.example.ai.qwen.qwen_ai_test.mapper.MyTestMapper;

import dev.langchain4j.agent.tool.Tool;

/**
 * 服务名称需注册到AiFunctionAssistant中
 */
@Service
public class MyTestAiService {

    private static final Logger LOGGER = LoggerFactory.getLogger(MyTestAiService.class);

    @Autowired
    private MyTestMapper myTestMapper;

    @Tool("根据姓名、邮箱和年龄查询")
    public List<MyTest> getMyTestList(String name,String email,int age){
        LOGGER.info("name:{},email:{},age:{}",name,email,age);
        return myTestMapper.findByNameAndEmailAndAge(name,email,age);
    }

    @Tool("查询所有用户数据，json格式返回")
    public List<MyTest> getMyAll(){
        LOGGER.info("findAll");
        return myTestMapper.findAll();
    }
}
