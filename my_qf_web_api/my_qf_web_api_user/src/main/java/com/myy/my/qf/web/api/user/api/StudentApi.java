package com.myy.my.qf.web.api.user.api;

import com.myy.my.qf.commons.utils.HttpClientUtils;
import com.myy.my.qf.commons.utils.MapperUtils;
import com.myy.my.qf.web.api.user.dto.StudentDto;
import org.apache.http.message.BasicNameValuePair;

import java.util.ArrayList;
import java.util.List;

public class StudentApi {
    //根据学号去stu的web工程去获取学生记录
    public static StudentDto findByStuNo(Integer stuNo) throws Exception {
        //1.设置要访问的服务器的URL
        String url = "http://localhost:8080/stu/findById";
        //2.设置要传递的参数
        List<BasicNameValuePair> paramlist = new ArrayList<>();
        paramlist.add(new BasicNameValuePair("stuNo",stuNo.toString()));

        //通过HttpClient发送请求给服务器获得响应结果
        String json = HttpClientUtils.doPost(url, new BasicNameValuePair("stuNo", stuNo.toString()));
        StudentDto studentDto = MapperUtils.json2pojoByTree(json, "data", StudentDto.class);
        return studentDto;

    }
}
