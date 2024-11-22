package com.sagar.studentmanagementapp.dto;


import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class BatchUpdateDTO {
    private int batchid;
    private String batchname;
    private int courseid;
    private String startdate;
}
