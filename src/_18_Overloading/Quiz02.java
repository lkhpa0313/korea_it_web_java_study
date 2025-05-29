package _18_Overloading;

public class Quiz02 {

    public static void add(int a, int b) {
        System.out.println(a + "+" + b + "=" + (a+b));
    }
    public static void add(double a, double b) {
        System.out.println(a + "+" + b + "=" + (a+b));
    }
    public static void add(String strNum1, String strNum2) {
        System.out.println(strNum1 + "+" + strNum2 + "=" + (Integer.parseInt(strNum1)+Integer.parseInt(strNum2)));
    }

    public static void main(String[] args) {
        //메소드 이름 add()
        //int와 int 덧셈
        //double과 double 덧셈
        //문자열숫자와 문자열숫자 덧셈
        add(2,4);
        add(2.3, 3.4);
        add("2", "4");
    }
}
