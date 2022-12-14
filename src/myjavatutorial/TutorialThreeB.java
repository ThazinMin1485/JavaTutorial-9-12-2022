package myjavatutorial;

import java.util.Arrays;
import java.util.Scanner;

/**
 * <h2>TutorialThreeB Class</h2>
 * <p>
 * Process for Displaying TutorialThreeB
 * </p>
 * 
 * @author User
 *
 */
public class TutorialThreeB {

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
        int arr[] = { 25, 13, 18, 20, 45 };
        System.out.println("Original Array: " + Arrays.toString(arr));
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number you want to remove");
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            removeElement(arr, n);
        } else {
            System.out.println("This is not a number");
        }

    }

    /**
     * <h2>removeElement</h2>
     * <p>
     * 
     * </p>
     *
     * @param arr
     * @param n
     * @return void
     */
    public static void removeElement(int arr[], int n) {
        int array[] = new int[arr.length];
        int j = 0;
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                continue;
            } else {
                array[j] = arr[i];
                j++;
                k++;
            }
        }
        if (k != 5) {
            int newarr[] = Arrays.copyOf(array, array.length - 1);
            System.out.println("Removed Array: " + Arrays.toString(newarr));
        } else {
            System.out.println("Your entered number is not in array");
        }
    }
}
