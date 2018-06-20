package com.nenu.software.service.impl;

import com.nenu.software.common.entity.Student;
import com.nenu.software.mapper.StudentMapper;
import com.nenu.software.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 学生Service实现
 * @author shanjz
 * @since 2018/6/20 10:26
 */
@Service("studentService")
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;


    public void newStudent(Student student) throws Exception {
        studentMapper.newStudent(student);
    }
}
