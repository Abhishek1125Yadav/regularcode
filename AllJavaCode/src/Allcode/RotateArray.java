package Allcode;

import java.util.*;
public class RotateArray {

	public static void main(String x[]) {
		
		Scanner data = new Scanner(System.in);
		
		System.out.println("Enter The Size");
		int size = data.nextInt();
		
		int a[] = new int[size];
		
		System.out.println("Enter " + size + " Element Of An Array");
		
		for(int i = 0 ; i <= a.length - 1; i++) {
			
			a[i] = data.nextInt();
			
		}

		System.out.println("Enter The Index");
		int index = data.nextInt();
		int i;
		int j;
		int first;
		for(i = 0 ; i <= index ; i++) {
			
			first = a[0];
			
			for(j = 0 ; j <= a.length - 2 ; j++) {
				
				a[j] = a[j + 1];
				
			}
			
			a[j] = first;
			
		}
		
		System.out.println("After Rotate Array is :- ");
		
		for(i = 0 ; i <= a.length - 1 ; i++) {
			
			System.out.println(a[i]);
			
		}
		
		
	}
	
}
