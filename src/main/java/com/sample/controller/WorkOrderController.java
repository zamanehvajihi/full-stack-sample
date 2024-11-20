package com.sample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sample.service.WorkOrderService;
import com.sample.service.WorkOrderService.WorkOrdersDto;

@RestController
public class WorkOrderController {
	
	@Autowired
	private WorkOrderService workOrderService;

	@GetMapping("/getWorkOrders")
	public List<WorkOrdersDto> getWorkOrders() {
		
		return workOrderService.getAllWOs();
	}
	

}
