package com.najib.workshopdebutant01.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.najib.workshopdebutant01.dto.Departementdto;
import com.najib.workshopdebutant01.dto.Employeedto;
import com.najib.workshopdebutant01.entite.Departement;
import com.najib.workshopdebutant01.entite.Employee;
import com.najib.workshopdebutant01.exception.DepartementNotFindException;
import com.najib.workshopdebutant01.repository.DepartementRepository;
@Service
public class DepartementServiceImpl implements DepartementService {
    @Autowired
    private DepartementRepository departementRepository;
	@Override
	public void deliteByIdy(Long id) {
		// TODO Auto-generated method stub
		departementRepository.deleteById(id);
	}

	@Override
	public Departementdto SaveOrUpdatDepartement(Departementdto dto) {
		// TODO Auto-generated method stub
	    Departement dpt = departementRepository.save(Departementdto.toEntity(dto));
		return Departementdto.FromEntity(dpt);
	}

	@Override
	public Departementdto FindById(Long id) throws DepartementNotFindException {
	
		return Departementdto.FromEntity(departementRepository.findById(id).get());
	}

	@Override
	public List<Departementdto> ListAllDepartement() {
		// TODO Auto-generated method stub
		List<Departement> departements = departementRepository.findAll();
		return 	departements.stream().map(dpt->Departementdto.FromEntity(dpt)).collect(Collectors.toList());
	}

}
