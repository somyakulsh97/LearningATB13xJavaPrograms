package ex_17_2D_Array;

public class ab162_Interview_Question {
    public static void main(String[] args) {
//
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(matrix.length);

        for(int i=0; i< matrix.length; i++){
            for(int j=0; j < matrix[i].length ; j++){
                System.out.print(matrix[i][j] +  " | ");
            }
            System.out.println();

        }

    }
}
