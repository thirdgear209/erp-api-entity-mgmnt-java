package com.thirdgear.example.erp_api_demo.entity_mgmnt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thirdgear.example.erp_api_demo.entity.Tank;
import com.thirdgear.example.erp_api_demo.service.TankManagementService;
import com.thirdgear.example.erp_api_demo.service.TankService;

@RestController
@RequestMapping("/tank")
public class TankMgmntController {
	
    @Autowired
    TankManagementService tankService;

    @GetMapping
    public Iterable<Tank> getTanks(){
    	
    	Iterable<Tank> tanks = tankService.getTanks();
    	
        return tanks;
    } 
    
    @PostMapping    
    public Tank post(Tank tank){
        tankService.createTank(tank);
    }

    @PutMapping
    public Tank put(Tank tank){
        tankService.updateTank(tank);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id){
        tankService.archiveTank(id);
    }

}
