package com.sagar.studentmanagementapp.service;

import com.sagar.studentmanagementapp.dto.CourseDTO;
import com.sagar.studentmanagementapp.dto.CourseSaveDTO;
import com.sagar.studentmanagementapp.dto.CourseUpdateDTO;

import java.util.List;

public interface CourseService {
    String addCourse(CourseSaveDTO courseSaveDTO);
    List<CourseDTO> getAllCourses();
    String updateCourse(CourseUpdateDTO courseUpdateDTO);
    boolean deleteCourse(int id);
}
