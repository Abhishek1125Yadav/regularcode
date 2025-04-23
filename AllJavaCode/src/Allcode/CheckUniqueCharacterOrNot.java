package Allcode;

import java.util.*;
public class CheckUniqueCharacterOrNot {

	public static void main(String x[]) {
		
		Scanner data = new Scanner(System.in);
		
		System.out.println("Enter The String");
		String str = data.nextLine();
		
		boolean b = true;
		
		char ch[] = str.toCharArray();
		
		for(int i = 0 ; i < ch.length ; i++) {
			
			for(int j = i + 1 ; j < ch.length ; j++) {
				
				if(ch[i] == ch[j]) {
					
					b = false;
					break;
					
				}
				
			}
			
		}
		
		if(b) {
			
			System.out.println("String Contain All Unique Character");
			
		}
		else {

			System.out.println("String Not Contain All Unique Character");

			
		}
		
	
	}
	
}
