package com.sagar.studentmanagementapp.controller;
import com.sagar.studentmanagementapp.dto.*;
import com.sagar.studentmanagementapp.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("api/v1/course")
public class CourseController {
    @Autowired
    private CourseService courseService;
    @PostMapping(path = "/save")
    public String saveCourse(@RequestBody CourseSaveDTO courseSaveDTO)
    {
        String course = courseService.addCourse(courseSaveDTO);
        return course;
    }
    @GetMapping("/getAllCourses")
    public List<CourseDTO> getAllStudents()
    {
        List<CourseDTO> allCourses = courseService.getAllCourses();
        return allCourses;
    }
    @PutMapping(path = "/update")
    public String updateCourse(@RequestBody CourseUpdateDTO courseUpdateDTO)
    {
        String course = courseService.updateCourse(courseUpdateDTO);
        return course;
    }
    @DeleteMapping(path = "/delete/{id}")
    public String deleteCourse(@PathVariable(value = "id")int id)
    {
        boolean deleteCourse = courseService.deleteCourse(id);
        return "deletedddddd!!!!";
    }
}
