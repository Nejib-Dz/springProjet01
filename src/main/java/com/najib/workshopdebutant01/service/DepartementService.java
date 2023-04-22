package com.najib.workshopdebutant01.service;

import java.util.List;

import com.najib.workshopdebutant01.dto.Departementdto;
import com.najib.workshopdebutant01.dto.Employeedto;
import com.najib.workshopdebutant01.exception.DepartementNotFindException;
import com.najib.workshopdebutant01.exception.EmployeeNotFindException;

public interface DepartementService {

	
	public void deliteByIdy(Long id );
	public Departementdto SaveOrUpdatDepartement(Departementdto dto);
	public Departementdto FindById(Long id) throws DepartementNotFindException;
	public List<Departementdto> ListAllDepartement();
}
