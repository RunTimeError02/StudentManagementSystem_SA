package com.sagar.studentmanagementapp.repo;

import com.sagar.studentmanagementapp.entity.Batch;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BatchRepo extends JpaRepository<Batch,Integer> {
}
