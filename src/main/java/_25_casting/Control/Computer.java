package _25_casting.Control;

public class Computer implements Power {

    @Override
    public void off() {
        System.out.println("컴퓨터의 전원을 끕니다.");
    }

    @Override
    public void on() {
        System.out.println("컴퓨터의 전원을 켭니다.");
    }

    public void compute() {
        System.out.println("컴퓨터가 연산을 합니다.");
    }
}