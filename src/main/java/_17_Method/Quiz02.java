package _17_Method;

public class Quiz02 {

    public static void isEven(int a) {
        String result = (a % 2 == 0) ? "짝수임" : "홀수임";
        System.out.println(result);
    }

    public static void main(String[] args) {
        // 정수를 전달하여 짝수인지 홀수인지 판별하는 메소드
        //단, 삼항연산자를 쓸것
        //isEven(2);
        isEven(2);

    }
}
