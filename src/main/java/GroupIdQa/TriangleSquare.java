package GroupIdQa;

import java.util.Scanner;

public class TriangleSquare {
    public static void main(String[] args) {
        TriangleSquare sqr = new TriangleSquare();
        sqr.getTriangleSquare();
    }

    public double getTriangleSquare() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите сторону правильного треугольника: ");
        int a = scanner.nextInt();
        System.out.print("Введите высоту правильного треугольника: ");
        int h = scanner.nextInt();

        double S = 0.5 * a * h;
        System.out.print("\nПлощадь треугольника = " + S + "\n");


        return S;
    }

}
