package myjavatutorial;

import java.util.Scanner;

/**
 * <h2>TutorialOne Class</h2>
 * <p>
 * Process for Displaying TutorialOne
 * </p>
 * 
 * @author User
 *
 */
public class TutorialOne {

    /**
     * <h2>main</h2>
     * <p>
     * 
     * </p>
     *
     * @param args
     * @return void
     */
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = s.nextInt();
        for (int i = 1; i <= n; i++) {
            int d=i;
            while(d>=2) {
                System.out.print(" ");
                d--;
            }
            for (int j = i; j <= n; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        for (int a = n - 1; a >= 1; a--) {
            int c=a;
            while(c>=2) {
                System.out.print(" ");
                c--;
            }
            for (int b = a; b <= n; b++) {
                System.out.print(b + " ");
            }
            System.out.println();
        }
    }

}
