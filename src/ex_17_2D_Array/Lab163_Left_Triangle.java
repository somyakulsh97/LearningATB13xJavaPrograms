package ex_17_2D_Array;

import java.util.Scanner;

public class Lab163_Left_Triangle {
    public static void main(String[] args) {
//        *
//        * *
//        * * *
//        * * * *
        System.out.println("Enter the value of n");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n ; i++){
            for(int j = 0; j <= i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
