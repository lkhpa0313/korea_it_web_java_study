package _09_For;

public class Quiz02 {
    public static void main(String[] args) {

        //10 ~ 1까지 거꾸로 출력
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }

        //문제 => 1~100까지 다 더한 값을 출력하시오
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
                sum = sum + i;
        }
        System.out.println(sum);
    }
}
