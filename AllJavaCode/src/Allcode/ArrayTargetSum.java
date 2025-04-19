package Allcode;

import java.util.*;
public class ArrayTargetSum {

	public static void main(String x[]) {
		
		Scanner data = new Scanner(System.in);
		
		System.out.println("Enter The Size");
		int size = data.nextInt();
		
		int a[] = new int[size];
		
		System.out.println("Enter " + size + " Element Of An Array");
		
		for(int i = 0 ; i < a.length ; i++) {
			
			a[i] = data.nextInt();
			
		}
		
		System.out.println("Enter The Target Element");
		int target = data.nextInt();
		
		for(int i = 0 ; i < a.length ; i++) {
			
			for(int j = i + 1 ; j < a.length ; j++) {
				
				if(a[i] + a[j] == target) {
					
					System.out.println(a[i] + "," + a[j]);
					
				}
				
			}
			
		}
		
		
	}
	
}
