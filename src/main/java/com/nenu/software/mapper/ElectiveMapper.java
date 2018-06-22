package com.nenu.software.mapper;

import com.nenu.software.common.entity.Elective;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 选修课程Mapper
 * @author shanjz
 * @since 2018/6/21 9:16
 */
public interface ElectiveMapper {

    /**
     * 新增选修课程
     */
    public void newElective(@Param("elective") Elective elective) throws Exception;

    /**
     * 根据条件删除选修课程
     */
    public void deleteElectiveByConditions(@Param("id") Integer id,
                                           @Param("stuId") Integer stuId,
                                           @Param("courseId") Integer courseId) throws Exception;

    /**
     * 更新选修信息
     */
    public void updateElective(@Param("elective") Elective elective) throws Exception;

    /**
     * 根据id查找选修信息
     */
    public Elective selectElectiveById(@Param("id") Integer id) throws Exception;

    /**
     * 根据条件查找选修信息
     */
    public List<Elective> listElectiveByConditions(@Param("stuId") Integer stuId,
                                                   @Param("courseId") Integer courseId) throws Exception;

}
