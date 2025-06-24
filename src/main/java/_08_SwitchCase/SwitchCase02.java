package _08_SwitchCase;

public class SwitchCase02 {
    public static void main(String[] args) {

        int price = 7000;
        int grade = 1;
        //1등급이면 10000, 등급이 한단계씩 낮아질수록 -1000

        switch (grade) {
            case 1:
                price += 3000;
                break;
            case 2:
                price += 2000;
                break;
            case 3:
                price += 1000;
                break;
        }
        System.out.println("가격은" + price);
    }
}
