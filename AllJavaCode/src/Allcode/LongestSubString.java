package Allcode;

import java.util.*;
public class LongestSubString {

	public static void main(String x[]) {

		Scanner data = new Scanner(System.in);
		
		System.out.println("Enter The String");
		String str = data.nextLine();
		
		char ch[] = str.toCharArray();
		
		int totalen = 0;
		
		for(int i = 0 ; i < ch.length ; i++) {
			
			int count = 1;
			
			for(int j = i + 1 ; j < ch.length ; j++) {
				
				boolean repeated = false;
				
				for(int k = i ; k < j ; k++) {
					
					if(ch[k] == ch[j]) {
						
						repeated = true;
						break;
						
					}
					
				}
				
				if(repeated) {
					
					break;
					
				}
				else {
					
					count++;
					
				}
				
			}
			
			if(count > totalen) {
				
				totalen = count;
				
			}
			
		}
		
		System.out.println("Longest SubString Without Repeating Character is :- " + totalen);
		
		
	}
	
	
}
