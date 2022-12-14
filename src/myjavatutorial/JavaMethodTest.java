package myjavatutorial;

import java.util.Scanner;

/**
 * <h2> JavaMethodTest Class</h2>
 * <p>
 * Process for Displaying JavaMethodTest
 * </p>
 * 
 * @author User
 *
 */
public class JavaMethodTest {

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
        System.out.println("Enter the number");
            int num = sc.nextInt();
            findPrimeNumber(num);
            JavaMethodTest jm=new JavaMethodTest();
            System.out.println("The larger number is " + jm.maxNumber(5, 4));
    }

    /**
     * <h2> findPrimeNumber</h2>
     * <p>
     * 
     * </p>
     *
     * @param num
     * @return void
     */
    public static void findPrimeNumber(int num) {
        int a = num / 2;
        int c=0;
        if (num == 0 || num == 1) {
            System.out.println("It is not a prime number");
        }
        else {
            for(int i=2;i<=a;i++) {
                if(num%i==0) {
                    c=1;
                    System.out.println("It is not a prime number");
                    break;
                }
            }
            if(c==0) {
                System.out.println("It is a prime number");
            }
        }
    }
    /**
     * <h2> maxNumber</h2>
     * <p>
     * 
     * </p>
     *
     * @param x
     * @param y
     * @return
     * @return int
     */
    public int maxNumber(int x,int y) {
        if(x>y) {
            return x;
        }
        else {
            return y;
        }
    }

}
