package com.sagar.studentmanagementapp.service;

import com.sagar.studentmanagementapp.dto.TeacherDTO;
import com.sagar.studentmanagementapp.dto.TeacherSaveDTO;
import com.sagar.studentmanagementapp.dto.TeacherUpdateDTO;

import java.util.List;

public interface TeacherService {
    String addTeacher(TeacherSaveDTO teacherSaveDTO);
    List<TeacherDTO> getAllTeachers();
    String updateTeacher(TeacherUpdateDTO teacherUpdateDTO);
    boolean deleteTeacher(int id);
}
