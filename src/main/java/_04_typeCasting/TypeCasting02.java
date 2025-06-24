package _04_typeCasting;

public class TypeCasting02 {
    public static void main(String[] args) {

        // 숫자에서 문자열로
        String strNum1 = String.valueOf(55); //첫번째 방법
        strNum1 = Integer.toString(55); //두번째 방법
        System.out.println(strNum1 );

        //double에서 문자열
        String strNum2 = String.valueOf(88.37);
        strNum2 = Double.toString(88.37);
        System.out.println(strNum2);

        //float에서 문자열
        String strNum3 = String.valueOf(123.45F);
        strNum3 = Float.toString(123.45F);
        System.out.println(strNum3);

        //문자열을 숫자로 "123" -> 123
        int i = Integer.parseInt("123");
        System.out.println(i);

        double d = Double.parseDouble("123.45");
        System.out.println(d);

//        i = Integer.parseInt("숫자");
//        System.out.println(i);
    }
}
