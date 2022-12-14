package myjavatutorial;

import java.util.ArrayList;
import java.util.List;

/**
 * <h2> TutorialThreeC Class</h2>
 * <p>
 * Process for Displaying TutorialThreeC
 * </p>
 * 
 * @author User
 *
 */
public class TutorialThreeC {

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
        List<String> list = (List<String>) new ArrayList<String>();
        list.add("Python");
        list.add("JAVA");
        list.add("PHP");
        list.add("Perl");
        list.add("C#");
        String []array=list.toArray(new String[list.size()]);
        for(String i:array) {
            System.out.print(i+" ");
        }
    }

}
