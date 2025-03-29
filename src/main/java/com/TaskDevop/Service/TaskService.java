package com.TaskDevop.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.TaskDevop.Dao.TaskDao;
import com.TaskDevop.Entity.EmployeeEntity;
import com.TaskDevop.Exception.AgeValidationException;

@Service
public class TaskService {
	@Autowired
	private TaskDao td;
	
	public String postallemp(List<EmployeeEntity> emp)throws AgeValidationException {
		for (EmployeeEntity e : emp) {
            if (e.getAge() < 25) {
                throw new AgeValidationException("Employee age must be 25 or above. Invalid age: " + e.getAge());
            }
        }
       return td.postallemp(emp);
		
	}

	public EmployeeEntity getbyid(int a) {
		return td.getbyid(a);
	}

	public List<EmployeeEntity> getall() {
		return td.getall();
	}

}
