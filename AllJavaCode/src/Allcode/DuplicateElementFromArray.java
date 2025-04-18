package Allcode;

import java.util.*;
public class DuplicateElementFromArray {

	public static void main(String x[]) {
		
		Scanner data = new Scanner(System.in);
		
		System.out.println("Enter The Size");
		int size = data.nextInt();
		
		int a[] = new int[size];
		
		System.out.println("Enter " + size + " Element Of An Array");
		
		for(int i = 0 ; i <= a.length - 1 ; i++) {
			
			a[i] = data.nextInt();
			
		}

		System.out.println("Duplicate Element From An  Array is :- ");
		
		for(int i = 0 ; i < a.length ; i++) {
			
			int count = 0;
			
			for(int j = i ; j < a.length ; j++) {
				
				if(a[i] == a[j]) {
					
					count++;
					
					
				}
				
			}
			
			if(count > 1) {
				
				System.out.println(a[i]);
				
			}
			
		}
		
	}
	
}
