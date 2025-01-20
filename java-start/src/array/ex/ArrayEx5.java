package array.ex;

import java.util.Scanner;

public class ArrayEx5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int count = scanner.nextInt();
        int[] numbers = new int[count];
        int sum = 0;
        double average;

        System.out.println("Enter count numbers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
            sum += numbers[i];
        }

        average = (double) sum / numbers.length;
        System.out.println("The Sum is " + sum);
        System.out.println("The average is " + average);
    }
}
