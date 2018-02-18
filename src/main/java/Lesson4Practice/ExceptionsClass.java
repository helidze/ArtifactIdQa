package Lesson4Practice;

public class ExceptionsClass {

    public static void main(String[] args) {
        devideByZero(5, 0


        );
    }

    public int sumTwoNumbers(int x, int y) {
        int sum = x + y;
        return sum;
    }

    public static void devideByZero(int x, int y) {
        try {
            int a = x / y;
            System.out.println(a);
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
    }
}
