package myjavatutorial;

public class TutorialThreeA {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int arr[] = { 3, 5, 7, 9, 15 };
        averageValue(arr);
    }

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
