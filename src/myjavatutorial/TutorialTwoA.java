package myjavatutorial;

import java.util.Scanner;

public class TutorialTwoA {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter a number");
            boolean test=sc.hasNext();
            if(test==sc.hasNextInt()) {
                if(sc.nextInt()>0) {
                    System.out.println("It is a positive number");
                }
                else {
                    System.out.println("It is a negative number");
                }
            }
            else {
                System.out.println("Thi is not an integer.");
                
            }
    }

}
