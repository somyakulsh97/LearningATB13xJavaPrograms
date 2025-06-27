package ex_16_Array;

import java.util.Arrays;

public class Lab152_Array_Print {
    public static void main(String[] args) {
        int[] marks = {51, 100, 91, 87, 90};
        System.out.println("  - - - - - -");
//        we have to all the marks

        for (int i = 0; i < marks.length ; i++) {
            System.out.println(marks[i]);
        }

//        to sort the marks
        Arrays.sort(marks);
        for (int i = 0; i < marks.length ; i++) {
            System.out.println(marks[i]);
        }
    }
}
