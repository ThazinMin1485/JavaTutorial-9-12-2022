package myjavatutorial;

import java.util.Scanner;

/**
 * <h2>TutorialTwoB Class</h2>
 * <p>
 * Process for Displaying TutorialTwoB
 * </p>
 * 
 * @author User
 *
 */
public class TutorialTwoB {

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
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        int e = 0;
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter a number");
            if (sc.hasNextInt()) {
                int n = sc.nextInt();
                arr[i] = n;
            } else {
                System.out.println("This is not a number");
                e = 1;
                break;
            }
        }
        if (e == 0) {
            maxNumber(arr[0], arr[1], arr[2]);
        } else {
            System.out.println("Maximum number can't be return if your number is not a number");

        }
    }

    /**
     * <h2>maxNumber</h2>
     * <p>
     * 
     * </p>
     *
     * @param n1
     * @param n2
     * @param n3
     * @return void
     */
    public static void maxNumber(int n1, int n2, int n3) {
        if (n2 > n1) {
            if (n2 > n3) {
                System.out.println("The maximum number is " + n2);
            } else {
                System.out.println("The maximum number is " + n3);
            }
        } else {
            if (n1 > n3) {
                System.out.println("The maximum number is " + n1);
            } else {
                System.out.println("The maximum number is " + n3);
            }
        }
    }

}
