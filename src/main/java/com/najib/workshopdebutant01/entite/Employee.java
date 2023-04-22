package com.najib.workshopdebutant01.entite;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.najib.workshopdebutant01.dto.Employeedto;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Employee {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)	
	private Long idEmp;
	private String fullname;
	private Integer age;
	@Column (unique=true)
	private String email;
	private String tel;
	
	@ManyToOne
	private Departement departement;
}
