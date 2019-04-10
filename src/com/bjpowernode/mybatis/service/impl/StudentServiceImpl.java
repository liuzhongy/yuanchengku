package com.bjpowernode.mybatis.service.impl;

import com.bjpowernode.mybatis.dao.StudentDao;
import com.bjpowernode.mybatis.domain.Student;
import com.bjpowernode.mybatis.service.StudentService;
import com.bjpowernode.mybatis.util.SqlSessionUtil;

import java.util.List;

public class StudentServiceImpl implements StudentService {
    private StudentDao studentDao= SqlSessionUtil.getSessin().getMapper(StudentDao.class);
    public void save(Student s){
        studentDao.save(s);
    }
    public Student getById(String id){
        Student s = studentDao.getById(id);
        return s;
    }
    public List<Student> getAll(){
    List<Student> sList = studentDao.getAll();
    return sList;

    }
}
