package ex_15_StringBuffer_Builder_String_Function;

public class Lab147_StringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("hello");
        sb.append("world");
        sb.reverse();
        System.out.println(sb);
    }
}
