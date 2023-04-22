package com.najib.workshopdebutant01.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.najib.workshopdebutant01.dto.Departementdto;
import com.najib.workshopdebutant01.exception.DepartementNotFindException;
import com.najib.workshopdebutant01.service.DepartementService;

@RestController
@RequestMapping("api/v1/departement")
@CrossOrigin( "http://localhost:4200")
public class DepartementController {
   
	@Autowired
	private DepartementService departementservice;
   @DeleteMapping("/delete/{id}")
	public void deliteByIdy(@PathVariable Long id) {
		departementservice.deliteByIdy(id);
	}
    @PostMapping("/save")
	public Departementdto SaveOrUpdatDepartement(@RequestBody Departementdto dto) {
		return departementservice.SaveOrUpdatDepartement(dto);
	}
    @GetMapping("/finById/{id}")
	public Departementdto FindById(@PathVariable Long id) throws DepartementNotFindException {
		return departementservice.FindById(id);
	}
    @GetMapping("/liste")
	public List<Departementdto> ListAllDepartement() {
		return departementservice.ListAllDepartement();
	}
	
}
