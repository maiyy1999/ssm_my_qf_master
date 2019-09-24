package com.myy.my.qf.web.api.user.web.controller;

import com.myy.my.qf.commons.dto.BaseResult;
import com.myy.my.qf.web.api.user.api.StudentApi;
import com.myy.my.qf.web.api.user.dto.StudentDto;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    // url:http://localhost:8080/user/findByStuNo?stuNo=1
    @RequestMapping("/findByStuNo")
    public BaseResult findByStuNo(Integer stuNo) throws Exception {
        StudentDto studentDto = StudentApi.findByStuNo(stuNo);
        return BaseResult.success("成功",studentDto);
    }
}
