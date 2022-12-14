package myjavatutorial;

/**
 * <h2> Animal Class</h2>
 * <p>
 * Process for Displaying Animal
 * </p>
 * 
 * @author User
 *
 */
interface Animal {
    /**
     * <h2> bark</h2>
     * <p>
     * 
     * </p>
     *
     * @return void
     */
    void bark();

    /**
     * <h2> meow</h2>
     * <p>
     * 
     * </p>
     *
     * @return void
     */
    void meow();
}

/**
 * <h2> Dog Class</h2>
 * <p>
 * Process for Displaying Dog
 * </p>
 * 
 * @author User
 *
 */
abstract class Dog implements Animal {
    /**
     * <h2> bark </h2>
     * <p>
     * 
     * </p>
     * 
     */
    public void bark() {
        System.out.println("Barking");
    }
}

/**
 * <h2> Cat Class</h2>
 * <p>
 * Process for Displaying Cat
 * </p>
 * 
 * @author User
 *
 */
class Cat extends Dog {
    /**
     * <h2> meow </h2>
     * <p>
     * 
     * </p>
     * 
     */
    public void meow() {
        System.out.println("Meow");
    }
}

/**
 * <h2> OOPTest Class</h2>
 * <p>
 * Process for Displaying OOPTest
 * </p>
 * 
 * @author User
 *
 */
public class OOPTest {

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
        Animal a = new Cat();
        a.bark();
        a.meow();
    }

}
