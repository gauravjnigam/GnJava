package com.gn.repository;

import java.util.ArrayList;
import java.util.List;

import com.gn.model.Employee;

public class EmpRepositoryImp implements EmpRepository {

	/* (non-Javadoc)
	 * @see com.gn.repository.EmpRepository#getAll()
	 */
	@Override
	public List<Employee> getAll(){
		List<Employee> employees = new ArrayList<>();
		
		Employee e1 = new Employee();
		e1.setEmpId(1);
		e1.setFirstName("Gaurav");
		e1.setLastName("Nigam");
		
		employees.add(e1);
		
		return employees;
		
	}
}
