package com.example.ai.qwen.qwen_ai_test.service;

import com.example.ai.qwen.qwen_ai_test.entity.Score;
import com.example.ai.qwen.qwen_ai_test.entity.Student;
import com.example.ai.qwen.qwen_ai_test.mapper.ScoreMapper;
import com.example.ai.qwen.qwen_ai_test.mapper.StudentMapper;

import dev.langchain4j.agent.tool.P;
import dev.langchain4j.agent.tool.Tool;

import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

/**
 * 服务名称需注册到AiFunctionAssistant中
 */
@Service
public class ScoreService {
    private final ScoreMapper scoreMapper;
    private final StudentMapper studentMapper;

    public ScoreService(ScoreMapper scoreMapper, StudentMapper studentMapper) {
        this.scoreMapper = scoreMapper;
        this.studentMapper = studentMapper;
    }

    /**
     * 根据学生ID查询所有科目成绩
     * @param studentId 学生ID
     * @return 成绩列表
     */
    public List<Score> getScoresByStudentId(Long studentId) {
        return scoreMapper.selectByStudentId(studentId);
    }

    /**
     * 根据学生姓名查询各科成绩
     * @param name 学生姓名
     * @return 成绩列表
     */
    @Tool("根据学生姓名查询各科成绩")
    public List<Score> getScoresByStudentName(@P("学生姓名")String name) {
        Long studentId = studentMapper.selectIdByName(name);
        if(studentId == null) {
            return Collections.emptyList();
        }
        return scoreMapper.selectByStudentId(studentId);
    }

    /**
     * 查询指定科目及格的学生
     * @param subject 科目名称
     * @param passScore 及格分数
     * @return 及格学生列表
     */
    @Tool("查询指定科目及格的学生")
    public List<Student> getPassingStudents(@P("科目名称")String subject, @P("及格分数")Double passScore) {
        return studentMapper.selectPassingStudents(subject, passScore);
    }

    /**
     * 查询分数大于指定值的学生
     * @param minScore 最低分数
     * @return 符合条件的学生列表
     */
    @Tool("查询分数大于指定值的学生")
    public List<Student> getStudentsByScoreGreaterThan(@P("最低分数")Double minScore) {
        return studentMapper.selectStudentsByMinScore(minScore);
    }

    @Tool("查询所有学生信息")
    public List<Student> findAllStudents() {
        return studentMapper.findAll();
    }

    @Tool("查询所有成绩信息")
    public List<Score> findAllScores() {
        return scoreMapper.findAll();
    }
}