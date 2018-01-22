package GroupIdQa;

import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        System.out.print("Расстояние между двумя точками с задаными координатами = " + getDistance());
    }
    public static double getDistance(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ввести ось x1: ");
        double x1 = scanner.nextDouble();
        System.out.print("Ввести ось y1: ");
        double y1 = scanner.nextDouble();
        System.out.print("Ввести ось x2: ");
        double x2 = scanner.nextDouble();
        System.out.print("Ввести ось y2: ");
        double y2 = scanner.nextDouble();

        double arg1 = x2 - x1;
        double arg2 = y2 - y1;
        double arg3 = Math.pow(arg1,2) + Math.pow(arg2,2);
        double distance = Math.pow(arg3,0.5);
        return distance;

    }
}
