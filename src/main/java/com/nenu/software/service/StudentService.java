package com.nenu.software.service;

import com.nenu.software.common.entity.Student;

/**
 * 学生Service
 * @author shanjz
 * @since 2018/6/20 10:25
 */
public interface StudentService {
    /**
     * 新增学生
     * @param student 学生实体类
     * @throws Exception 异常
     */
    public void newStudent(Student student) throws Exception;
}
