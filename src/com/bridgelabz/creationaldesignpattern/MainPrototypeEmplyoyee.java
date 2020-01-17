package com.bridgelabz.creationaldesignpattern;

import java.util.List;

public class MainPrototypeEmplyoyee {
	
	public static void main(String[] args) {
	PrototypeEmployee employee = new PrototypeEmployee();
	employee.loadData();
	
	
	// use the clone method to get the Employee Object :
	
	PrototypeEmployee employee1 = (PrototypeEmployee) employee.clone();
	PrototypeEmployee employee2 = (PrototypeEmployee) employee.clone();
		
	List<String> list1 = employee1.getEmpList();
	list1.add("Narayan");
	
	List<String> list2 = employee2.getEmpList();
	list2.remove("Chetan");
	
	System.out.println("Original Employee Object : "+employee.getEmpList());
	System.out.println("Modified Employee 1 : "+employee1.getEmpList());
	System.out.println("Modified Employee 2 : "+employee2.getEmpList()
	);
	
	}

}
// I am on develop branch ..