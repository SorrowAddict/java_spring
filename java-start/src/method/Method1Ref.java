package method;

public class Method1Ref {
    public static void main(String[] args) {
        // 변수만 다를 뿐 같은 연산을 반복할 경우 메서드를 이용할 수 있다.

        // 계산 1
        int sum1 = add(5, 10);
        System.out.println("결과1 출력: " + sum1);

        // 계산2
        int sum2 = add(15, 20);
        System.out.println("결과2 출력: " + sum2);
    }

    // add 메서드
    public static int add(int a, int b) {
        System.out.println(a + "+" + b + " 연산 수행");
        int sum = a + b;
        return sum;

    }
}
