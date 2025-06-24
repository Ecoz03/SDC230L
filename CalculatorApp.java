/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
/*
* Name: Jessie Sosniak
* Date: 24 Jun 2025
* Assignment: 1.5 Project SDC230L
*/

import java.util.Scanner;

public class CalculatorApp {
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    String choice = "";
	    
	    //Intro Line
		System.out.println("Project Week 1 - Calculator Program");
		System.out.println("Developed by: Jessie Sosniak\n");
		System.out.println("________________________________________");

		
		//Welcome Message 
		System.out.println("Welcome to the Calculator App!");
		System.out.println("You can perform basic arithmetic operations.");
		System.out.println("Please choose an option from the menu below:\n");
		
		//Menu Loop 
		while (!choice.equalsIgnoreCase("X")) {
		    //Display Menu 
    		System.out.println("1. Add two integers");
    		System.out.println("2. Subtract two floating point numbers");
    		System.out.println("X. Exit\n");
    		System.out.println("________________________________________");

    		
    		System.out.print("Enter your choice: ");
    		choice = scanner.nextLine();
    		
    		switch (choice.toUpperCase()) {
    		    case "1":
    		        //Integer Addition
    		        System.out.print("Enter first integer: ");
    		        //Input Validation
    		        while (!scanner.hasNextInt()){
    		            System.out.print("Invalid input. Please enter a whole number: ");
    		            scanner.next();
    		        }
    		        int int1 = scanner.nextInt();
    		        
    		        System.out.print("Enter second integer: ");
    		        //Input Validation
    		        while (!scanner.hasNextInt()){
    		            System.out.print("Invalid input. Please enter a whole number: ");
    		            scanner.next();
    		        }
    		        int int2 = scanner.nextInt();
    		        
    		        int intSum = int1 + int2;
    		        System.out.println(int1 + " + " + int2 + " = " + intSum);
    		        System.out.println("________________________________________");
    		        scanner.nextLine(); //newline
    		        break;
    		        
    		    case "2":
    		        //Floating-point Subtraction
    		        System.out.print("Enter first decimal number: ");
    		        while (!scanner.hasNextDouble()) {
    		            System.out.print("Invalid input. Please enter a decimal number: ");
    		            scanner.next();
    		        }
    		        double double1 = scanner.nextDouble();
    		        
    		        System.out.print("Enter second decimal number: ");
    		        while (!scanner.hasNextDouble()) {
    		            System.out.print("Invalid input. Please enter a decimal number: ");
    		            scanner.next();
    		        }
    		        double double2 = scanner.nextDouble();
    		        
    		        double result = double2 - double1;
    		        System.out.println(double2 + " - " + double1 + " = " + result);
    		        System.out.println("________________________________________");
    		        scanner.nextLine(); //newline
    		        break;
    		        
    		    case "X":
    		        System.out.println("Exiting program... ");
    		        break;
    		        
    		    default:
    		        System.out.println("Invalid selection. Please try again.");
    		}
		}
		System.out.println("Thank you for using the Calculator App. Goodbye!");
    	scanner.close();
	}
}