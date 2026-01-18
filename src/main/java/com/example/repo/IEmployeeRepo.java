package com.example.repo;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.EmployeeDetails;


public interface IEmployeeRepo extends JpaRepository<EmployeeDetails,Integer>{

}
