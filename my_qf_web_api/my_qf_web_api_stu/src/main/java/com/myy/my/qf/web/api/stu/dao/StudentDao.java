package com.myy.my.qf.web.api.stu.dao;


import com.myy.my.qf.domain.Student;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface StudentDao {
    public List<Student> findAll();
    public int getCount();

    // 按条件查询
    public List<Student> findByCondition1(Student stu);
    public List<Student> findByCondition2(Map<String, Object> map);

    // CRUD
    public int saveStudent1(Student stu);
    public int saveStudent2(Student stu);
    public int updateStudent(Student stu);
    public int deleteStudent(int stuNo);

    public Student findById(int stuNo);
}
