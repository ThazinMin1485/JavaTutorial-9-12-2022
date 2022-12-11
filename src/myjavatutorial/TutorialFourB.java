package myjavatutorial;

import java.util.ArrayList;
import java.util.Collections;

public class TutorialFourB {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
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
