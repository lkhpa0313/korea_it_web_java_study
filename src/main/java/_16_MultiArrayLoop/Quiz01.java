package _16_MultiArrayLoop;

public class Quiz01 {
    public static void main(String[] args) {
        //다차원 배열 합 구하기
        //3x3크기 1부터 홀수만 차례대로 대입하고 출력해서 확인
        //그 수들의 합 구하기

        int[][] arr = new int[3][3];
        int num = 1;

        // 홀수만 다 대입
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = num;
                num += 2;

            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }System.out.println("합계는" + sum);
    }
}
