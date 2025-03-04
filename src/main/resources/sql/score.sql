-- 成绩表结构
CREATE TABLE scores (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    student_id BIGINT NOT NULL,
    subject VARCHAR(50) NOT NULL,
    score DECIMAL(5,2) NOT NULL,
    term VARCHAR(20) NOT NULL,
    FOREIGN KEY (student_id) REFERENCES students(id)
);

-- 测试数据
INSERT INTO scores (student_id, subject, score, term) VALUES
(1, '语文', 85.5, '2023-2024上学期'),
(1, '数学', 92.0, '2023-2024上学期'),
(2, '语文', 78.0, '2023-2024上学期'),
(2, '英语', 58.5, '2023-2024上学期'),
(3, '物理', 90.5, '2023-2024下学期'),
(4, '化学', 88.0, '2023-2024下学期'),
(5, '生物', 95.5, '2023-2024下学期'),
(3, '数学', 62.0, '2023-2024下学期'),
(4, '英语', 59.0, '2023-2024下学期'),
(5, '地理', 77.5, '2023-2024下学期');