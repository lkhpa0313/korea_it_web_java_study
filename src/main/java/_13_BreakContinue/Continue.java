package _13_BreakContinue;

public class Continue {
    public static void main(String[] args) {
        // 반복문 - continue
        // continue - 다시 처음으로 돌아감

        int waiting = 50;  // 대기 인원수
        int max = 20; //판매 가능한 갯수
        int sold = 0; //현재 판매량
        int noShow = 12; //노쇼 번호

        for (int i = 1; i <= waiting; i++) {
            System.out.println(i + "번 손님 입장");
            if (i == noShow) {
                System.out.println(i + "번 손님 노쇼 ㅡㅡ");
                continue;
            }
            sold++;
            if (sold == max) {
                System.out.println("재료 소진");
                break;
            }
        }
    }
}
