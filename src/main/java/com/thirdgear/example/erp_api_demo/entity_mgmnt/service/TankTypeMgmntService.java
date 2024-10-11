package com.thirdgear.example.erp_api_demo.entity_mgmnt.service;

import java.util.List;

import com.thirdgear.example.erp_api_demo.entity.Tank;
import com.thirdgear.example.erp_api_demo.entity.TankType;

public interface TankTypeMgmntService {
	/**
	 * 
	 * @param tank
	 * @return
	 */
	public Tank createTankType(TankType tankType);
	
	/**
	 * 
	 */
	public void updateTankType(TankType tankType);
	
	/**
	 * 
	 */
	public void archiveTankType(long id);
	
	/**
	 * 
	 * @param id
	 * @return
	 */
	public TankType getById(int id);
	
	/**
	 * 
	 * @return
	 */
	public List<TankType>getTankTypes();
}
