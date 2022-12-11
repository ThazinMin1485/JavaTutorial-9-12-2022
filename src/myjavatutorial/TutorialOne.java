package myjavatutorial;

import java.util.Scanner;

public class TutorialOne {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=s.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        for(int a=n-1;a>=1;a--) {
            for(int b=a;b<=n;b++) {
                System.out.print(b + " ");
            }
            System.out.println();
        }
    }

}
