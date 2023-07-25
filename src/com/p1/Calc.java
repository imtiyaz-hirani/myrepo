package com.p1;

import java.util.Scanner;

public class Calc {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter no 1 ");
		int num1 = sc.nextInt();
		System.out.println("Enter no 2 ");
		int num2 = sc.nextInt();
		
		System.out.println("*****Calculator********");
		System.out.println("Press 1. for Add");
		System.out.println("Press 2. for Sub");
		System.out.println("Press 3. for Mul");
		System.out.println("Press 4. for Divide");
		System.out.println("***********************");
		int input = sc.nextInt(); //I expect user to give me value between (1 and 4)
		
		switch(input) {
		case 1: 
			int add = num1+num2; 
			System.out.println("Result is " + add);
			break;
		case 2:
			int sub = num1-num2; 
			System.out.println("Result is " + sub);
			break; 
		case 3: 
			int mul = num1*num2;
			System.out.println("Result is " + mul);
			break;
		case 4: 
			int divide = num1/num2;
			System.out.println("Result is " + divide);
			break; 
		default: 
			System.out.println("Invalid input given");
			break; 
		}
		
		sc.close();
	}
}
