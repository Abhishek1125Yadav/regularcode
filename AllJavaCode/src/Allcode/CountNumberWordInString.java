package Allcode;

import java.util.*;
public class CountNumberWordInString {

	public static void main(String x[]) {
		
		Scanner data = new Scanner(System.in);
		
		System.out.println("Enter The String");
		String str = data.nextLine().trim();
				
		if(str.length() == 0) {
			
			System.out.println("Total Number Of Word is :- 0");
			return;
			
			
		}
		
		
		
		char ch[] = str.toCharArray();
		
		int count = 1;
		
		for(int i = 0 ; i <= ch.length - 1 ; i++) {
			
			if(ch[i] == ' ') {
				
				count++;
				
			}
			
		}
		
		
		System.out.println("Total Number Word is :- " + count);
			
				
				
		
	}
	
}
