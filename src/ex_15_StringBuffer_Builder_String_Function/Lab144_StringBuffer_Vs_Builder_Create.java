package ex_15_StringBuffer_Builder_String_Function;

public class Lab144_StringBuffer_Vs_Builder_Create {
    public static void main(String[] args) {
        String s0 = "Happy";                     // these are immutable in nature.
        String s1 = new String("Happy");

        StringBuffer stringBuffer = new StringBuffer("Happy");    //these are mutable in nature
        StringBuilder stringBuilder = new StringBuilder("Happy");         //these are mutable in nature

        System.out.println(s0);
        System.out.println(s1);

        System.out.println(stringBuffer);
        System.out.println(stringBuilder);


    }
}
