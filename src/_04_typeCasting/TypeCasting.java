package _04_typeCasting;

public class TypeCasting {
    public static void main(String[] args) {
        // 형 변환 TypeCasting

        // 정수에서 실수로

        int scoreInt = 98;
        System.out.println(scoreInt);
        System.out.println((float) scoreInt);
        System.out.println((double) scoreInt);
        System.out.println(scoreInt);

        // 실수에서 정수
        float scoreFloat = 97.5f;
        System.out.println(scoreFloat);
        System.out.println((int) scoreFloat);

        double scoreDouble = 88.5;
        System.out.println((int) scoreDouble);

        double sum1 = 98 + 77.3;
        System.out.println(sum1);

        int sum2 = 98 + (int) 55.3f;
        System.out.println(sum2);

        int convertedScoreInt = (int) scoreDouble;
        System.out.println(convertedScoreInt);
        // double -> float -> long -> int (수동 형변환)

        double convertedScoreDouble = scoreInt;
        System.out.println(convertedScoreDouble);
        // int -> long -> float ->double (자동 형변환)

        long scoreLong = 45L;
        convertedScoreInt = (int) scoreLong;
        System.out.println(convertedScoreInt);




    }
}
