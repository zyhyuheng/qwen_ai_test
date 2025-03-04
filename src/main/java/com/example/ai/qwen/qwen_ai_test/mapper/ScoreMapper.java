package com.example.ai.qwen.qwen_ai_test.mapper;

import com.example.ai.qwen.qwen_ai_test.entity.Score;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ScoreMapper {
    List<Score> selectByStudentId(Long studentId);
    int insert(Score score);
    int update(Score score);
    int delete(Long id);
    Score selectById(Long id);
    List<Score> findAll();
}