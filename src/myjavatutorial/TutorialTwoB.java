package myjavatutorial;

import java.util.ArrayList;
import java.util.Scanner;

public class TutorialTwoB {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int [] arr=new int[3];
       for(int i=0;i<3;i++) {
           System.out.println("Enter a number");
           
           if(sc.hasNext()==sc.hasNextInt()) {
               int n = sc.nextInt();
               arr[i]=n;
           }
           else {
               System.out.println("This is not a number");
               break;
           }
       }
       maxNumber(arr[0],arr[1],arr[2]);

    }
    public static void maxNumber(int n1,int n2,int n3){
        if(n2>n1) {
            if(n2>n3) {
                System.out.println("The maximum number is " + n2);
            }
            else {
                System.out.println("The maximum number is " + n3);
            }
        }
        else {
            if(n1>n3) {
                System.out.println("The maximum number is " + n1);
            }
            else {
                System.out.println("The maximum number is " + n3);
            }
        }
    }

}
