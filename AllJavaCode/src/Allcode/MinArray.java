package Allcode;

import java.util.*;
public class MinArray {

	public static void main(String x[]) {
		
		Scanner data = new Scanner(System.in);
		
		System.out.println("Enter The Size");
		int size = data.nextInt();
		
		int a[] = new int[size];
		
		System.out.println("Enter " + size + " Element Of An Array");
		
		for(int i = 0 ; i <= a.length - 1; i++) {
			
			a[i] = data.nextInt();
			
		}
		
		int secondmin = a[0];
		int min = a[0];
		
		for(int i = 0 ; i <= a.length - 1 ; i++) {
			
			if(a[i] < min) {
				
				secondmin = min;
				min = a[i];
				
			}
			else if(a[i] < secondmin && a[i] > min) {
				
				secondmin = a[i];
				
			}
			
		}
		
		System.out.println("Second Smallest Element is :- " + secondmin);
		
		
	}
	
	
	
}
