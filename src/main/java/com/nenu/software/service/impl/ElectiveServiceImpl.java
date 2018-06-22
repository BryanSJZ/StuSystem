package com.nenu.software.service.impl;

import com.nenu.software.common.entity.Elective;
import com.nenu.software.mapper.ElectiveMapper;
import com.nenu.software.service.ElectiveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 选修信息Service实现类
 * @author shanjz
 * @since 2018/6/21 9:32
 */
@Service("electiveService")
public class ElectiveServiceImpl implements ElectiveService {

    @Autowired
    private ElectiveMapper electiveMapper;

    public void newElective(Elective elective) throws Exception {
        electiveMapper.newElective(elective);
    }

    public void deleteElectiveByConditions(Integer id, Integer stuId, Integer courseId) throws Exception {
        electiveMapper.deleteElectiveByConditions(id, stuId, courseId);
    }

    public void updateElective(Elective elective) throws Exception {
        electiveMapper.updateElective(elective);
    }

    public Elective selectElectiveById(Integer id) throws Exception {
        return electiveMapper.selectElectiveById(id);
    }

    public List<Elective> listElectiveByConditions(Integer stuId, Integer courseId) throws Exception {
        return electiveMapper.listElectiveByConditions(stuId, courseId);
    }
}
