package Allcode;

import java.util.*;

class Department{
	
	private String id;
	private String name;
	
	Department(){
		
		
	}
	
	Department(String id, String name){
		
		this.id = id;
		this.name = name;
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}

public class ExampleMapData {

	public static void main(String x[]) {
		
		Scanner data = new Scanner(System.in);
		
		LinkedHashMap lhm = new LinkedHashMap();
		ArrayList al1 = new ArrayList();
		ArrayList al2 = new ArrayList();

		
		do {
			
			System.out.println("Press 1 For Add Computer Engineering Student Data");
			System.out.println("Press 2 For Add Mechanical Engineering Student Data");
			System.out.println("Press 3 For Show All Student Data");
			
			System.out.println("Enter The Choice");
			int choice = data.nextInt();
			
			switch(choice) {
			
				case 1 : data.nextLine();
						 System.out.println("Enter Student Roll No");
						 String rno = data.nextLine();
						 
						 System.out.println("Enter Student Name");
						 String name = data.nextLine();
						 
						 Department d1 = new Department(rno,name);
						 
						 al1.add(d1);
						 
						 lhm.put("Computer Engineering", al1);
						 
						 break;
						 
				case 2 : data.nextLine();
						 System.out.println("Enter Student Roll No");
						 String rno1 = data.nextLine();
				 
						 System.out.println("Enter Student Name");
						 String name1 = data.nextLine();
				 
						 Department d2 = new Department(rno1,name1);
				 
						 al2.add(d2);
						 
						 lhm.put("Mechanical Engineering", al2);
				 
						 break;
		 
				case 3 : Set <Map.Entry> s = lhm.entrySet();
				
						 for(Map.Entry e : s) {
					
						 Object key = e.getKey();
					
						 System.out.println("=========================" + key + "=========================");
					
						 Object values = e.getValue();
					
						 ArrayList a = (ArrayList)values;
					
						 System.out.println("Roll No" + "       \t        " + "Name");

						 for(Object o : a) {
						
					     Department d = (Department)o;

					     System.out.println(d.getId() + "      \t      " + d.getName());
						
						 }
					
						 }
						 
						 break;
										 
			}
			
		}while(true);
		
	}
	
}
