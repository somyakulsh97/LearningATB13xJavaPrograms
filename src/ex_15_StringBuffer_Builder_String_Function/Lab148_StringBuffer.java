package ex_15_StringBuffer_Builder_String_Function;

public class Lab148_StringBuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("java");
        sb.append("programming");

        System.out.println(sb);
        sb.delete(4,8);
        System.out.println(sb);
        sb.replace(0,5, "c++");
        System.out.println(sb);
    }
}
