package com.sagar.studentmanagementapp.repo;

import com.sagar.studentmanagementapp.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepo extends JpaRepository<Course,Integer> {
}
