package com.sagar.studentmanagementapp.service;

import com.sagar.studentmanagementapp.dto.StudentDTO;
import com.sagar.studentmanagementapp.dto.StudentSaveDTO;
import com.sagar.studentmanagementapp.dto.StudentUpdateDTO;

import java.util.List;

public interface StudentService {
    String addStudent(StudentSaveDTO studentSaveDTO);
    List<StudentDTO> getAllStudents();
    String updateStudent(StudentUpdateDTO studentUpdateDTO);
    boolean deleteStudent(int id);
}
