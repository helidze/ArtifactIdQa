package GroupIdQa;

import java.util.Scanner;

public class TriangleSides {
    public static void main(String[] args) {
        TriangleSides triangleSides = new TriangleSides();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ввести сторону A: ");
        int a = scanner.nextInt();
        System.out.print("Ввести сторону B: ");
        int b = scanner.nextInt();
        System.out.print("Ввести сторону C: ");
        int c = scanner.nextInt();

        System.out.println("Это треугольник? " + triangleSides.sidesChecker(a, b, c));
    }

    private boolean sidesChecker(int a, int b, int c) {
        if (a == 0 || b == 0 || c == 0) {
            System.out.println("Сторона не может быть 0");
            return false;
        }

        if (a > b + c || b > a + c || c > a + b) {
            System.out.println("Это не треугольник");
            return false;
        }

        return true;
    }
}
