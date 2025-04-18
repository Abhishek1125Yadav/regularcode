package Allcode;

import java.util.*;
public class SecondMax {

	public static void main(String x[]) {
		
		Scanner data = new Scanner(System.in);
		
		System.out.println("Enter The Size");
		int size = data.nextInt();
		
		int a[] = new int[size];
		
		System.out.println("Enter " + size + " Element Of An Array");
		
		for(int i = 0 ; i <= a.length - 1 ; i++) {
			
			a[i] = data.nextInt();
			
		}
		
		int secondmax = a[0];
		int max = a[0];
		
		for(int i = 0 ; i <= a.length - 1 ; i++) {
			
			if(a[i] > max) {
				
				secondmax = max;
				max = a[i];
				
			}
			else if(a[i] > secondmax && a[i] <= max) {
				
				secondmax = a[i];
				
			}
			
		}
		
		System.out.println("Second Max is :- " + secondmax);
		
	}
	
}
