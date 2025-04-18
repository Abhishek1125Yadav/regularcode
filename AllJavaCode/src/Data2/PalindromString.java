package Data2;

import java.util.*;
public class PalindromString {

	public static void main(String[] args) {

		Scanner data = new Scanner(System.in);
		
		System.out.println("Enter The String");
		String str = data.nextLine();
		
		char ch[] = str.toCharArray();
		
		boolean b = true;
		
		for(int i = 0 ; i <= ch.length - 1 ; i++) {
			
			if(ch[i] != ch[ch.length - 1 - i]) {
				
				b = false;
				break;
				
			}
			
		}
		
		if(b) {
			
			System.out.println("String is Palindrome");
			
		}
		else {
			
			System.out.println("String is not Palindrome");
			
		}
		
	}

}
