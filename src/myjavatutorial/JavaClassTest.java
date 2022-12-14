package myjavatutorial;

/**
 * <h2> Phone Class</h2>
 * <p>
 * Process for Displaying Phone
 * </p>
 * 
 * @author User
 *
 */
class Phone {
    /**
     * <h2> id</h2>
     * <p>
     * id
     * </p>
     */
    int id;
    /**
     * <h2> name</h2>
     * <p>
     * name
     * </p>
     */
    String name;

    /**
     * <h2> Constructor for Phone </h2>
     * <p>
     * Constructor for Phone
     * </p>
     * @param i
     * @param n
     */
    Phone(int i, String n) {
        id = i;
        name = n;
    }
    /**
     * <h2> Constructor for Phone </h2>
     * <p>
     * Constructor for Phone
     * </p>
     * @param p
     */
    Phone(Phone p){
        id=p.id;
        name=p.name;
    }

    /**
     * <h2> display</h2>
     * <p>
     * 
     * </p>
     *
     * @return void
     */
    void display() {
        System.out.println(id + " " + name);

    }
}

/**
 * <h2> JavaClassTest Class</h2>
 * <p>
 * Process for Displaying JavaClassTest
 * </p>
 * 
 * @author User
 *
 */
public class JavaClassTest {

    /**
     * <h2> main</h2>
     * <p>
     * 
     * </p>
     *
     * @param args
     * @return void
     */
    public static void main(String[] args) {
        Phone p1 = new Phone(1, "Samsaung");
        p1.display();
        Phone p2=new Phone(p1);
        p2.display();
    }

}
