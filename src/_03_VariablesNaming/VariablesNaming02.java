package _03_VariablesNaming;

public class VariablesNaming02 {
    public static void main(String[] args) {

        String carBrandName = "BMW";
        String carModelName = "MX";
        String carColor = "black";
        int carPassengerCapacity = 5;
        int carModelYear = 2025;

        // 상수 절대 변하지 않는 데이터 => 상수명 다 대문자
        final String COUNTRY_CODE = "KR";
//        COUNTRY_CODE = "US";

        System.out.println("회사명 : " + carBrandName);
        System.out.println("차종 : " + carModelName);
        System.out.println("색상 : " + carColor);

    }
}
