package Allcode;

import java.util.*;
public class StringCompression {

	public static void main(String x[]) {
		
		Scanner data = new Scanner(System.in);
		
		System.out.println("Enter The String");
		String str = data.nextLine();
		
		char ch[] = str.toCharArray();
		
		
		int count;
		
		for(int i = 0 ; i < ch.length ; i = i + count) {
			
			count = 0;			
		
			for(int j = i ; j < ch.length ; j++) {
				
				if(ch[i] == ch[j]) {
					
					count++;
					
				}
				else {
					
					break;
					
				}
				
			}
			
			System.out.print(ch[i] + "" + count);

		}
		
	}
	
}
