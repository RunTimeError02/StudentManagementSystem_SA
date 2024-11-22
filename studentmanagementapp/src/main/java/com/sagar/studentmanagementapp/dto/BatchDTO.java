package com.sagar.studentmanagementapp.dto;
import com.sagar.studentmanagementapp.entity.Course;
import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class BatchDTO {
    private int batchid;
    private String batchname;
    private Course course;
    private String startdate;
}
