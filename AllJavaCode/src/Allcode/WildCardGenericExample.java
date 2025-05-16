package Allcode;

import java.util.*;

class AllDataNumber{
	
	public void showalldata(List<?> list) {
		
		for(Object obj : list) {
			
			System.out.println(obj);
			
		}
		
	}
	
}

public class WildCardGenericExample {

	public static void main(String x[]) {
		
		Scanner data = new Scanner(System.in);
		
		AllDataNumber adn = new AllDataNumber();
		
		do {
			
			System.out.println("Press 1 For Show All Integer Type Data");
			System.out.println("Press 2 For Show All Double Type Data");
			System.out.println("Press 3 For Show All Float Type Data");
			System.out.println("Press 4 For Show All Long Type Data");

			System.out.println("Enter The Choice");
			int choice = data.nextInt();
			
			switch(choice) {
			
				case 1 : System.out.println("All Integer Data Type Value is :- ");
						 List<Integer> list1 = Arrays.asList(10,20,30,40,50);
						 adn.showalldata(list1);
						 break;
						 
				case 2 : System.out.println("All Double Data Type Value is :- ");
						 List<Double> list2 = Arrays.asList(11.2,13.5,15.5);
						 adn.showalldata(list2);
						 break;
						 
				case 3 : System.out.println("All Float Data Type value is :- ");
						 List<Float> list3 = Arrays.asList(1.2f,1.5f,1.6f);
						 adn.showalldata(list3);
						 break;
						 
						 
				case 4 : System.out.println("All Long Data Type value is :- ");
						 List<Long> list4 = Arrays.asList(1111111111l,4353535355l);
						 adn.showalldata(list4);
						 break;
					
			
			}
			
			
		}while(true);
		
		
	}
	
}
