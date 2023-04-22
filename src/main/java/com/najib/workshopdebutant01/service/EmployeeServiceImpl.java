package com.najib.workshopdebutant01.service;

import java.util.List;import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.najib.workshopdebutant01.dto.Employeedto;
import com.najib.workshopdebutant01.entite.Employee;
import com.najib.workshopdebutant01.exception.EmployeeNotFindException;
import com.najib.workshopdebutant01.repository.EmplyoeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{
@Autowired
	private EmplyoeeRepository emplyoeeRepository;
	
	@Override
	public void deliteByIdy(Long id) {
		// TODO Auto-generated method stub
		emplyoeeRepository.deleteById(id);
		
	}

	@Override
	public Employeedto SaveOrUpdatEmployee(Employeedto dto) {
		// TODO Auto-generated method stub
		Employee emp =  Employeedto.toEntity(dto);
		Employee empsavet = emplyoeeRepository.save(emp);
		Employeedto empdto = Employeedto.FromEntity(empsavet);
		return empdto;
	}

	@Override
	public Employeedto FindById(Long id) throws EmployeeNotFindException {
		// TODO Auto-generated method stub
		Employee emp = emplyoeeRepository.findById(id).orElseThrow(()-> new EmployeeNotFindException("EmployeeNexistepas"));
		Employeedto empdto = Employeedto.FromEntity(emp);
		return empdto;
	}

	@Override
	public List<Employeedto> ListAllEmployee() {
		// TODO Auto-generated method stub
		List<Employee> employees = emplyoeeRepository.findAll();
		List<Employeedto> employeedtos = employees.stream().map(emp->Employeedto.FromEntity(emp)).collect(Collectors.toList()); 
		return employeedtos;
	}

	@Override
	public List<Employeedto> findByFullName(String LastName_FirstName) {
		// TODO Auto-generated method stub
		List<Employee> employees = emplyoeeRepository.getFullName(LastName_FirstName);
		List<Employeedto> employeedtos = employees.stream().map(emp->Employeedto.FromEntity(emp)).collect(Collectors.toList()); 
		return employeedtos;
	}
	
	

}
