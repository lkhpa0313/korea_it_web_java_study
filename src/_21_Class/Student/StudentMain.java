package _21_Class.Student;

public class StudentMain {
    public static void main(String[] args) {
        //Student라는 패키지 만들고 안에 Student와 StudentMain만들기
        //이름, 나이, 이메일, 주소 변수 만들고
        //메소드 showInfo() => 정보출력
        //StudentMain에서 객체 생성 후 여러분 정보 대입(주소 대충)
        //showInfo()호출해서 정보출력

        Student student = new Student();

        student.name = "홍길동";
        student.age = 17;
        student.email = "hong@gmail.com";
        student.address = "우주시 깐따삐아별";

        student.showInfo();
    }
}
