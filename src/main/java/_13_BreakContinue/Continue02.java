package _13_BreakContinue;

public class Continue02 {
    public static void main(String[] args) {

        int waiting = 50;  // 대기 인원수
        int nowNum = 1; //현재 입장 번호 (시작번호)
        int max = 20; //판매 가능한 갯수
        int sold = 0; //현재 판매량
        int noShow = 12; //노쇼 번호

        while (nowNum <= waiting) {
            System.out.println(nowNum + "번 손님 입장!");

            if (nowNum == noShow) {
                System.out.println(nowNum + "번 손님 노쇼함");
                nowNum++;
                continue;
            }
            sold++;  // 판매처리
            if (sold == max) {  // 메뉴가 다 팔렸을때
                System.out.println("재료 소진!");
                break;
            }
            nowNum++;
        }
    }
}
