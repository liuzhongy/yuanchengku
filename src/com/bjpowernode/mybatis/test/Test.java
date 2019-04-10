package com.bjpowernode.mybatis.test;

import com.bjpowernode.mybatis.domain.Student;
import com.bjpowernode.mybatis.service.StudentService;
import com.bjpowernode.mybatis.service.impl.StudentServiceImpl;
import com.bjpowernode.mybatis.util.ServiceFactory;

public class Test {
    public static void main(String[] args) {
        StudentService ss =  (StudentService) ServiceFactory.getService(new StudentServiceImpl());
        Student s = new Student();
        s.setId("A0006");
        s.setName("cxk");
        s.setAge(22);
        ss.save(s);
    }
}
