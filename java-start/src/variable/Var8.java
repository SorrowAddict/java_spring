package variable;

public class Var8 {
    public static void main(String[] args) {
        // 정수
        byte b = 127;   // -128 ~ 127
        short s = 32767;    // -32,768 ~ 32,767
        int i = 2147483647; // -2,147,483,648 ~ 2,147,483,647 (약  20억)

        // -9223372036854775808 ~ 9223372036854775807
        long l = 9223372036854775807L;

        // 실수
        float f = 10.0f;    // 뒤에 f를 붙여야 함
        double d = 10.0;
    }
}
