package com.sample.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sample.model.WorkOrder;

public interface WorkOrderRepository extends JpaRepository<WorkOrder, Integer> {

}
