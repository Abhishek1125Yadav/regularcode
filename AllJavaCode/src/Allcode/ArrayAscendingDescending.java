package Allcode;

import java.util.*;
public class ArrayAscendingDescending {

	public static void main(String x[]) {
		
		Scanner data = new Scanner(System.in);
		
		System.out.println("Enter The Size");
		int size = data.nextInt();
		
		int a[] = new int[size];
		
		System.out.println("Enter " + size + " Element Of An Array");
		
		for(int i = 0 ; i <= a.length - 1 ; i++) {
			
			a[i] = data.nextInt();
			
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
		
		System.out.println("Array In Ascending Order is :- ");
		
		for(int i = 0 ; i < a.length ; i++) {
			
			System.out.println(a[i]);
			
		}
		
		for(int i = 0 ; i < a.length ; i++) {
			
			for(int j = i + 1 ; j < a.length ; j++) {
				
				if(a[i] < a[j]) {
					
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
					
				}
				
			}
			
		}
		
		System.out.println("Array In Descending Order is :- ");
		
		for(int i = 0 ; i < a.length ; i++) {
			
			System.out.println(a[i]);
			
		}



		
		
	}
	
}
