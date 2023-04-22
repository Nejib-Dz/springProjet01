package com.najib.workshopdebutant01.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.najib.workshopdebutant01.entite.Employee;
@RepositoryRestResource
public interface EmplyoeeRepository extends JpaRepository<Employee, Long> {
	
	@Query("select e from Employee e where e.fullname like %:x% ")
	public List<Employee> getFullName(@Param("x") String LastName_FirstName );
	
	/*
	 @Query("select e from Employee e where e.fullName like %:x% and e.email like %:y%")
	public Employee getFullNameEmail(@Param("x") String nom,@Param("y") String email );*/
	

}
