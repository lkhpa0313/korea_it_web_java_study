package _26_Objects;

public class Main {
    public static void main(String[] args) {
        //모든 클래스는 Object 클래스를 상속받고 있다.

        Teacher teacher1 = new Teacher("이강현", "깐따삐아학교");
        Teacher teacher2 = new Teacher("이강현", "깐따삐아학교");
        System.out.println(teacher1);
        System.out.println(teacher1.hashCode());
        System.out.println(teacher2.hashCode());
        System.out.println(teacher1.equals(teacher2));

    }
}