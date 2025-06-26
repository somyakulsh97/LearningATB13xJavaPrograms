package PracticeProblem_task_23_06;

import java.util.Scanner;

public class Char_is_V_and_C {

    public static void main(String[] args) {

//        Check if a Character is a Vowel or Consonant.
        Scanner scanner = new Scanner(System.in);

        // Input character
        System.out.print("Enter a character: ");
        char ch = scanner.next().toLowerCase().charAt(0); // Convert to lowercase

        // Check if it's an alphabet
        if ((ch >= 'a' && ch <= 'z')) {
            // Check for vowels
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println(ch + " is a vowel.");
            } else {
                System.out.println(ch + " is a consonant.");
            }
        } else {
            System.out.println("Invalid input. Please enter an alphabet.");
        }

        scanner.close();
    }
}
