package Allcode;

import java.util.*;

class Worker12{
	
	private int id;
	private String name;
	private int salary;
	
	Worker12(){
		
		
	}
	
	Worker12(int id, String name, int salary){
		
		this.id = id;
		this.name = name;
		this.salary = salary;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public String toString() {
		
		return "["+id+","+name+","+salary+"]";
		
	}
	
}

public class toStringExample {

	public static void main(String x[]) {
		
		Scanner data = new Scanner(System.in);
		
		Worker12 w1 = new Worker12();
		w1.setId(1);
		w1.setName("Abhishek");
		w1.setSalary(23000);
		
		System.out.println(w1);
		
	}
	
}
