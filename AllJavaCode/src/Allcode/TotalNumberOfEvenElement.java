package Allcode;

import java.util.*;
public class TotalNumberOfEvenElement {

	public static void main(String x[]) {
		
		Scanner data = new Scanner(System.in);
		
		System.out.println("Enter The Size");
		int size = data.nextInt();
		
		int a[] = new int[size];
		
		System.out.println("Enter " + size + " Element Of An Array");
		
		for(int i = 0 ; i <= a.length - 1; i++) {
			
			a[i] = data.nextInt();
			
		}

		int count = 0;
		
		for(int i = 0 ; i < a.length ; i++) {
			
			if(a[i] % 2 == 0) {
				
				count++;
				
			}
			
		}
		
		System.out.println("Total Number Of Even Element is :- " + count);
		
	}
	
}
