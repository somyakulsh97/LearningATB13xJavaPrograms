package PracticeProblem_task_23_06;

import java.util.Scanner;

public class NumberCheck_P_and_N {

//    Check if a Number is Positive or Negative.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input from user
        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();

        // Check if the number is positive, negative, or zero
        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }

        scanner.close();
    }
}
