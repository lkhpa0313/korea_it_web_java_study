package _18_Overloading;

public class Overloading {
    public static int getPower(int number) {
        return number * number;
    }

    public static int getPower(double doubleNum) {
        int number = (int) doubleNum;
        return number * number;
    }

    public static int getPower(String strNum) {
        int number = Integer.parseInt(strNum);
        return number * number;
    }

    public static int getPowerByExp(int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;
    }

    public static void main(String[] args) {
        //메소드 오버로딩
        //같은 이름의 메소드를 여러 개 선언
        //매개변수(파라미터)의 타입이 달라야한다. 또는 갯수가 달라야한다.
        System.out.println(getPower(3));
        System.out.println(getPower(2.3));
        System.out.println(getPower("4"));
        System.out.println(getPowerByExp(2,4));
    }
}
