package com.myy.my.qf.web.api.stu.dto;

public class StudentDto {
    private Integer stuNo;
    private String stuName;
    private String stuSex;
    private Integer stuAge;

    public StudentDto() {
    }

    public StudentDto(Integer stuNo, String stuName, String stuSex, Integer stuAge) {
        this.stuNo = stuNo;
        this.stuName = stuName;
        this.stuSex = stuSex;
        this.stuAge = stuAge;
    }

    public Integer getStuNo() {
        return stuNo;
    }

    public void setStuNo(Integer stuNo) {
        this.stuNo = stuNo;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getStuSex() {
        return stuSex;
    }

    public void setStuSex(String stuSex) {
        this.stuSex = stuSex;
    }

    public Integer getStuAge() {
        return stuAge;
    }

    public void setStuAge(Integer stuAge) {
        this.stuAge = stuAge;
    }
}
