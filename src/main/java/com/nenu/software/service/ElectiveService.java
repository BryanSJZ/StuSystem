package com.nenu.software.service;


import com.nenu.software.common.entity.Elective;

import java.util.List;

/**
 * 选修信息Service
 * @author shanjz
 * @since 2018/6/21 9:02
 */
public interface ElectiveService {

    /**
     * 新增选修课程
     */
    public void newElective(Elective elective) throws Exception;

    /**
     * 根据条件删除选修课程
     */
    public void deleteElectiveByConditions(Integer id,
                                           Integer stuId,
                                           Integer courseId) throws Exception;

    /**
     * 更新选修信息
     */
    public void updateElective(Elective elective) throws Exception;

    /**
     * 根据id查找选修信息
     */
    public Elective selectElectiveById(Integer id) throws Exception;

    /**
     * 根据条件查找选修信息
     */
    public List<Elective> listElectiveByConditions(Integer stuId,
                                                   Integer courseId) throws Exception;

}
