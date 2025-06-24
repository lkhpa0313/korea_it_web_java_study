package _10_While;

public class Quiz01 {
    public static void main(String[] args) {

        //1~100까지 누적합
        int num = 1;
        int sum = 0;
        while (num <=100) {
            sum = sum + num;
            num++;
        }
        System.out.println("합계는 " + sum);
    }
}
