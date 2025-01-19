package array;

public class ArrayDi4 {
    public static void main(String[] args) {
        // 3x3 3차원 배열을 만든다.
        int[][] arr = new int[3][3];    // 3행 3열

        int i = 1;
        // 순서대로 1씩 증가하는 값을 입력한다.
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = i++;
            }
        }
        
        // 2차원 배열의 길이를 활용
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }
}
