package _21_Class.Car;

public class CarMain {
    public static void main(String[] args) {
        Car car1 = new Car();

        Car car2 = new Car("맥라렌");

        Car car3 = new Car("맥라렌",2025, "black");

        car3.startCar();
        car3.drive();
        car3.stop();
    }
}
