package Allcode;

import java.util.*;
public class LongestConsecutiveSequence {

	public static void main(String x[]) {
		
		Scanner data = new Scanner(System.in);
		
		System.out.println("Enter The Size");
		int size = data.nextInt();
		
		int a[] = new int[size];
		
		System.out.println("Enter " + size + " Element Of An Array");
		
		for(int i = 0 ; i < a.length ; i++) {
			
			a[i]  = data.nextInt();
			
		}
		
		for(int i = 0 ; i < a.length ; i++) {
			
			for(int j = i + 1 ; j < a.length ; j++) {
				
				if(a[i] > a[j]) {
				
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
					
				}	
				
			}
			
		}
		

		
		int total = 0;
		
		for(int i = 0 ; i < a.length ; i++) {
			
			int count = 0;
			
			for(int j = 0 ; j < a.length - 1 ; j++) {
				
				if(a[i] == a[j] || a[j] + 1 == a[j + 1]) {
					
					count++;
					
				}
				
			}
			
			if(count > total) {
				
				total = count;
				
			}
			
		}
		
		System.out.println("Longest Consecutive Sequence is :- " + total);
		
	}
	
}
