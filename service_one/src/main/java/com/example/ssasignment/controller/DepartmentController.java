package com.example.ssasignment.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ssasignment.entity.Department;
import com.example.ssasignment.service.DepartmentService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {

	  @Autowired
	   private DepartmentService departmentService;
	  
	  @PostMapping("/")
	  public Department saveDepartment(@RequestBody Department department) {
	        System.out.println("Inside saveDepartment method of DepartmentController");
	        return  departmentService.saveDepartment(department);
	    }
	  
	  @GetMapping("/{id}")
	    public Department findDepartmentById(@PathVariable("id") Long departmentId) {
	        System.out.println("Inside findDepartmentById method of DepartmentController");
	        return departmentService.findDepartmentById(departmentId);
	    }
	  
	  @GetMapping("/findall")
		public List<Department> getall()
		{
			List<Department> l1 = new ArrayList<Department>();
			
			l1 = departmentService.getAll();
			
			return l1;
			
		}
	  
}
