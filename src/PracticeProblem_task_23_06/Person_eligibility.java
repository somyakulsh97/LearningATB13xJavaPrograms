package PracticeProblem_task_23_06;
import java.util.Scanner;
public class Person_eligibility {
    public static void main(String[] args) {
//        Check if a Person is Eligible to Vote (Age Check).
        Scanner scanner = new Scanner(System.in);

        // Input age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Check eligibility
        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote.");
        }

        scanner.close();
    }
}
