package _20_Scanner;

import java.util.Scanner;

public class Quiz01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //int age;
        //String name;
        // 두 개 입력받고 출력
        int age = scanner.nextInt();
        System.out.print("나이를 입력해주세요>>>>>");
        scanner.nextLine();
        String name = scanner.next();
        System.out.print("이름을 입력해주세요>>>>>");
        System.out.println("나이는 " + age + "살, 이름은 " + name + "입니다.");
    }
}
