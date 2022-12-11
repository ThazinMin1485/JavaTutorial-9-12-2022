package myjavatutorial;

import java.util.Scanner;

public class JavaMethodTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
            int num = sc.nextInt();
            findPrimeNumber(num);
            JavaMethodTest jm=new JavaMethodTest();
            System.out.println("The larger number is " + jm.maxNumber(5, 4));
    }

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
    public int maxNumber(int x,int y) {
        if(x>y) {
            return x;
        }
        else {
            return y;
        }
    }

}
