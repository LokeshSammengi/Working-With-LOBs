package com.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name="LOB_Uploading_Docs_Pics")
@Data
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class EmployeeDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private Integer empid;
	
	@NonNull
	private String empName;
	
	@NonNull
	private String empRole;
	
	@NonNull
	private Boolean maritalStatus;
	
	@NonNull
	private Double salary;
	
	@Lob
	private byte[] empPhoto;
	
	@Lob
	private char[] empResume;
	
	
}
