package _18_Overloading;

public class Quiz01 {

    public static void printInfo(String name) {
        System.out.println("이름은 " + name);
    }
    public static void printInfo(String name, int age) {
        System.out.println("이름은 " + name +", 나이는" + age);
    }
    public static void printInfo(String name, int age, String email) {
        System.out.println("이름은 " + name +", 나이는" + age + ", 이메일은"
        + email);
    }

    public static void main(String[] args) {
        //문제
        //메소드 이름 printInfo()
        //문자열 이름만 전달 => 이름을 출력
        //문자열 이름, 정수 나이 전달 => 이름 나이 출력
        //문자열 이름, 정수 나이, 문자열 이메일 => 이름 나이 이메일 출력
        printInfo("이강현");
        printInfo("이강현", 41);
        printInfo("이강현", 41,"khlee@tannus.com");
    }
}
