package ex_16_Array;

public class Lab150_ArrayCreation_2ndMethod {
    public static void main(String[] args) {
        int[] marks = {70,80,80,90,88};

//        2nd method
        // 2nd way to create the array
        int[] mark2 = new int[5]; // Fixed Size , 5, 0 to 4
        String[] names =  new String[3]; // Fixed Size  3, 0 to 2
        names[0] = "pramod";
        names[1] = "Amit";
        names[2] = "Yasho";
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
//        System.out.println(names[]);
    }
}
