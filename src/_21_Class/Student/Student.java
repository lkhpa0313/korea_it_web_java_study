package _21_Class.Student;

public class Student {
    private String name;
    private int age;
    private String email;
    private String address;

    //private일때 값을 넣는 방법
    //1. 생성자

    public Student(String name, int age, String email, String address) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.address = address;
    }
    //2. setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void showInfo() {
        System.out.println("이름은 " + name);
        System.out.println("나이는 " + age);
        System.out.println("이메일은 " + email);
        System.out.println("주소는 " + address);
    }
}
