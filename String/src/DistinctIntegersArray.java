import java.util.Scanner;

import static java.util.Arrays.stream;

public class DistinctIntegersArray {
    public static void main(String[] args) {

        int[] array = new int[10];

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 10 numbers: ");

        for (int i = 0; i < 10; i++) {
            array[i] = sc.nextInt();
        }

        System.out.println("The not duplicated numbers are:");
        stream(array).distinct()
                .sorted()
                .forEach(line -> System.out.println(line));

    }
}