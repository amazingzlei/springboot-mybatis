package com.fh.mybatis.controller;

import com.fh.mybatis.domain.Student;
import com.fh.mybatis.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class StudentController {


    @Autowired
    private StudentMapper studentMapper;

    @RequestMapping("getAll")
    @ResponseBody
    public List<Student> getAll(){
        List<Student> list = studentMapper.getAllStudents();
        return list;
    }

    @RequestMapping("getByName")
    @ResponseBody
    public Student getById(@RequestParam("name")String name){
        return studentMapper.getStudentsByName(name);
    }
}
