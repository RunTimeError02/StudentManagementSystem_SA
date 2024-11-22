package com.sagar.studentmanagementapp.service;

import com.sagar.studentmanagementapp.dto.BatchDTO;
import com.sagar.studentmanagementapp.dto.BatchSaveDTO;
import com.sagar.studentmanagementapp.dto.BatchUpdateDTO;

import java.util.List;

public interface BatchService {
    String addBatch(BatchSaveDTO batchSaveDTO);
    List<BatchDTO> getAllBatches();
    String updateBatch(BatchUpdateDTO batchUpdateDTO);
    boolean deleteBatch(int id);
}
