package ex_17_2D_Array;

public class Lab161_Creation_of_2D_Array {
    public static void main(String[] args) {
//        how to create two dimentional array
        //{1,2,3}
        //{4,5,6}
        //{7,8,9}
        int[][] array_2d = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println((array_2d));

        //10,20
        //30,40
        //50,60

        int array[][];
        array = new int[][]{
                {10,20},
                {30,40},
                {50,60}
        };
        System.out.println(array[0][1]);

        int[][] array_2D = new int[3][3];
        array_2D[0][0] = 1;
        array_2D[0][1] = 2;
        array_2D[0][2] = 3;
        array_2D[1][0] = 4;
        array_2D[1][1] = 5;
        array_2D[1][2] = 6;
        array_2D[2][0] = 7;
        array_2D[2][1] = 8;
        array_2D[2][2] = 9;
        System.out.println(array_2D[2][2]);

    }
}
