package myjavatutorial;

import java.util.*;
import java.util.Scanner;
import java.util.stream.*;

/**
 * <h2> ExamResult Class</h2>
 * <p>
 * Process for Displaying ExamResult
 * </p>
 * 
 * @author User
 *
 */
class ExamResult {
    /**
     * <h2> id</h2>
     * <p>
     * id
     * </p>
     */
    int id;
    /**
     * <h2> name</h2>
     * <p>
     * name
     * </p>
     */
    String name;
    /**
     * <h2> mark</h2>
     * <p>
     * mark
     * </p>
     */
    float mark;

    /**
     * <h2> Constructor for ExamResult </h2>
     * <p>
     * Constructor for ExamResult
     * </p>
     * @param id
     * @param name
     * @param mark
     */
    public ExamResult(int id, String name, float mark) {
        this.id = id;
        this.name = name;
        this.mark = mark;
    }
}

/**
 * <h2> ArraysTest Class</h2>
 * <p>
 * Process for Displaying ArraysTest
 * </p>
 * 
 * @author User
 *
 */
public class ArraysTest {

    /**
     * <h2> main</h2>
     * <p>
     * 
     * </p>
     *
     * @param args
     * @return void
     */
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Enter an integer value");
            if (s.hasNextInt()) {
                int x = s.nextInt();
                int arr[] = new int[x];
                for (int i = 0; i < arr.length; i++) {
                    arr[i] = i;
                }
                for (int a : arr) {
                    System.out.print(a + " ");
                }
                System.out.println();
            } else {
                System.out.println("Please enter an integer value");
            }
        }
        int multiarr[][] = { { 1, 3, 5, 7 }, { 2, 4, 6, 8, 10 } };
        for (int b = 0; b < 2; b++) {
            for (int j = 0; j < multiarr[b].length; j++) {
                System.out.print(multiarr[b][j] + " ");
            }
            System.out.println();
        }
        Stream.iterate(1, element -> element + 1).filter(element -> element % 2 == 0).limit(5)
                .forEach(System.out::println);
        List<ExamResult> resultList = new ArrayList<ExamResult>();
        resultList.add(new ExamResult(1, "English", 65));
        resultList.add(new ExamResult(2, "Mathematic", 90));
        resultList.add(new ExamResult(1, "Myanmar", 70));
        resultList.add(new ExamResult(1, "Physic", 80));
        resultList.add(new ExamResult(1, "Chemistry", 80));
        resultList.add(new ExamResult(1, "Bio", 70));
        Double totalmarks = resultList.stream().collect(Collectors.summingDouble(result -> result.mark));
        System.out.println(totalmarks);
        long count = resultList.stream().filter(result -> result.mark >= 80).count();
        System.out.println(count);
    }

}
