package com.sagar.studentmanagementapp.dto;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class TeacherSaveDTO {
    private String teachername;
    private String address;
    private String phone;
}
