package com.sample.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="team")
public class Team {
	
	@Id
	@SequenceGenerator(name = "seq_team_id", sequenceName = "seq_team_id", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_team_id")
	@Column(name = "team_id")
	private int id;
	
	@Column(name = "team_name")
	private String name;
	
	@Column(name = "location")
	private String location;

	@OneToMany(mappedBy="team")
	private List<WorkOrder> workOrder;
	
	@ManyToMany
	List<Employee> employees;

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public List<WorkOrder> getWorkOrder() {
		return workOrder;
	}

	public void setWorkOrder(List<WorkOrder> workOrder) {
		this.workOrder = workOrder;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

}
