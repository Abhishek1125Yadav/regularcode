package Allcode;

import java.util.*;
public class IntersectionArrayWithoutDuplicate {

	public static void main(String x[]) {
		
		Scanner data = new Scanner(System.in);
		
		System.out.println("Enter First Array Size");
		int size1 = data.nextInt();
		
		int a[] = new int[size1];
		
		System.out.println("Enter " + size1 + " Element Of An Array");
		
		for(int i = 0 ; i < a.length ; i++) {
			
			a[i] = data.nextInt();
			
		}
		
		System.out.println("Enter Second Array Size");
		int size2 = data.nextInt();
		
		int b[] = new int[size2];
		
		System.out.println("Enter " + size2 + " Element Of An Array");
		
		for(int i = 0 ; i < b.length ; i++) {
			
			b[i] = data.nextInt();
			
		}

		int c[] = new int[a.length + b.length];
		int ind = 0;
		
		for(int i = 0 ; i < a.length ; i++) {
			
			for(int j = 0 ; j < b.length ; j++) {
				
				if(a[i] == b[j]) {
					
					c[ind] = a[i];
					ind++;
					
				}
				
			}
			
		}
		
		System.out.println("Intersection Of Two Array Without Duplicate Element is :- ");
		
		for(int i = 0 ; i < ind ; i++) {
			
			if(i == 0 || c[i - 1] != c[i]) {
				
				System.out.println(c[i]);
				
			}
			
		}
		
	}
	
}
