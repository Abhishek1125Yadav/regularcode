package Allcode;

import java.util.*;
public class PrimeNumberFrom1ton {

	public static void main(String x[]) {
		
		Scanner data = new Scanner(System.in);
		
		System.out.println("Enter The Number");
		int num = data.nextInt();
		
		int count;
		
		for(int i = 1 ; i <= num ; i++) {
			
			count = 0;
			
			for(int j = 1 ; j <= i ; j++) {
			
				if(i % j == 0) {
					
					count++;
					
				}
				
				
			}
			
			if(count == 2) {
				
				System.out.println(i + " is Prime Number");
				
			}
			
			
			
		}	
		
	}
	
}
