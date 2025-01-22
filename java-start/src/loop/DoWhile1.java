package loop;

public class DoWhile1 {
    public static void main(String[] args) {
        int i = 10;

        // 최초 한 번은 항상 실행되고, 실행 후에 조건식을 검증하고
        // 참이면 다시 실행한다.
        do {
            System.out.println("현재 숫자는:" + i);
            i++;
        } while (i < 3);

//        while (i < 3) {
//            System.out.println("현재 숫자는 " + i);
//            i++;
//        }
    }
}
