package com.najib.workshopdebutant01.service;

import java.util.List;

import com.najib.workshopdebutant01.dto.Employeedto;
import com.najib.workshopdebutant01.entite.Employee;
import com.najib.workshopdebutant01.exception.EmployeeNotFindException;

public interface EmployeeService {

	
	public void deliteByIdy(Long id );
	public Employeedto SaveOrUpdatEmployee(Employeedto dto);
	public Employeedto FindById(Long id) throws EmployeeNotFindException;
	public List<Employeedto> ListAllEmployee();
	
	public List<Employeedto> findByFullName(String LastName_FirstName);
	
}
