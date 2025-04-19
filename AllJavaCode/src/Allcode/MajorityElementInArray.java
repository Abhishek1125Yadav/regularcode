package Allcode;

import java.util.*;
public class MajorityElementInArray {

	public static void main(String x[]) {
		
		Scanner data = new Scanner(System.in);
		
		System.out.println("Enter The Size");
		int size = data.nextInt();
		
		int a[] = new int[size];
		
		System.out.println("Enter " + size + " Element Of An Array");
		
		for(int i = 0 ; i <= a.length - 1; i++) {
			
			a[i] = data.nextInt();
			
		}

		int count;
		
		System.out.println("Majority Element In Array is :- ");
		
		for(int i = 0 ; i < a.length ; i++) {
			
			count = 0;
			
			for(int j = i ; j < a.length ; j++) {
				
				if(a[i] == a[j]) {
					
					count++;
					
				}
				
			}
			
			if(count > a.length / 2) {
				
				System.out.println(a[i]);
				
			}
			
		}
		
		
	}
	
}
