package ex_15_StringBuffer_Builder_String_Function;

public class Lab146_StringBuilder {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("krishu");
        stringBuilder.append(" kulshreshtha");

        System.out.println(stringBuilder);

        stringBuilder.reverse();
        System.out.println(stringBuilder);
    }
}
