package myjavatutorial;

interface Animal {
    void bark();

    void meow();
}

abstract class Dog implements Animal {
    public void bark() {
        System.out.println("Barking");
    }
}

class Cat extends Dog {
    public void meow() {
        System.out.println("Meow");
    }
}

public class OOPTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Animal a = new Cat();
        a.bark();
        a.meow();
    }

}
