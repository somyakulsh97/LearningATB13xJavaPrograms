package ex_17_2D_Array;

public class Lab166_Triangle_pattern {
    public static void main(String[] args) {
        int rows = 3;  // Number of rows

        for (int i = 1; i <= rows; i++) {
            // Print spaces
            for (int j = i; j < rows; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }

            // Move to the next line
            System.out.println();
        }
    }
}
