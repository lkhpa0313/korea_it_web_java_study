package _06_String;

public class EscapeSequence {
    public static void main(String[] args) {
        //특수문자, 이스케이프 문자
        // \n, \t, \\, \", \'
        System.out.println("집에");
        System.out.println("너무");
        System.out.println("가고싶어요");

        // \n => new line
        System.out.println("집에\n너무\n가고\n싶어요");

        // \t => tab (스페이스 4칸)
        /*
            손흥민
            페이커
            방탄소년단
            블랙핑크
        */
        System.out.println("\t손흥민");
        System.out.println("\t페이커");
        System.out.println("\t방탄소년단");
        System.out.println("\t블랙핑크");

        // \\
        // "C:\Program Files\java"
        System.out.println("C:\\Program Files\\java");

        // \"
        // 손흥민의 팀은 "토트넘 훗스퍼 FC"이다
        System.out.println("손흥민의 팀은 \"토트넘 훗스퍼 FC\"이다");

        // \'
        // 페이커는 '신'이다
        System.out.println("페이커는 \'신\'이다");

        char c = 'A';
        c = '\'';
        System.out.println(c);



    }
}
