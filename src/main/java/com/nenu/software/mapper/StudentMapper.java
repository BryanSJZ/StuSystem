package com.nenu.software.mapper;

import com.nenu.software.common.entity.Student;
import org.springframework.stereotype.Repository;

/**
 * 学生Mapper
 * @author shanjz
 * @since 2018/6/20 10:23
 */
@Repository
public interface StudentMapper {

    /**
     * 新增学生
     * @param student 学生实体类
     * @throws Exception 异常
     */
    public void newStudent(Student student) throws Exception;
}
