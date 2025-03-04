package com.example.ai.qwen.qwen_ai_test.mapper;

import com.example.ai.qwen.qwen_ai_test.entity.Student;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StudentMapper {
    Long selectIdByName(String name);
    List<Student> selectPassingStudents(String subject, Double passScore);
    List<Student> selectStudentsByMinScore(Double minScore);
    int insert(Student student);
    int update(Student student);
    int delete(Long id);
    Student selectById(Long id);
    List<Student> findAll();
}