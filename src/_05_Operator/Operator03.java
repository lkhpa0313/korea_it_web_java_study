package _05_Operator;

public class Operator03 {
    public static void main(String[] args) {
        //논리 연산자 (&, |, !)
        boolean flag1 = true;
        boolean flag2 = false;
        System.out.println(flag1 & flag2); // & and 논리곱 => 하나라도 false가 있으면 false
        System.out.println(flag1 | flag2); // | or 논리합 => 하나라도 true가 있으면 true
        System.out.println(flag2 | flag2);
        System.out.println(!flag1);

        //논리 연산자 조합 (&&, ||)
        //&& => 선 조건이 true일 때만 후 조건을 실행한다, 선 조건이 false이면 후 조건을 실행하지 않는다
        //|| => 선 조건이 true이면 후조건을 실행하지 않는다. 선 조건이 false일 때만 후 조건을 실행한다.
        System.out.println(flag1 && flag2);
        System.out.println(flag1 || flag2);

        // 삼항 연산자
        int x = 5;
        int y = 3;
        int max = (x > y) ? x : y;
        System.out.println(max);

        int min = (x < y) ? x : y;
        System.out.println(min);

        x = 3;
        boolean isSame = (x == y) ? true : false;
        System.out.println(isSame);

        String sameStr = (x != y) ? "다름" : "같음";
        System.out.println(sameStr);
        /*
         * int height = 숫자;
         * 키가 120이상 인 경우 탑승 가능하도록 하는 삼항연산자
         * 가능하면 "탑승 가능" 붕가능하면 "탑승 불가능" 출력
         * */
        int height = 180;
        String result = (height >= 120) ? "탑승 가능" : "탑승 불가능";
        System.out.println(result);
    }
}
