package com.sagar.studentmanagementapp.dto;

import com.sagar.studentmanagementapp.entity.Batch;
import com.sagar.studentmanagementapp.entity.Student;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class EnrollmentDTO {
    private int enrollid;
    private Student student;
    private Batch batch;
    private String joindate;
    private int fee;
}
