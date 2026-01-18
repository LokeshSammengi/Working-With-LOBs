package com.example.service;


import org.springframework.stereotype.Service;

import com.example.entity.EmployeeDetails;
import com.example.repo.IEmployeeRepo;

@Service
public class EmployeeMgmtService implements IEmployeeMgmtService {

	
	private final IEmployeeRepo empRepo;
	
	public EmployeeMgmtService(IEmployeeRepo repo) {
		this.empRepo = repo;
	}
	@Override
	public String saveEmployee(EmployeeDetails emp) {
		Integer id=empRepo.save(emp).getEmpid();
		return "emp is saved with id ::"+id;
	}
	@Override
	public EmployeeDetails findByEmpId(Integer id) {
		EmployeeDetails emp = empRepo.findById(id).orElseThrow(()->new IllegalArgumentException("invalid id number"));
		return emp;
	}

}
