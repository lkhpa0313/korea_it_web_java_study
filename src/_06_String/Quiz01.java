package _06_String;

public class Quiz01 {
    public static void main(String[] args) {
        //문제
        String id = "990226-1234567";
        //출력을 9902226-1
        System.out.println(id.substring(0,8)); //첫번째 방법
        System.out.println(id.substring(0,id.indexOf("-")+2)); //두번째 방법

    }
}
