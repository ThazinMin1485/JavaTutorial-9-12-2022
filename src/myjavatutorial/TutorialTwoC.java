package myjavatutorial;

import java.util.Scanner;

public class TutorialTwoC {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year");
        if(sc.hasNextInt()) {
            int n=sc.nextInt();
            String s=Integer.toString(n);
            char ch[]=s.toCharArray();
            if(ch[s.length()-1]=='0' && ch[s.length()-2]=='0') {
                if(n%400==0) {
                    System.out.println("This is a leap year");
                }
                else {
                    System.out.println("This is not a leap year");
                }
            }
            else {
                if(n%4==0) {
                    System.out.println("This is a leap year");
                }
                else {
                    System.out.println("This is not a leap year");
                }
            }
        }
        else {
            System.out.println("This is not a number");
        }

    }

}
