package method;

public class MethodValue2 {

    public static void main(String[] args) {

        int number = 5;
        System.out.println("1. changeNumber 호출 전, number: " + number);
        changeNumber(number);
        System.out.println("4. changeNumber 호출 후, number: " + number);
    }

    public static void changeNumber(int numbger) {
        System.out.println("2. changeNumber 변경 전, numbger: " + numbger);
        numbger = numbger * 2;
        System.out.println("3. changeNumber 변경 후, numbger: " + numbger);
    }
}
