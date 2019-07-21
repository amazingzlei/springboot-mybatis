package com.fh.mybatis.mapper;


import com.fh.mybatis.domain.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

// 标明是一个mapper
//@Mapper
public interface StudentMapper {

    List<Student> getAllStudents();

    Student getStudentsByName(String name);
}
