package Allcode;

import java.util.*;
public class AllUniqueCharacter {

	public static void main(String x[]) {
		
		Scanner data = new Scanner(System.in);
		
		System.out.println("Enter The String");
		String str = data.nextLine();
		
		char ch[] = str.toCharArray();
		
		boolean b = true;
		
		for(int i = 0 ; i < ch.length ; i++) {
			
			for(int j = i + 1 ; j < ch.length ; j++) {
				
				if(ch[i] == ch[j]) {
					
					b = false;
					
				}
				
			}
			
		}
		
		if(b) {
			
			System.out.println("All Are Unique Character");
			
		}
		else {
			
			System.out.println("String has Not Unique Character");
			
		}
		
	}
	
}
