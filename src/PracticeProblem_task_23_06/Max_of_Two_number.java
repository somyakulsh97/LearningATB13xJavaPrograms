package PracticeProblem_task_23_06;

import java.util.Scanner;

public class Max_of_Two_number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Input two numbers
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        // Find maximum
        if (num1 > num2) {
            System.out.println("Maximum is: " + num1);
        } else if (num2 > num1) {
            System.out.println("Maximum is: " + num2);
        } else {
            System.out.println("Both numbers are equal.");
        }

        scanner.close();
    }
}
