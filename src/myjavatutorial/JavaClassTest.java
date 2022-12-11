package myjavatutorial;

class Phone {
    int id;
    String name;

    Phone(int i, String n) {
        id = i;
        name = n;
    }
    Phone(Phone p){
        id=p.id;
        name=p.name;
    }

    void display() {
        System.out.println(id + " " + name);

    }
}

public class JavaClassTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Phone p1 = new Phone(1, "Samsaung");
        p1.display();
        Phone p2=new Phone(p1);
        p2.display();
    }

}
