package _08_SwitchCase;

public class Quiz01 {
    public static void main(String[] args) {
        //봄: 3,4,5 => 봄입니다.
        //여름: 6,7,8 => 여름입니다.
        //가을: 9,10,11 => 가을입니다.
        //겨울: 12,1,2 => 겨울입니다.

        int month = 5;

        switch (month) {
            case 3: case 4: case 5:
                System.out.println("봄입니다.");
                break;
            case 6: case 7: case 8:
                System.out.println("여름입니다.");
                break;
            case 9: case 10: case 11:
                System.out.println("가을입니다.");
                break;
            case 12: case 1: case 2:
                System.out.println("겨울입니다.");

        }
    }
}
