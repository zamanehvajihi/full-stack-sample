package com.sample.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "work_order")
public class WorkOrder {
	
	@Id
	@SequenceGenerator(name = "seq_work_order_id", sequenceName = "seq_work_order_id", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_work_order_id")
	@Column(name = "work_order_id")
	private int id;
	
	@Column(name = "work_order_name")
	private String name;
	
	@Column(name = "creation_date")
	private LocalDate creationDate;
	
	@Column(name = "is_active")
	private Boolean isActive;
	
	@Column(name = "description")
	private String description;
	
	@ManyToOne
	@JoinColumn(name = "team_id")
	private Team team;

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(LocalDate creationDate) {
		this.creationDate = creationDate;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Team getTeam() {
		return team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}
	
}
