package Allcode;
                                                                            //Input = [1,2,2,1],[2,2]
																			//Output = [2,2]					
import java.util.*;
public class IntersectionArray {

	public static void main(String x[]) {
		
		Scanner data = new Scanner(System.in);
		
		System.out.println("Enter First Array Size");
		int size1 = data.nextInt();
		
		int a[] = new int[size1];
		
		System.out.println("Enter " + size1 + " Element Of An Array");
		
		for(int i = 0 ; i < a.length ; i++) {
			
			a[i] = data.nextInt();
			
		}
		
		System.out.println("Enter Second Array Size");
		int size2 = data.nextInt();
		
		int b[] = new int[size2];
		
		System.out.println("Enter " + size2 + " Element Of An Array");
		
		for(int i = 0 ; i < b.length ; i++) {
			
			b[i] = data.nextInt();
			
		}
				
		System.out.println("Intersection Two Array is :- ");
		
		for(int i = 0 ; i < a.length ; i++) {
			
			for(int j = 0 ; j < b.length ; j++) {
				
				if(a[i] == b[j]) {
					
					System.out.println(a[i]);
					break;
				}
				
			}
			
		}
		
		
	}
	
}
