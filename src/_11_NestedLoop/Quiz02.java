package _11_NestedLoop;

public class Quiz02 {
    public static void main(String[] args) {
        // 풀어보세요
        /*
        SSSS*
        SSS**
        SS***
        S****
        *****
        */

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4 - i; j++) {
                System.out.print("S");
            }
            for (int j = 0; j < i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
