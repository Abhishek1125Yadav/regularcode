package Allcode;

import java.util.*;
public class ReverseArray {

	public static void main(String x[]) {
		
		Scanner data = new Scanner(System.in);
		
		System.out.println("Enter The Size");
		int size = data.nextInt();
		
		int a[] = new int[size];
		
		System.out.println("Enter " + size + " Element Of An Array");
		
		for(int i = 0 ; i <= a.length - 1 ; i++) {
			
			a[i] = data.nextInt();
			
		}
		
		int i;
		int j;
		
		for(i = 0, j = a.length - 1 ; i < a.length / 2 ; i++,j--) {
			
			int temp = a[i];
			a[i] = a[j];
			a[j] = temp;
			
		}
		
		System.out.println("After Reverse Array is :- ");
		
		for(i = 0 ; i <= a.length - 1 ; i++) {
			
			System.out.println(a[i]);
			
		}
		
	}
	
}
