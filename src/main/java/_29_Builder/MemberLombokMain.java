package _29_Builder;

public class MemberLombokMain {
    public static void main(String[] args) {
        MemberLombok memberLombok = MemberLombok.builder()
                .age(41)
                .email("lkhpa@naver.com")
                .name("이강현")
                .build();
    }
}