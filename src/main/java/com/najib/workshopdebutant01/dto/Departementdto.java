package com.najib.workshopdebutant01.dto;

import com.najib.workshopdebutant01.entite.Departement;
import com.najib.workshopdebutant01.entite.Employee;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Departementdto {

	private Long iddpt;
	private String name;
	
	
public static Departement toEntity(Departementdto dto)
	
	{
	Departement dpt =new Departement();
		
	dpt.setIddpt(dto.getIddpt());
	dpt.setName(dto.getName());
	
		return dpt;
	}
	
	
	public static Departementdto FromEntity(Departement dpt)
	{
		return Departementdto.builder()
				.iddpt(dpt.getIddpt())
				.name(dpt.getName())
				
				.build();
		
	}
}
