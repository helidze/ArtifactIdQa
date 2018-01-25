package GroupIdQa;

import java.util.Scanner;

public class OddFactorial {
    public static void main(String[] args) {
        OddFactorial oddFactorial = new OddFactorial();
        Scanner s = new Scanner(System.in);
        System.out.print("Введите число: ");
        System.out.println(oddFactorial.getOddFactorial());

    }

    private int getOddFactorial() {
        int sum = 0;
        for (int count = 1; count <= 9; count = count + 2) {
            sum = sum + getFactorial(count);
        }
        return sum;
    }

    private int getFactorial(int a) {

        int fact = 1;
        for (int i = 1; i <= a; i++) {
            fact *= i;

        }
        return fact;

    }
}

