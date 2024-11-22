package com.sagar.studentmanagementapp.repo;

import com.sagar.studentmanagementapp.entity.Enrollment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnrollmentRepo  extends JpaRepository<Enrollment,Integer> {
}
