package com.thirdgear.example.erp_api_demo.service;

import org.springframework.stereotype.Service;

import com.thirdgear.example.erp_api_demo.entity.TankType;

@Service
public interface TankTypeService{
	
	public Iterable<TankType>getTankTypes();
}