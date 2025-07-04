package ex_18_OOPs_Concept;

public class Lab170_Constructor_Cat {
    Lab170_Constructor_Cat(){
        System.out.println("DC - Main Class");
    }
    public static void main(String[] args) {
        Cat c1 = new Cat();
        new Cat();
        Cat c2;
        Lab170_Constructor_Cat c3 = new Lab170_Constructor_Cat();

        c1.running();
        // c2.running();
        new Cat().running();





    }
}

class Cat{
    String name; // null

    void running() {
        System.out.println("Running");
    }
}
