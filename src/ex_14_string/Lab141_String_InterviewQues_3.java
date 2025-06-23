package ex_14_string;

public class Lab141_String_InterviewQues_3 {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        String s10 = "Hello";

        String s3 = new String("Hello");
        String s4 = new String("Hello");
        String s5 = new String("hello");

//        == comparison operator in string checks Location Reference
        System.out.println(s1==s3);
        System.out.println(s3==s4);
        System.out.println(s1==s10);

//        equals checks for content value
        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s10));
        System.out.println(s3.equals(s2));
        System.out.println(s5.equals(s4));
        System.out.println(s5.equalsIgnoreCase(s4));


    }
}
