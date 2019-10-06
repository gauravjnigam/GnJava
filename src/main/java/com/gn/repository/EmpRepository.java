package com.gn.repository;

import java.util.List;

import com.gn.model.Employee;

public interface EmpRepository {

	List<Employee> getAll();

}