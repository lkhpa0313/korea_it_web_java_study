package _12_MultipleTable;

public class MultipleTable {
    public static void main(String[] args) {
        //2~9단까지 출력하십시오
        //2 X 3 = 6
        for (int i = 2; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.println(i + " X " + j + " = " + i * j);
            }
            System.out.println();
        }
    }
}
