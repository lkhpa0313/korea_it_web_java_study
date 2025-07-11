package _21_Class.WaterBottle;

public class WaterBottleMain {
    public static void main(String[] args) {
        //문제
        //WaterBottle => WaterBottle클래스, WaterBottleMain
        //currentWater 현재 물의 양
        //메소드
        //물 채우기(fill) => 최대용량인 1000을 넘을 수 없다.
        //물 마시기(drink) => 현재 물의 양보다 초과해서 마실 수 없다.
        //getter를 통해 현재 물병의 물의 양에 접근할 수 있다.
        WaterBottle waterBottle = new WaterBottle();

        waterBottle.fill(1000);
        waterBottle.drink(400);
        waterBottle.fill(1000);
        System.out.println(waterBottle.getCurrentWater());
    }
}
