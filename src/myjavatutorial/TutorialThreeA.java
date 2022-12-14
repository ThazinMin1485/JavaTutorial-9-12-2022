package myjavatutorial;

import java.util.Scanner;

/**
 * <h2> TutorialThreeA Class</h2>
 * <p>
 * Process for Displaying TutorialThreeA
 * </p>
 * 
 * @author User
 *
 */
public class TutorialThreeA {

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
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter how much number you wnt to add");
        if(sc.hasNextInt()) {
            int n=sc.nextInt();
            int arr[]=new int[n];
            int a=0;
            for(int i=0;i<arr.length;i++) {
                if(sc.hasNextInt()) {
                    arr[i]=sc.nextInt();
                }
                else {
                    System.out.println("This is not a number");
                    a=1;
                    break;
                }
            }
            if(a==0) {
                averageValue(arr);
            }
            else {
                System.out.println("Your entered value is not a number");
            }
        }
        else {
            System.out.println("Please Enter a number");
        }
    }

    /**
     * <h2> averageValue</h2>
     * <p>
     * 
     * </p>
     *
     * @param arr
     * @return void
     */
    public static void averageValue(int arr[]) {
        float sum = 0;
        float result;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        result=sum/arr.length;
        System.out.println(result);
    }

}
