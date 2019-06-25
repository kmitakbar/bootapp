package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/emp")
public class EmployeeCtrl {

	static List<Employee> list=new ArrayList<>();
	
	@RequestMapping("/list")
	public List<Employee> getEmployees(){
		list.add(new Employee(UUID.randomUUID().toString(), "Akbar", "male"));
		return list;
	}
	
	@RequestMapping(value="/create",method = RequestMethod.POST)
	public Employee createEmployee(@RequestBody Employee employee){
		employee.setEid(UUID.randomUUID().toString());
		list.add(employee);
		return employee;
	}
}
