package ex_14_string;

public class Lab140_String_InterviewQues_2 {
    public static void main(String[] args) {
//        how many string present in SCP
        String s1 = "Hello";
        String s2 = "Hello";
        String s10 = "Hello";
//        ANSWER is 1 because one time string is created Hello.

//        how many string present in object area OA
        String s3 = new String("Hello");
        String s4 = new String("Hello");
        String s5 = new String("Hello");

//        ANSWER is 3 in OA
//        total string present in JVM : 4
    }
}
