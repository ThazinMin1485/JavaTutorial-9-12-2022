package myjavatutorial;

import java.util.ArrayList;
import java.util.Collections;

/**
 * <h2> TutorialFourB Class</h2>
 * <p>
 * Process for Displaying TutorialFourB
 * </p>
 * 
 * @author User
 *
 */
public class TutorialFourB {

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
        ArrayList<String> a = new ArrayList<String>();
        a.add("Red");
        a.add("Green");
        a.add("Blue");
        a.add("Orange");
        System.out.print("Before swapping: ");
        for (String s : a) {
            System.out.print(s + " ");
        }
        System.out.println();
        System.out.print("After swapping: ");
        Collections.swap(a, 0, 2);
        for (String b : a) {
            System.out.print(b + " ");
        }
    }

}
