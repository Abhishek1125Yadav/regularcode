package Allcode;

import java.util.*;
public class FirstNonRepeatingString {

	public static void main(String x[]) {
		
		Scanner data = new Scanner(System.in);
		
		System.out.println("Enter The String");
		String str = data.nextLine();
		
		char ch[] = str.toCharArray();
		
		for(int i = 0 ; i < ch.length ; i++) {
			
			int count = 0;
			
			for(int j = i ; j < ch.length ; j++) {
				
				if(ch[i] == ch[j]) {
					
					count++;
					
				}
				
			}
			
			if(count == 1) {
				
				System.out.println(ch[i]);
				break;
				
			}
			
		}
		
		
	}
	
}
