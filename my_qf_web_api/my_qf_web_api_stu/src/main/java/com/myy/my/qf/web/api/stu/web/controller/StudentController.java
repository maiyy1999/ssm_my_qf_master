package com.myy.my.qf.web.api.stu.web.controller;

import com.myy.my.qf.commons.dto.BaseResult;

import com.myy.my.qf.domain.Student;
import com.myy.my.qf.web.api.stu.dto.StudentDto;
import com.myy.my.qf.web.api.stu.service.StudentService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;
    @RequestMapping("/findById")
    public BaseResult findById(Integer stuNo){
        //1.从数据库查到的学生对象
        //student po
        Student student = studentService.findById(stuNo);
        //studentDto dto
        StudentDto studentDto = new StudentDto();
        BeanUtils.copyProperties(student,studentDto);
        return BaseResult.success("成功",studentDto);
    }
}
