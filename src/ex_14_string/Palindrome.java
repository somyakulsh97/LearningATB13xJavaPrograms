package ex_14_string;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//         palindrome
        // Input from user
        System.out.print("Enter a string: ");
        String original = scanner.nextLine();

        // Remove spaces and convert to lowercase (optional for case-insensitive check)
        String cleanStr = original.replaceAll("\\s+", "").toLowerCase();

        // Reverse the string
        String reversed = new StringBuilder(cleanStr).reverse().toString();

        // Check if original equals reversed
        if (cleanStr.equals(reversed)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }

        scanner.close();
    }
}
