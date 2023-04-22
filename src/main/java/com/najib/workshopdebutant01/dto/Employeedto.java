package com.najib.workshopdebutant01.dto;

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
public class Employeedto {
	
	private Long idEmp;
	private String fullname;
	private Integer age;
	private String email;
	private String tel;
	private Departementdto departementdto;
	
	
	public static Employee toEntity(Employeedto dto)
	
	{
		Employee emp =new Employee();
		
		emp.setIdEmp(dto.getIdEmp());
		emp.setFullname(dto.getFullname());
		emp.setEmail(dto.getEmail());
		emp.setAge(dto.getAge());
		emp.setTel(dto.getTel());
		emp.setDepartement(Departementdto.toEntity(dto.getDepartementdto()));
		return emp;
	}
	
	
	public static Employeedto FromEntity(Employee emp)
	{
		return Employeedto.builder()
				.idEmp(emp.getIdEmp())
				.fullname(emp.getFullname())
				.email(emp.getEmail())
				.age(emp.getAge())
				.tel(emp.getTel())
				.departementdto(Departementdto.FromEntity(emp.getDepartement()))
				.build();
		
	}
}
