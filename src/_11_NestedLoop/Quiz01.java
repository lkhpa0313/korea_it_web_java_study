package _11_NestedLoop;

public class Quiz01 {
    public static void main(String[] args) {
        //역삼각형을 그리시오
        //*****
        //****
        //***
        //**
        //*

        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
