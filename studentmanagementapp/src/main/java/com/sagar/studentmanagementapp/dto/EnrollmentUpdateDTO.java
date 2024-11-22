package com.sagar.studentmanagementapp.dto;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class EnrollmentUpdateDTO {
    private int enrollid;
    private int student_id;
    private int batch_id;
    private String joindate;
    private int fee;
}
