package ex_14_string;

public class Lab135_String_Immutable {
    public static void main(String[] args) {
//        how do you create a string :
       String name = "happy";       //it is created in string constant pool.
        name.toUpperCase();
        System.out.println(name);   //it will print happy because name.toUppercase() will work but older value will be same it we will reassign the value then it will store and print HAPPY;

        name = name.toUpperCase();
        System.out.println(name);

  }
}
