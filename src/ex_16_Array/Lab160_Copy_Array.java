package ex_16_Array;

import java.sql.SQLOutput;

public class Lab160_Copy_Array {
    public static void main(String[] args) {
        int[] original = {1, 2, 3};
        int[] copy = new int[original.length];
       System.arraycopy(original, 0, copy, 0, original.length);


    }
}
