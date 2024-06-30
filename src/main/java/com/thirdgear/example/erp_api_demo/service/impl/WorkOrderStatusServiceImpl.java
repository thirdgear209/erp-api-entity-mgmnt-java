package com.thirdgear.example.erp_api_demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.thirdgear.example.erp_api_demo.entity.WorkOrderStatus;
import com.thirdgear.example.erp_api_demo.repo.WorkOrderStatusRepository;
import com.thirdgear.example.erp_api_demo.service.WorkOrderStatusService;

public class WorkOrderStatusServiceImpl implements WorkOrderStatusService{

	@Autowired
	private WorkOrderStatusRepository repo;
	
	@Override
	public Iterable<WorkOrderStatus> getAllWorkOrderStatuses() {
		return repo.findAll();
	}
	
}