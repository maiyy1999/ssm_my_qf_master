package com.myy.my.qf.web.api.stu.service.impl;

import com.myy.my.qf.domain.Student;
import com.myy.my.qf.web.api.stu.service.StudentService;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {
    @Override
    public Student findById(Integer stuNo) {
        return new Student(1,"张三","男",26);
    }
}
