package _21_Class.WaterBottle;

public class WaterBottle {
    private int currentWater;

    public void fill(int amount) {
        if (amount > 0 && currentWater + amount <= 1000) {
            currentWater += amount;
        System.out.println("물통에 " + amount + "만큼 물을 채워졌습니다." + "현재 물의 양: " +
                currentWater + "입니다.");
        } else {
            System.out.println("더 이상 물을 채울 수 없습니다.");
        }
    }

    public void drink(int amount) {
        if (amount > 0 && amount <= currentWater) {
            currentWater -= amount;
            System.out.println("물을 " + amount + "만큼 마셨습니다." + "현재 물의 양: " +
                    currentWater + "입니다.");
        } else {
            System.out.println("물통에 물이 부족합니다. 현재 물의 양 : " + currentWater);
        }
    }

    public int getCurrentWater() {
        return currentWater;
    }
}
