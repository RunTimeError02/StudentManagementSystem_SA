package com.sagar.studentmanagementapp.dto;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class StudentDTO {
    private int studentid;

    private String studentname;

    private String address;

    private String phone;

}
