package _08_SwitchCase;

public class SwitchCase {
    public static void main(String[] args) {
        //조건문 - Switch Case
        //1등 => 전액 장학금
        //2등 => 반액 장학금
        //3등 => 소정의 상품
        //그 이하 => 박수

        int ranking = 2;
        if(ranking == 1) {
            System.out.println("전액 장학금");
        } else if(ranking == 2) {
            System.out.println("반액 장학금");
        } else if(ranking == 3) {
            System.out.println("소정의 상품!!");
        } else {
            System.out.println("짝짝짝짝!!");
        }
        System.out.println("수여 끝~");

        switch (ranking) {
            case 1:
                System.out.println("전액 장학금!!");
                break;
            case 2:
                System.out.println("반액 장학금!!");
                break;
            case 3:
                System.out.println("소정의 상품");
                break;
            default:
                System.out.println("짝짝짝짝!!!");
        }
        System.out.println("수여 끝");

    }
}
