package array.ex;

import java.util.Scanner;

public class ArrayEx3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.println("입력한 정수를 역순으로 출력");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i]);
            if (i > 0) {   // numbers.length - 1 로 배열의 마지막 부분만 if 구문 통과 X
                System.out.print(", ");
            }
        }
    }
}
