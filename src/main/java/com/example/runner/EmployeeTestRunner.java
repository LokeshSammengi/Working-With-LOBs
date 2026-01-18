package com.example.runner;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.util.Scanner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.entity.EmployeeDetails;
import com.example.service.IEmployeeMgmtService;

//@Component
public class EmployeeTestRunner implements CommandLineRunner {

	private final IEmployeeMgmtService service;

	public EmployeeTestRunner(IEmployeeMgmtService service) {
		this.service = service;
	}

	@Override
	public void run(String... args) throws Exception {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("enter the name");
			String name = sc.nextLine();
			System.out.println("enter the role");
			String role = sc.nextLine();
			System.out.println("enter the marital status");
			boolean ms = sc.nextBoolean();
			System.out.println("enter the salary");
			Double sal = sc.nextDouble();

			sc.nextLine();

			// now large object
			System.out.println("enter the location path of the photo object :");
			String photoPath = sc.nextLine();
			
			sc.nextLine();

			System.out.println("enter the location path of the resume doc");
			String resumePath = sc.nextLine().trim();

			// now we need to convert it into byte[]
			File file1 = new File(photoPath);
			byte[] photoArray = new byte[(int) file1.length()];
			try (FileInputStream fs = new FileInputStream(file1)) {
				photoArray = fs.readAllBytes();
				fs.close();
			}

			// now convert resumepath into the char[]

			File file2 = new File(resumePath);
			char[] resumeChar = new char[(int) file2.length()];
			try (FileReader fr = new FileReader(file2)) {
				fr.read(resumeChar);
				fr.close();
			}

			EmployeeDetails emp = new EmployeeDetails(name, role, ms, sal);
			emp.setEmpPhoto(photoArray);
			emp.setEmpResume(resumeChar);

			String msg = service.saveEmployee(emp);
			System.out.println(msg);

		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}

	}

}
