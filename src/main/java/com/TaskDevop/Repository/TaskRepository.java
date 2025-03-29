package com.TaskDevop.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.TaskDevop.Entity.EmployeeEntity;

public interface TaskRepository extends JpaRepository<EmployeeEntity, Integer>{

}
