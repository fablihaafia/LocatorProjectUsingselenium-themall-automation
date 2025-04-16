package java_basic;

import java.util.Scanner;

public class EvenOddNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int number;
		
		System.out.println("Enter the number");
		
		number  = sc.nextInt();
		if(number%2 == 0) {
			System.out.println("Even number");
		}
		else {
			System.out.println("Odd number");
		}
		
		 sc.close();
		
		
		
		
		

	}

}
