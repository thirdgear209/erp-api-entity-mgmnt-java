package com.thirdgear.example.erp_api_demo.repo;


import org.springframework.data.repository.CrudRepository;

import com.thirdgear.example.erp_api_demo.entity.WorkOrder;


public interface WorkOrderRepository extends CrudRepository<WorkOrder, Long>{
	
}