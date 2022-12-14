package myjavatutorial;

import java.util.Scanner;

/**
 * <h2> TutorialTwoA Class</h2>
 * <p>
 * Process for Displaying TutorialTwoA
 * </p>
 * 
 * @author User
 *
 */
public class TutorialTwoA {

    /**
     * <h2> main</h2>
     * <p>
     * 
     * </p>
     *
     * @param args
     * @return void
     */
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter a number");
            boolean test=sc.hasNext();
            if(test==sc.hasNextInt()) {
                int n=sc.nextInt();
                if(n>0) {
                    System.out.println("It is a positive number");
                }
                else if(n==0) {
                    System.out.println("This is zero");
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
