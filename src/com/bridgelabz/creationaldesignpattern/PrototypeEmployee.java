package com.bridgelabz.creationaldesignpattern;

import java.util.ArrayList;
import java.util.List;

public class PrototypeEmployee {
	private List<String> emplist;

	public PrototypeEmployee() {
		emplist = new ArrayList<String>();
	}

	public PrototypeEmployee(List<String> list) {
		this.emplist = list;
	}

	public void loadData() {
		emplist.add("Chetan");
		emplist.add("John");
		emplist.add("Pedro");
		emplist.add("Sachin");
		emplist.add("Danesh");
	}

	public List<String> getEmpList() {
		return emplist;
	}

	public Object clone() {
		List<String> temp = new ArrayList<String>();

		for (String s : this.getEmpList()) {
			temp.add(s);
		}

		return new PrototypeEmployee(temp);
	}
}

// I am on develop branch..