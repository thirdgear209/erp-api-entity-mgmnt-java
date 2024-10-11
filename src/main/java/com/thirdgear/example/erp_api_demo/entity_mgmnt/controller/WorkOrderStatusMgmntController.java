package com.thirdgear.example.erp_api_demo.entity_mgmnt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thirdgear.example.erp_api_demo.entity.OperationCode;
import com.thirdgear.example.erp_api_demo.entity.Tank;
import com.thirdgear.example.erp_api_demo.entity.WorkOrderStatus;
import com.thirdgear.example.erp_api_demo.entity_mgmnt.service.WorkOrderStatusMgmntService;

@RestController
@RequestMapping("/workOrder")
public class WorkOrderStatusMgmntController {
		
	@Autowired
	WorkOrderStatusMgmntService woStatusService;
	
	@GetMapping
    public Iterable<WorkOrderStatus> listWorkOrderStatues(){
    	
    	Iterable<WorkOrderStatus> statuses = woStatusService.listWorkOrderStatus();
    	
        return statuses;
    } 
    
    @PostMapping    
    public WorkOrderStatus post(WorkOrderStatus status){
    	woStatusService.createWorkOrderStatus(status);
    }

    @PutMapping
    public WorkOrderStatus put(WorkOrderStatus status){
    	woStatusService.updateWorkOrderStatus(status);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id){
    	woStatusService.archiveWorkOrderStatus(id);
    }
}
