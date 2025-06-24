package _09_For;

public class Quiz01 {
    public static void main(String[] args) {
        //1~10까지 출력, 짝수만 출력
        //첫번째 방법 (if문 사용)
        for (int i = 1; i <= 10; i++) {
            if(i % 2 == 0) {
                System.out.println(i);
            }
        }
        //두번째 방법
        for (int i = 2; i <= 10; i+=2) {
            System.out.println(i);
        }
    }
}
