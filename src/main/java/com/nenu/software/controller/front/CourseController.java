package com.nenu.software.controller.front;

import com.nenu.software.common.entity.Course;
import com.nenu.software.service.ClassService;
import com.nenu.software.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author shanjz
 * @since 2018/6/21 19:00
 */
@Controller
@RequestMapping("/course")
public class CourseController {


    @Autowired
    private CourseService courseService;


//    @RequestMapping("queryAllCourse")
//    @ResponseBody
//    public List<Course> queryAllCourse() {
//
//    }















}
