package myjavatutorial;

import java.util.Arrays;

public class TutorialThreeB {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int arr[] = { 25, 13, 18, 20, 45 };
        System.out.println("Original Array: " + Arrays.toString(arr));
        removeElement(arr, 20);
    }

    public static void removeElement(int arr[], int n) {
        int array[] = new int[arr.length - 1];
        int j=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                continue;
            } 
            else {
                array[j++] = arr[i];
            }
        }
        System.out.println("Removed Array: " + Arrays.toString(array));
    }
}
