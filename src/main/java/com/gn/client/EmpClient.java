package com.gn.client;

import java.util.List;

import com.gn.model.Employee;
import com.gn.service.EmpService;
import com.gn.service.EmpServiceImp;

public class EmpClient {
	public static void main(String[] args) {
		
		EmpService empSvc = new EmpServiceImp();
		List<Employee> empList = empSvc.getAll();
		
		System.out.println(empList.get(0).getFirstName());
		
		
	}

}
