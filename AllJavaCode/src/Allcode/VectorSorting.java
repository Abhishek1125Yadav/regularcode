package Allcode;

import java.util.*;
public class VectorSorting {

	public static void main(String x[]) {
		
		Scanner data = new Scanner(System.in);
		
		Vector v = new Vector();
		v.add(32);
		v.add(12);
		v.add(67);
		v.add(34);
		v.add(78);
		
		System.out.println("Before Sorting");
		Iterator i = v.iterator();
		
		while(i.hasNext()) {
			
			Object obj = i.next();
			System.out.println(obj);
			
		}
		
		for(int i1 = 0 ; i1 < v.size() ; i1++) {						
			
			for(int j = i1 + 1 ; j < v.size() ; j++) {
				
				Object first = v.get(i1);
				Object second = v.get(j);
				
				if((int)first > (int)second) {
					
					v.set(i1, second);
					v.set(j, first);
					
				}
				
			}
			
		}
		
		System.out.println("After Sorting");
		
		i = v.iterator();
		while(i.hasNext()) {
			
			Object obj1 = i.next();
			
			System.out.println(obj1);
			
		}
		
	}
	
}
