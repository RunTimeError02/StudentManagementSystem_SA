package com.sagar.studentmanagementapp.repo;

import com.sagar.studentmanagementapp.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepo extends JpaRepository<Teacher,Integer>{
}
