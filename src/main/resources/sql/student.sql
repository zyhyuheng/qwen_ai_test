-- 学生表结构
CREATE TABLE students (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(50) NOT NULL,
    class_name VARCHAR(20) NOT NULL,
    age INT NOT NULL,
    gender VARCHAR(10) NOT NULL
);

-- 测试数据
INSERT INTO students (name, class_name, age, gender) VALUES
('张三', '三年一班', 15, '男'),
('李四', '三年一班', 14, '男'),
('王五', '三年二班', 15, '男'),
('赵六', '三年二班', 14, '女'),
('陈七', '三年三班', 15, '男');
