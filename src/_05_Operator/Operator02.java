package _05_Operator;

public class Operator02 {
    public static void main(String[] args) {
        // 증감 연산자
        int j = 10;
        System.out.println(j);

        // 실행이 된 후에 증가
        System.out.println(j++); //10 => 10 + 1
        System.out.println(j);
        //실행이 된 후에 1감소
        System.out.println(j--);
        System.out.println(j);
        //실행이 되기 전에 1증가
        System.out.println(++j); //11
        //실행이 되기 전에 1감소
        System.out.println(--j); //10

        // 비교 연산자 => 결과가 항상 boolean 참/거짓 둘 중 하나
        int num1 = 5;
        int num2 = 3;
        System.out.println(num1 > num2);
        System.out.println(num1 >= num2);
        System.out.println((num1 < num2));
        System.out.println(num1 <= num2);
        System.out.println(num1 == num2); // 같은 것이냐?
        System.out.println(num1 != num2); // 같은 것이 아니냐?


    }
}
