package com.thirdgear.example.erp_api_demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.thirdgear.example.erp_api_demo.entity.WorkOrder;
import com.thirdgear.example.erp_api_demo.repo.WorkOrderRepository;
import com.thirdgear.example.erp_api_demo.service.WorkOrderService;

public class WorkOrderServiceImpl implements WorkOrderService{
	
	@Autowired 
	private WorkOrderRepository repo;

	@Override
	public Iterable<WorkOrder> getWorkOrders() {
		return repo.findAll();
	}
	
}