package ex_17_2D_Array;

import java.util.Scanner;

public class Lab164_Multiplication_Matrix {
    public static void main(String[] args) {
//        multiplication of the matrix
        System.out.println("Enter the value of n");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();              // where n is size of the table
        for (int i = 0; i < n ; i++){
            for(int j = 0; j < n ; j++){
                System.out.print(i*j + " | ");
            }
            System.out.println();
        }
    }
}
