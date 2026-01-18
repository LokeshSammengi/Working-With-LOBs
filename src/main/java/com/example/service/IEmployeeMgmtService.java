package com.example.service;

import com.example.entity.EmployeeDetails;

public interface IEmployeeMgmtService {

	public String saveEmployee(EmployeeDetails emp);
	public EmployeeDetails findByEmpId(Integer id);
}
