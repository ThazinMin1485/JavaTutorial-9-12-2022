package myjavatutorial;

import java.util.Scanner;

/**
 * <h2> TutorialTwoC Class</h2>
 * <p>
 * Process for Displaying TutorialTwoC
 * </p>
 * 
 * @author User
 *
 */
public class TutorialTwoC {

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
        System.out.println("Enter a year");
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            if(n>0) {
                String s = Integer.toString(n);
                char ch[] = s.toCharArray();
                if (ch[s.length() - 1] == '0' && ch[s.length() - 2] == '0') {
                    if (n % 400 == 0) {
                        System.out.println("This is a leap year");
                    } else {
                        System.out.println("This is not a leap year");
                    }
                } else {
                    if (n % 4 == 0) {
                        System.out.println("This is a leap year");
                    } else {
                        System.out.println("This is not a leap year");
                    }
                }  
            }
            else {
                System.out.println("Years can't be negative or zero");
            }
        } else {
            System.out.println("This is not a number");
        }

    }

}
