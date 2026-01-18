package com.example.runner;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.entity.EmployeeDetails;
import com.example.service.IEmployeeMgmtService;

@Component
public class EmployeeTestRunner1 implements CommandLineRunner {

	private final IEmployeeMgmtService service;

	public EmployeeTestRunner1(IEmployeeMgmtService service) {
		this.service = service;
	}

	@Override
	public void run(String... args) throws Exception {
	
		EmployeeDetails emp=service.findByEmpId(2);
		System.out.println(emp.getEmpName()+"-----"+emp.getEmpRole()+"-----"+emp.getSalary()+"---"+emp.getMaritalStatus());
		byte[] empPhoto = emp.getEmpPhoto();
		char[] empBio = emp.getEmpResume();
		
		try (FileOutputStream fos = new FileOutputStream("RetrivePhoto.jpeg")){
			fos.write(empPhoto);
			fos.flush();			
		}
		try(FileWriter fw = new FileWriter("RetriveDoc.txt")){
			fw.write(empBio);
				fw.flush();
			
		}

	}

}
