package GroupIdQa;

import java.util.Scanner;

public class TriangleSides {
    public static void main(String[] args) {
        TriangleSides triangleSides = new TriangleSides();
        System.out.println("Это треугольник? " + triangleSides.sidesChecker());
    }
    public boolean sidesChecker(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ввести сторону A: ");
        int a = scanner.nextInt();
        System.out.print("Ввести сторону B: ");
        int b = scanner.nextInt();
        System.out.print("Ввести сторону C: ");
        int c = scanner.nextInt();

        if (a > b+c || b > a+c || c > a+b){
            System.out.println("Это не треугольник");
            if (a == 0 || b == 0 || c == 0){
                System.out.println("Сторона не может быть 0");
            }
        }
        else
        return true;

        return sidesChecker(); // повторяем метод до того момента пока не введены правильные стороны треугольника
    }
}
