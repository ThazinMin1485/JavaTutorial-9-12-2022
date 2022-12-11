package myjavatutorial;

import java.util.ArrayList;
import java.util.List;

public class TutorialThreeC {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
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
