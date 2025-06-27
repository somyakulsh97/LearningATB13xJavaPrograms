package ex_16_Array;

import java.util.Arrays;

public class Lab153_Max_Min_Value {
    public static void main(String[] args) {
//        find the max or min element of the array;
        int[] array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49}; // 0 to 9

//        1st method
//                Arrays.sort(array); // 14,15.......77
//        System.out.println(array[array.length - 1]);

//        2nd method

        int max_output = give_me_max(array);
        int min_output = give_me_min(array);
        System.out.println(max_output);
        System.out.println(min_output);


    }

    static int give_me_max(int[] array) {
        int max = array[0];
        // logic
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return (max);

    }
    static int give_me_min(int[] array){
        int min = array[0];
        // logic
        for (int i = 0; i < array.length ; i++) {
            if(array[i] < min){
                min = array[i];
            }
        }

        return min;
    }

}
