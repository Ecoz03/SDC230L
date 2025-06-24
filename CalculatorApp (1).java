/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
/*
* Name: Jessie Sosniak
* Date: 24 Jun 2025
* Assignment: 2.2 Project SDC230L
*/

import java.util.Scanner;

//Operation Classes
class Addition {
    private double a, b;
    public Addition(double a, double b) {
        this.a = a;
        this.b = b;
    }
    public double compute() {
        return a + b;
    }
    public String display() {
        return String.format("%.2f + %.2f = %.2f", a, b, compute());
    }
}

class Subtraction {
    private double a, b;
    public Subtraction(double a, double b) {
        this.a = a;
        this.b = b;
    }
    public double compute() {
        return a - b;
    }
    public String display() {
        return String.format("%.2f - %.2f = %.2f", a, b, compute());
    }
}

class Multiplication {
    private double a, b;
    public Multiplication(double a, double b) {
        this.a = a;
        this.b = b;
    }
    public double compute() {
        return a * b;
    }
    public String display() {
        return String.format("%.2f * %.2f = %.2f", a, b, compute());
    }
}

class Division {
    private double numerator, denominator;
    public Division(double numerator, double denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }
    public double compute() {
        return numerator / denominator;
    }
    public String display() {
        return String.format("%.2f ÷ %.2f = %.2f", numerator, denominator, compute());
    }
}

//Main App
public class CalculatorApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choice = "";

        String lastAddition = null;
        String lastSubtraction = null;
        String lastMultiplication = null;
        String lastDivision = null;

        System.out.println("Project Week 2 - Calculator Program");
        System.out.println("Developed by: Jessie Sosniak\n");
        System.out.println("________________________________________");
        System.out.println("Welcome to the Calculator App!");
        System.out.println("Perform basic arithmetic. Select an option from the menu:\n");

        while (!choice.equalsIgnoreCase("X")) {
            System.out.println("1. Add two numbers");
            System.out.println("2. Subtract two numbers");
            System.out.println("3. Multiply two numbers");
            System.out.println("4. Divide two numbers");
            System.out.println("X. Exit");
            System.out.println("________________________________________");
            System.out.print("Enter your choice: ");
            choice = scanner.nextLine().trim().toUpperCase();

            switch (choice) {
                case "1":
                    if (lastAddition != null) System.out.println("Previous: " + lastAddition);
                    double add1 = getDouble(scanner, "Enter first number: ");
                    double add2 = getDouble(scanner, "Enter second number: ");
                    Addition add = new Addition(add1, add2);
                    lastAddition = add.display();
                    System.out.println(lastAddition);
                    break;

                case "2":
                    if (lastSubtraction != null) System.out.println("Previous: " + lastSubtraction);
                    double sub1 = getDouble(scanner, "Enter first number: ");
                    double sub2 = getDouble(scanner, "Enter second number: ");
                    Subtraction sub = new Subtraction(sub1, sub2);
                    lastSubtraction = sub.display();
                    System.out.println(lastSubtraction);
                    break;

                case "3":
                    if (lastMultiplication != null) System.out.println("Previous: " + lastMultiplication);
                    double mul1 = getDouble(scanner, "Enter first number: ");
                    double mul2 = getDouble(scanner, "Enter second number: ");
                    Multiplication mul = new Multiplication(mul1, mul2);
                    lastMultiplication = mul.display();
                    System.out.println(lastMultiplication);
                    break;

                case "4":
                    if (lastDivision != null) System.out.println("Previous: " + lastDivision);
                    double num = getDouble(scanner, "Enter numerator: ");
                    double denom;
                    while (true) {
                        denom = getDouble(scanner, "Enter denominator (non-zero): ");
                        if (denom != 0) break;
                        System.out.println("Error: Denominator cannot be zero. Please try again.");
                    }
                    Division div = new Division(num, denom);
                    lastDivision = div.display();
                    System.out.println(lastDivision);
                    break;

                case "X":
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid selection. Please try again.");
            }
            System.out.println("________________________________________");
        }

        System.out.println("Thank you for using the Calculator App. Goodbye!");
        scanner.close();
    }

    //Input validation helper
    private static double getDouble(Scanner scanner, String prompt) {
        System.out.print(prompt);
        while (!scanner.hasNextDouble()) {
            System.out.print("Invalid input. Please enter a valid number: ");
            scanner.next();
        }
        double value = scanner.nextDouble();
        scanner.nextLine(); // consume leftover newline
        return value;
    }
}