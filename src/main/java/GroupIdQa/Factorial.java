package GroupIdQa;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        System.out.println("Факториал числа: " + factorial.factorialOfNumber());
    }

    public int factorialOfNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int x = scanner.nextInt();

        int fact = 1;
        for (int i = 1; i <= x; i++) {
            fact *= i;

        }
        return fact;
    }
}
