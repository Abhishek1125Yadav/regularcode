package Allcode;

import java.util.*;
public class MoveAllZeroAtEnd {

	public static void main(String x[]) {
		
		Scanner data = new Scanner(System.in);
		
		System.out.println("Enter The Size");
		int size = data.nextInt();
		
		int a[] = new int[size];
		
		System.out.println("Enter " + size + " Element From Array");
		
		for(int i = 0 ; i < a.length ; i++) {
			
			a[i] = data.nextInt();
			
		}
		
		int ind = 0;
		
		for(int i = 0 ; i < a.length ; i++) {
			
			if(a[i] > 0) {
				
				a[ind] = a[i];
				ind++;
				
			}
			
		}
		
		while(ind <= a.length - 1) {
			
			a[ind] = 0;
			ind++;
			
		}
		
		System.out.println("After Removing All Zero At the End Array is :- ");
		
		for(int i = 0 ; i <= ind - 1 ; i++) {
			
			System.out.println(a[i]);
			
		}
		
		
	}
	
}
