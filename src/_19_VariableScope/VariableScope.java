package _19_VariableScope;

public class VariableScope {
    public static void methodA() {
        String str = "abc";
//        System.out.println(name);
    }
    public static void main(String[] args) {
        String name = "이강현";
//        System.out.println(str);

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
//        System.out.println(i);
//        {
//            int age = 27;
//        }
//        System.out.println(age);
    }
}
