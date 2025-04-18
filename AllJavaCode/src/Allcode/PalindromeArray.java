package Allcode;

import java.util.*;
public class PalindromeArray {

	public static void main(String x[]) {
		
		Scanner data = new Scanner(System.in);
		
		System.out.println("Enter The Size");
		int size = data.nextInt();
		
		int a[] = new int[size];
		
		System.out.println("Enter " + size + " Element Of An Array");
		
		for(int i = 0 ; i < a.length ; i++) {
			
			a[i] = data.nextInt();
			
		}
		
		boolean b = true;
		
		for(int i = 0 ; i < a.length ; i++) {
			
			if(a[i] != a[a.length - 1 - i]) {
				
				b = false;
				break;
				
			}
			
		}
		
		if(b) {
			
			System.out.println("Array is Palindrome");
			
		}
		else {
			
			System.out.println("Array is not Palindrome");
			
		}
		
		
	}
	
}
