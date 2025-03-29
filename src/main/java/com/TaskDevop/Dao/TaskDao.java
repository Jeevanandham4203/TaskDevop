package com.TaskDevop.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.TaskDevop.Entity.EmployeeEntity;
import com.TaskDevop.Repository.TaskRepository;

@Repository
public class TaskDao {
	@Autowired
	private TaskRepository tr;
	public String postallemp(List<EmployeeEntity> emp) {
		tr.saveAll(emp);
		return "Posted successfully";
	}
	public EmployeeEntity getbyid(int a) {
		return tr.findById(a).get();
	}
	public List<EmployeeEntity> getall() {
		return tr.findAll();
	}
	
}
