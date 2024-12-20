package com.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.EmployeeRepository;
import com.model.Employee;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository repo;

	public void check() {

		// insertMultipleRecords();

		//getREcordById();

		//findAllByIds();

		//countRecords();

		//existsById();

		//deleteUsingObject();

		//deleteByID();

		//deleteAllByIds();

		//deleteAllRecords();

	}

	private void deleteAllRecords() {
		repo.deleteAll();
		System.out.println("ALl Records Deleted..!");
	}

	private void deleteAllByIds() {
		List<Integer> eList = Arrays.asList(103, 104, 105);

		repo.deleteAllById(eList);
		System.out.println("Multiple Records Deleted..!");
	}

	private void deleteByID() {
		repo.deleteById(102);
		System.out.println("Deleted..!");
	}

	private void deleteUsingObject() {
		Employee e1 = repo.findById(101).get();

		repo.delete(e1);
		System.out.println("Record Deleted..!");
	}

	private void existsById() {
		boolean flag = repo.existsById(107);
		if (flag) {
			System.out.println("Employee Exists...!");
		} else {
			System.out.println("Employee Doesn't Exists...!");
		}
	}

	private void countRecords() {
		long count = repo.count();
		System.out.println("Total Number of Employees:" + count);
	}

	private void findAllByIds() {
		List<Integer> ids = Arrays.asList(101, 103, 105);

		List<Employee> eList = repo.findAllById(ids);
		System.out.println(eList);
	}

	private void getREcordById() {
		Employee e1 = repo.findById(101).get();
		System.out.println(e1);
	}

	private void insertMultipleRecords() {
		Employee e1 = new Employee(101, "Akash", 887765345678l, 90000);
		Employee e2 = new Employee(102, "Mahesh", 88765345678l, 80000);
		Employee e3 = new Employee(103, "Raj", 77765345678l, 70000);
		Employee e4 = new Employee(104, "Isha", 768765345678l, 50000);
		Employee e5 = new Employee(105, "Ankita", 87765345678l, 40000);

		List<Employee> eList = Arrays.asList(e1, e2, e3, e4, e5);

		repo.saveAll(eList);
		System.out.println("All employees Saved..!");
	}
}
