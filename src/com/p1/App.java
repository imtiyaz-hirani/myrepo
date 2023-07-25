package com.p1;

import java.text.DecimalFormat;
import java.util.Scanner;
 
 

/**
 * @author Administrator
 * My First java Program: Display "Hello World"
 */

public class App {
	/**
	 * This is the main method that will be executed by  
	 * JVM which is made of JDK +  JRE 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				System.out.println("Hello world");
				System.out.println("India");
				
				int x=10;
				int y=15;
				long z=256578525;
				
				int add=x+y; //25
				System.out.println("add result: " +add);
				
				int mul=x*y;
				System.out.println("multiplication result: " +mul);
				
				//working on float and double 
				
				float f =4.6f;
				System.out.println(f);
				double d=355.67;
				System.out.println(d);

				double marks = 76.49; 
				/* Round up this marks value */
				long roundedMarks=Math.round(marks);
				System.out.println(roundedMarks);
				
				/* This is the Object of class: DecimalFormat */
				DecimalFormat df = new DecimalFormat("0.00"); 
				
				/* using this object df, i want to call the format method */
				double num=10; 
				double sqrt = Math.sqrt(num); //3.1622776601683795
				System.out.println("Square root of " + num +" is: "+ df.format(sqrt));
				
				System.out.println(Math.floor(3.5));//3
				System.out.println(Math.ceil(3.5));//4
				
				System.out.println("********Switch Case*************");
				String city="mumbai";
				 
				switch(city) {
					case "mumbai":  //if city="mumbai", this case will be called
						System.out.println("mumbai address");
						break; 
					
					case "pune": //if city="pune", this case will be called
						System.out.println("pune address");
						break;
					
					case "chennai": //if city="chennai", this case will be called
						System.out.println("chennai address");
						break;
					
					default: //and for all other values, this case will be called\
						System.out.println("HQ address");
						break;
				}
				
				System.out.println("******Reading Input********");
				//Step 1: Reach out to Scanner : meaning create an object
				Scanner sc = new Scanner(System.in);
				
				//Step 2: prompt for input and read it. 
				System.out.println("Please enter your account type(SAVINGS/CURRENT)");
				String accountType= sc.next();
				
				switch(accountType.toUpperCase()) {
					case "SAVINGS":
						System.out.println("ROI: 6.0%");
						break;
					case "CURRENT":
						System.out.println("ROI: 0.0%");
						break;
					default: 
						System.out.println("Invalid input");
						break; 
				}
				sc.close(); //connection to input stream closed..
	}

}







