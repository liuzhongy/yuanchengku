package com.bjpowernode.mybatis.dao;

import com.bjpowernode.mybatis.domain.Student;

import java.util.List;

public interface StudentDao {
    public void save(Student s);
    public Student getById(String id);
    List<Student> getAll();
}
