package com.sample.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.model.WorkOrder;
import com.sample.repository.WorkOrderRepository;

@Service
public class WorkOrderService {
	@Autowired
	private WorkOrderRepository workOrderRepository;
	
	public static class WorkOrdersDto{
		public int woId;
		public String woName;
		public LocalDate creationDate;
		public String description;
		public String teamName;
		public String location;
	}
	
	public List<WorkOrdersDto> getAllWOs() {
		
		List<WorkOrder> wos = workOrderRepository.findAll();
		List<WorkOrdersDto> wosData = new ArrayList<>();
		
		for(WorkOrder wo : wos) {
			WorkOrdersDto wodto = new WorkOrdersDto();
			wodto.woId = wo.getId();
			wodto.woName = wo.getName();
			wodto.creationDate = wo.getCreationDate();
			wodto.description = wo.getDescription();
			wodto.teamName = wo.getTeam().getName();
			wodto.location = wo.getTeam().getLocation();
			
			wosData.add(wodto);
		}
		
		return wosData;
	}

}
