package ex_18_OOPs_Concept;

public class Lab169_Constructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2;
        new Student();

    }
}
class Student{
    String name;

    // is called as the default constructor, same name as the class name.
    Student(){
        System.out.println("DC");
    }
    void sleep(){
        System.out.println("Hi");
    }

}

