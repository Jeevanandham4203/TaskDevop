package com.TaskDevop.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.TaskDevop.Entity.EmployeeEntity;
import com.TaskDevop.Exception.AgeValidationException;
import com.TaskDevop.Service.TaskService;

@RestController
@RequestMapping("/Task")
public class TaskController {
	@Autowired
	private TaskService ts;
	
	@GetMapping("/TaskName")
	public String getMethodName() {
		return "DevopTask";
	}
	
	@GetMapping("/UseTools")
	public String getToolname() {
		return "Here We use Jenkins,Putty and AWS Tool for hosting our Local application to remote";
	}
	@GetMapping("/name/{a}")
	public String getName(@PathVariable String a) {
		return "hey "+a+" you're a Unique and Well talented person beleive that ✨";
	}
	
	@PostMapping("/postall")
	public String postallemp(@RequestBody List<EmployeeEntity> emp)throws AgeValidationException {
		return ts.postallemp(emp);
	}
	
	@GetMapping("/getbyid/{a}")
	public EmployeeEntity getbyid(@PathVariable int a) {
		return ts.getbyid(a);
	}
	@GetMapping("/getAll")
	public List<EmployeeEntity> getall() {
		return ts.getall();
	}
	
	
}






