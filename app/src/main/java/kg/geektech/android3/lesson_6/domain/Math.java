package kg.geektech.android3.lesson_6.domain;

public class Math {

    public int add(int a, int b) {
        return a + b;
    }
    public int  minus(int a, int b) {
        return a - b;
    }

    public int multiplication(int a, int b) {
        return a * b;

    }
    public int division(int a, int b) {
        if (b !=0) {
            return a / b;
        }else {
            System.out.println("division by 0");
            return 0;
        }

    }

}
