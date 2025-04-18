package Allcode;

import java.util.*;

class Employee1 implements Comparable{
	
	private int id;
	private String name;
	private int salary;
	
	Employee1(){
		
		
	}
	
	Employee1(int id, String name, int salary){
		
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

	@Override
	public int compareTo(Object o) {

		Employee1 emp1 = (Employee1)o;
		
		if(this.id > emp1.getId()) {
			
			return 1;
			
		}
		else if(this.id < emp1.getId()) {
			
			return -1;
			
		}
		else {
		
				return 0;
				
		}
		
	}
	
	
	
	
}

public class EmployeeDataUsingComparable {

	public static void main(String x[]) {
		
		ArrayList<Employee1> al = new ArrayList<Employee1>();
		
		Employee1 e1 = new Employee1(3,"Abhishek",45000);
		Employee1 e2 = new Employee1(5,"Avinash",25000);
		Employee1 e3 = new Employee1(1,"jaydeep",75000);
		Employee1 e4 = new Employee1(2,"Darshan",55000);
		Employee1 e5 = new Employee1(4,"rahul",95000);
		
		al.add(e1);	
		al.add(e2);
		al.add(e3);
		al.add(e4);
		al.add(e5);
		
		System.out.println("Original Employee Data is :- ");
		
		Iterator<Employee1> i = al.iterator();
		
		while(i.hasNext()) {
			
			Object obj = i.next();
			
			Employee1 employee = (Employee1)obj;
			
			System.out.println(employee.getId() + " \t " + employee.getName() + " \t " + employee.getSalary());
			
		}
		
		Collections.sort(al);
		
		System.out.println("After Sort Employee Data By ID");
		
		i = al.iterator();
		
		while(i.hasNext()) {
			
			Object obj = i.next();
			
			Employee1 employee1 = (Employee1)obj;
			
			System.out.println(employee1.getId() + " \t " + employee1.getName() + " \t " + employee1.getSalary());
			
		}
		
	}
	
}
