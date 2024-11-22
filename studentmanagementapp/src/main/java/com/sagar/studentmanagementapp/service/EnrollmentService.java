package com.sagar.studentmanagementapp.service;

import com.sagar.studentmanagementapp.dto.EnrollmentDTO;
import com.sagar.studentmanagementapp.dto.EnrollmentSaveDTO;
import com.sagar.studentmanagementapp.dto.EnrollmentUpdateDTO;

import java.util.List;

public interface EnrollmentService {
    String addEnrollment(EnrollmentSaveDTO entrollmentSaveDTO);
    List<EnrollmentDTO> getAllEnrollments();
    String updateEnrollment(EnrollmentUpdateDTO enrollmentUpdateDTO);
    boolean deleteEnrollment(int id);
}
