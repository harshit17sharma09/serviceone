
package com.example.ssasignment.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ssasignment.entity.Department;
import com.example.ssasignment.repository.DepartmentRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class DepartmentService {


    @Autowired
    private DepartmentRepository departmentRepository;
 
    public Department saveDepartment(Department department) {
    	System.out.println("Inside saveDepartment of DepartmentService");
        return departmentRepository.save(department);
    }

    public Department findDepartmentById(Long departmentId) {
    	System.out.println("Inside findDepartmentId of DepartmentService");
        return departmentRepository.findByDepartmentId(departmentId);
    }

	public List<Department> getAll() {
		// TODO Auto-generated method stub
		System.out.println("Inside getAll of DepartmentService");
		return  departmentRepository.findAll();
		
	}
}
