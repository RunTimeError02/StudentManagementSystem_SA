package com.sagar.studentmanagementapp.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class StudentUpdateDTO {
    private int studentid;

    private String studentname;

    private String address;

    private String phone;
}
