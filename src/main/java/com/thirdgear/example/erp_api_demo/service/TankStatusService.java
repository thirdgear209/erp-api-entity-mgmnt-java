package com.thirdgear.example.erp_api_demo.service;

import org.springframework.stereotype.Service;

import com.thirdgear.example.erp_api_demo.entity.TankStatus;


public interface TankStatusService{
	
	public Iterable<TankStatus>getTankStatuses();
		
}