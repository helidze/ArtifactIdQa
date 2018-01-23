package GroupIdQa;

import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите вес в киллограммах: ");
        double mass = scanner.nextDouble();
        System.out.print("Введите рост в метрах: ");
        double height = scanner.nextDouble();
        System.out.println();
        getBodyIndex(mass,height);

    }

    private static void getBodyIndex(double mass, double height) {

        double result = mass / (Math.pow(height, 2));
        System.out.print("Индекс массы тела = " + result);
    }
}
