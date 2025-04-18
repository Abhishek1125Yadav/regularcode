package Allcode;

import java.util.*;
public class CommonElementFromTwoArray {

	public static void main(String x[]) {

		Scanner data = new Scanner(System.in);
		
		System.out.println("Enter The First Array Size");
		int size = data.nextInt();
		
		int a[] = new int[size];
		
		System.out.println("Enter " + size + " Element Of An Array");
		
		for(int i = 0 ; i <= a.length - 1; i++) {
			
			a[i] = data.nextInt();
			
		}

		System.out.println("Enter The Second Array Size");
		int size1 = data.nextInt();
		
		int b[] = new int[size1];
		
		System.out.println("Enter " + size1 + " Element Of An Array");
		
		for(int i = 0 ; i <= a.length - 1; i++) {
			
			b[i] = data.nextInt();
			
		}
		
		System.out.println("Common Element From Two Array is :- ");
		
		for(int i = 0 ; i < a.length ; i++) {
			
			for(int j = 0 ; j < b.length ; j++) {
				
				if(a[i] == b[j]) {
					
					System.out.println(a[i]);
					break;
					
				}
				
			}
			
		}


		
		
	}
	
}
