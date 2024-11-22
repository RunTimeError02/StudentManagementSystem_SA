package com.sagar.studentmanagementapp.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;
@AllArgsConstructor
@NoArgsConstructor
@Data

public class StudentSaveDTO {
    private String studentname;

    private String address;

    private String phone;
}
