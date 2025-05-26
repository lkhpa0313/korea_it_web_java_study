package _05_Operator;

public class Operator {
    public static void main(String[] args) {
        // 연산자

        // 대입 연산자
        int num1 = 10;
        int num2 = 5;
        // 여기서 =은 해당 변수에 데이터(값)을 대입한다는 의미
        // 수학적인 같다라는 의미가 아님

        // 산술 연산자
        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 * num2);
        System.out.println(num1 / num2);
        System.out.println(num1 % num2);

        //복합 대입 연산자
        num1 += 5; // num1 = num1 + 5 => 15
        System.out.println(num1);
        num1 -= 5; // num1 = num1 - 5 => 10
        System.out.println(num1);
        num1 *= 2; // num1 = num1 * 2 => 20
        System.out.println(num1);
        num1 /= 2; // num1 = num1 / 2 => 10
        System.out.println(num1);
        num1 %= 2; //num1 = num1 % 2 => 0
        System.out.println(num1);




    }
}
