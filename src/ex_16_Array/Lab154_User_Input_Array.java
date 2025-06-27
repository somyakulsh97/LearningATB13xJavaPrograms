package ex_16_Array;

import java.util.Scanner;

public class Lab154_User_Input_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array only");
        int size = sc.nextInt();
        System.out.println(size);

        int[] numbers_marks =  new int[size];
        System.out.println(numbers_marks);
        for (int i = 0; i < numbers_marks.length ; i++) {
            System.out.println("Enter the numbers");
            numbers_marks[i] = sc.nextInt();
        }

        System.out.println(" ---- Below Code is printing the elements! ");

        for (int i = 0; i < numbers_marks.length ; i++) {
            System.out.println(numbers_marks[i]);
        }

    }
}
