package Allcode;

import java.util.*;

interface AllNumber<T>{
	
	 void setnumber(T t);
	
}

class Square<E> implements AllNumber<Integer>{
	
	public void setnumber(Integer i) {
		
		System.out.println("Square is :- " + (i * i));
		
	}
	
}

class Cube<E> implements AllNumber<Double>{
	
	public void setnumber(Double d) {
		
		System.out.println("Cube is :- " + (d * d * d));
		
	}
	
}


public class GenericExample {

	public static void main(String x[]) {
		
		Scanner data = new Scanner(System.in);
		
		Square<Integer> s1 = new Square<>();
		s1.setnumber(14);
		
		Cube<Double> c1 = new Cube<>();
		c1.setnumber(1.2);
		
	}
	
}
