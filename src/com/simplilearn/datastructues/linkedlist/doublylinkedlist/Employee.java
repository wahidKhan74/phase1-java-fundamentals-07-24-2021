package com.simplilearn.datastructues.linkedlist.doublylinkedlist;

public class Employee {
	
	// properties
	public int id;
	public String name;
	public String dept;
	public float salary;
	
	public Employee(int id, String name, String dept, float salary) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}
	
	public Employee() {
		super();
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dept=" + dept + ", salary=" + salary + "]";
	}
	
}
