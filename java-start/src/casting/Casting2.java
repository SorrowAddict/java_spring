package casting;

public class Casting2 {
    public static void main(String[] args) {
        double doubleValue = 1.5;
        int intValue = 0;

//        intValue = doubleValue; // 컴파일 오류 발생
        // 큰 자료형에서 작은 자료형으로의 형변환은 컴파일 오류를 발생시킨다.
        intValue = (int) doubleValue;
        System.out.println(intValue);

        System.out.println((int) 10.5);
    }
}
