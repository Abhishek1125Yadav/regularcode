package Allcode;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import FourthRevision.java.Employee;

class Employee{
	
	private int id;
	private String name;
	private int salary;
	
	Employee(){
		
		
	}
	
	Employee(int id, String name, int salary){
		
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
	
	
	
	
}


public class EmployeeData {
	
	public static void main(String x[]) {
		
		Scanner data = new Scanner(System.in);
		
		ArrayList al = new ArrayList();
		
		do {
			
			System.out.println("Press 1 For Add New Employee");
			System.out.println("Press 2 for Display All Employee Data");
			System.out.println("Press 3 For Search Employee By Id");
			System.out.println("Press 4 For Delete Employee By Id");
			System.out.println("Press 5 For Update Employee Name By its ID");
			System.out.println("Press 6 For Find same Name Employee");
			
			System.out.println("Enter The Choice");
			int choice = data.nextInt();
			
			switch(choice){
			
				case 1 : System.out.println("Enter Employee ID");
						 int id = data.nextInt();
						 
						 data.nextLine();
						 System.out.println("Enter Employee Name");
						 String name = data.nextLine();
			
						 System.out.println("Enter Employee Salary");
						 int salary = data.nextInt();
						 
						 Employee e = new Employee(id, name, salary);
	
						 al.add(e);
						 
						 break;
						 
				case 2 : Iterator i = al.iterator();
				
						System.out.println("Employee ID" + "           " + "Employee Name" + "       " + "Employee Salary");
				
					 	 while(i.hasNext()) {
					 		 
					 		 Object obj = i.next();
					 		 Employee employee = (Employee)obj;
					 		 
					 		 System.out.println(employee.getId() + "        \t        " + employee.getName() + "      \t      " + employee.getSalary());
					 		 
					 	 }
					 	 
					 	 break;
					 	 
					 	 
				case 3 : System.out.println("Enter The Search ID");
						 int search = data.nextInt();
						 
						System.out.println("Employee ID" + "           " + "Employee Name" + "       " + "Employee Salary");
						 
						 i = al.iterator();
						 boolean b = false;
						 
						 while(i.hasNext()) {
							 
							 Object obj = i.next();
							 
							 Employee emp1 = (Employee)obj;
							 
							 if(emp1.getId() == search) {
								 
								 b = true;
						 		 System.out.println(emp1.getId() + "        \t        " + emp1.getName() + "      \t      " + emp1.getSalary());
								 break;
								 
							 }
							 else {
								 
								 b = false;
								 
							 }
							 
							 
						 }
						 
						 if(b) {
							 
							 
							 System.out.println("Employee Found In Search");
							 
						 }
						 else {
							 
							 System.out.println("Employee Not Found In Search");
							 
						 }
						 
						 
						 break;
					 	 
			
				case 4 : System.out.println("Enter Employee Id For Delete");
						 int delete = data.nextInt();
						 
						Iterator i1 = al.iterator();
						 
						 boolean b1 = false;
						 
						 while(i1.hasNext()) {
							 
							 Object obj = i1.next();
							 
							 Employee emp = (Employee)obj;
						
							 if(emp.getId() == delete) {
								 
								 i1.remove();
								 b1 = true;
								 break;
								 
							 }
							 else {
								 
								 b1 = false;
								 
							 }
							
							 
						 }
						 
						 if(b1) {
							 
							 System.out.println("Employee Data Deleted From Collection");
							 
						 }
						 else {
							 
							 System.out.println("Employee Data Not Found In Collection");
							 
						 }
						 
						 break;
						 
						 
				case 5 : System.out.println("Enter The ID");
						 int id3 = data.nextInt();
						 
						 data.nextLine();
						 
						 boolean b3 = false;
						 
						 i = al.iterator();
						 
						 while(i.hasNext()) {
							 
							 Object obj = i.next();
							 
							 Employee emp3 = (Employee)obj;
							 
							 if(emp3.getId() == id3) {
								 
								 System.out.println("Enter Updated Employee Name");
								 String name2 = data.nextLine();
								 
								 System.out.println("Enter Updated Salary");
								 int salary2 = data.nextInt();
								 
								 emp3.setName(name2);
								 emp3.setSalary(salary2);
								 
								 b3 = true;
								 
								 
							 }
							 
						 }
						 
						 if(b3) {
							 
							 System.out.println("Updation Perform Successfully");
							 
						 }
						 else {
							 
							 System.out.println("Data Not Found In Collection");
							 
						 }
						 
						 break;
						 
						 
				case 6 : data.nextLine();
					
						 System.out.println("Enter Name Of Employee");
				   	 	 String name3 = data.nextLine();
				   	 	 
				   	 	 boolean b4 = false;

				   	 	 System.out.println("Employee ID" + "           " + "Employee Name" + "       " + "Employee Salary");

				   	 	 
				   	 	 for(Object obj : al) {
				   	 		 
				   	 		 Employee emp5 = (Employee)obj;
				   	 		 
				   	 		 if(emp5.getName().equals(name3)) {
				   	 			 
						 		 System.out.println(emp5.getId() + "        \t        " + emp5.getName() + "      \t      " + emp5.getSalary());
						 		 b4 = true;
						 		 break;
						 		 
				   	 		 }
				   	 		 
				   	 	 }
				   	 	 
				   	 	 if(b4) {
				   	 		 
				   	 		 System.out.println("Employee Name Found In Collection");
				   	 		 
				   	 	 }
				   	 	 else {
				   	 		 
				   	 		 System.out.println("Employee Name Not Found In Collection");
				   	 		 
				   	 	 }
				   	 	 
						 
						 
			}
			
			
			
		}while(true);
		

		
		
	}

}
