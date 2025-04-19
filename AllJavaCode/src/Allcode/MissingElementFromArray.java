package Allcode;

import java.util.*;
public class MissingElementFromArray {

	public static void main(String x[]) {
		
		Scanner data = new Scanner(System.in);
		
		System.out.println("Enter The Size");
		int size = data.nextInt();
		
		int a[] = new int[size];
		
		System.out.println("Enter " + size + " Element Of An Array");
		
		for(int i = 0 ; i <= a.length - 1; i++) {
			
			a[i] = data.nextInt();
			
		}


		System.out.println("Missing Element In Array is :- ");
		for(int i = 0 ; i < a.length - 1 ; i++) {
			
			for(int j = a[i] + 1 ; j < a[i + 1] ; j++) {
				
				System.out.println(j);
				
			}
			
		}
		
	}
	
}
