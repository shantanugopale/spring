package com.dao;

import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	List<Employee> findByNameAndAge(String name, int age);
	
	List<Employee> findByNameOrAge(String name, int age);
	
	List<Employee> findByName(String name);
	
 	List<Employee> findByNameIs(String name);
 	
 	List<Employee> findByNameEquals(String name);

 	List<Employee> findBySalaryBetween(Double Sal1, Double sal2);
 	
 	List<Employee> findByAgeLessThan(int age);
 	
 	List<Employee> findByAgeLessThanEqual(int age);
 	
 	List<Employee> findByAgeGreaterThan(int age);

 	List<Employee> findByAgeGreaterThanEqual(int age);
 	
 	List<Employee> findByAgeAfter(int age);
 	
 	List<Employee> findByAgeBefore(int age);
 	
 	List<Employee> findByNameLike(String name);
 	
 	List<Employee> findByNameIgnoreCase(String name);
 	
 	List<Employee> findByAgeIn(Collection<Integer> ages);


    

	
}
