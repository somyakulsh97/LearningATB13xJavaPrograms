package PracticeProblem_task_23_06;

import java.util.Scanner;

public class Even_Odd_Check {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input from user
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // Check even or odd using modulus operator
        if (number % 2 == 0) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }

        scanner.close();
    }
}
