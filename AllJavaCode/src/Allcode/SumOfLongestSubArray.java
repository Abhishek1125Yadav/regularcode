package Allcode;

import java.util.*;
public class SumOfLongestSubArray {

	public static void main(String x[]) {
		
		Scanner data = new Scanner(System.in);
		
		System.out.println("Enter the Size");
		int size = data.nextInt();
		
		int a[] = new int[size];
		
		System.out.println("Enter " + size + " Element Of An Array");
		
		for(int i = 0 ; i <= a.length - 1 ; i++) {
			
			a[i] = data.nextInt();
			
		}
		
		int sum = 0;
		int max = a[0];
		
		for(int i = 0 ; i <= a.length - 1 ; i++) {
			
			if(sum < 0) {
				
				sum = 0;
				
			}
			
			sum = sum + a[i];
			
			if(sum > max) {
				
				max = sum;
				
			}
			
		}
		
		System.out.println("Maximum Sum Of SubArray is :- " + max);
		
	}
	
}
