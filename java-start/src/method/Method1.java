package method;

public class Method1 {
    public static void main(String[] args) {
        // 변수만 다를 뿐 같은 연산을 반복할 경우 메서드를 이용할 수 있다.

        // 계산 1
        int a = 1;
        int b = 2;
        System.out.println(a + "+" + b + " 연산 수행");
        int sum1 = a + b;
        System.out.println("결과1 출력: " + sum1);

        System.out.println("=====================");

        // 계산2
        int x = 10;
        int y = 20;
        System.out.println(x + "+" + y + " 연산 수행");
        int sum2 = x + y;
        System.out.println("결과2 출력: " + sum2);
    }
}
