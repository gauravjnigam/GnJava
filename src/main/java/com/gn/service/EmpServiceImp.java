package com.gn.service;

import java.util.List;

import com.gn.model.Employee;
import com.gn.repository.EmpRepository;
import com.gn.repository.EmpRepositoryImp;

public class EmpServiceImp implements EmpService {

	// hard coded empRepo 
	// - 
	private EmpRepository empRepo = new EmpRepositoryImp();

	public List<Employee> getAll() {
		return empRepo.getAll();
	}

}
