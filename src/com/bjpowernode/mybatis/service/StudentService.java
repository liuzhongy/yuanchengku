package com.bjpowernode.mybatis.service;

import com.bjpowernode.mybatis.domain.Student;

import java.util.List;

public interface StudentService {
    public void save(Student s);
    public Student getById(String id);
    List<Student> getAll();
}
