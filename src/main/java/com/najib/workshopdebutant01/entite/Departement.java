package com.najib.workshopdebutant01.entite;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Departement {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long iddpt;
	private String name;
	
	@OneToMany(mappedBy = "departement")
	private List<Employee> employees;
	
	
}
