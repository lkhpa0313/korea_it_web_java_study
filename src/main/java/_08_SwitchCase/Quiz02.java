package _08_SwitchCase;

public class Quiz02 {
    public static void main(String[] args) {

        //1~7까지 숫자 하나 변수
        //월화수목금토일
         int day = 3;
         switch(day) {
             case 1:
                 System.out.println("월요일입니다.");
                 break;
             case 2:
                 System.out.println("화요일입니다.");
                 break;
             case 3:
                 System.out.println("수요일입니다.");
                 break;
             case 4:
                 System.out.println("목요일입니다.");
                 break;
             case 5:
                 System.out.println("금요일입니다.");
                 break;
             case 6:
                 System.out.println("토요일입니다.");
                 break;
             case 7:
                 System.out.println("일요일입니다.");
                 break;
         }
    }
}
