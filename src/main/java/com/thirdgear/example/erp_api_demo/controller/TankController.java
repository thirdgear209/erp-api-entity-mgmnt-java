package com.thirdgear.example.erp_api_demo.controller;

import org.aspectj.weaver.Iterators;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thirdgear.example.erp_api_demo.entity.Tank;
import com.thirdgear.example.erp_api_demo.service.TankService;

@RestController
@RequestMapping("/tanks")
public class TankController {
	
	
    @Autowired
    TankService tankService;

    @GetMapping
    public Iterable<Tank> getTanks(){
    	
    	Iterable<Tank> tanks =  tankService.getTanks();
    	
    	
    	for(Tank tank: tanks){
    		System.out.println(tank.toString());
    	};
    		
    		
    	
    	
        return tanks;
    } 
    
    

}
