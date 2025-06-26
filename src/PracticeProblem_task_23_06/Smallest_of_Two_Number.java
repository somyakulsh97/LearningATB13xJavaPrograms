package PracticeProblem_task_23_06;

import java.util.Scanner;

public class Smallest_of_Two_Number {
    public static void main(String[] args) {
//        Find the Smallest of Two Numbers.
        Scanner scanner = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        // Find and print the smallest
        if (num1 < num2) {
            System.out.println("Smallest number is: " + num1);
        } else if (num2 < num1) {
            System.out.println("Smallest number is: " + num2);
        } else {
            System.out.println("Both numbers are equal.");
        }

        scanner.close();
    }
}
