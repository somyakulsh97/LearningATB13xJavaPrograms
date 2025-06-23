package ex_14_string;

public class Lab143_String_Function {
    public static void main(String[] args) {
        String name = "sonal";
        System.out.println(name.length());
        System.out.println(name.charAt(0));
        System.out.println(name.charAt(2));
        System.out.println(name.charAt(4));
//        System.out.println(name.charAt(10));
        System.out.println(name.concat(" patel"));

//        contains();
        System.out.println(name.contains("om"));

//        equals();
        System.out.println(name.equals("om"));
        System.out.println(name.equals("sonal"));

//        equalsignorecase();
        System.out.println(name.equalsIgnoreCase("Sonal"));

//        indexof();  --> basically means index of character.
        System.out.println(name.indexOf("o"));
        System.out.println(name.indexOf("l"));

//
        String s1 = "madam";
        System.out.println(name.indexOf("m"));
        System.out.println(name.lastIndexOf("m"));

//        lenght()
        System.out.println(name.length());

//        replace();
        System.out.println(name.replace('n', 'N'));

//        split();
        String name4 = "somyakulshrestha97@gmail.com";
        String[] split_name4 = name4.split("@");
        System.out.println(split_name4[0]);
        System.out.println(split_name4[1]);

//        substring -->
        String anotherPalindrome = "Niagara.  O roar again!";
        System.out.println(anotherPalindrome.length());

        String extract = anotherPalindrome.substring(11,15);
        System.out.println(extract);

//        concatenation -->
        String s111 = "Hello";
        String s222 = "World";
        String s333 = "Ji";

        String result = s111 + s222 + s333;
        System.out.println(result);


    }
}
