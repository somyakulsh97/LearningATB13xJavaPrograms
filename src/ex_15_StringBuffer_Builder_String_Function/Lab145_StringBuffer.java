package ex_15_StringBuffer_Builder_String_Function;

public class Lab145_StringBuffer {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("krishu");
        stringBuffer.append(" kulshreshtha");

        System.out.println(stringBuffer);

        stringBuffer.reverse();
        System.out.println(stringBuffer);

        String s1 = "hello";
        String s2 = "world";

        String s3 = s1 + " " + s2;
        System.out.println(s3);
    }
}
