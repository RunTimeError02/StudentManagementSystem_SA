package com.sagar.studentmanagementapp.dto;
import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class CourseUpdateDTO {
    private int courseid;
    private String coursename;
    private String syllabus;
    private String duration;
}
