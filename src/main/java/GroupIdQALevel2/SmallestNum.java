package GroupIdQALevel2;

import java.util.Scanner;

public class SmallestNum {
    public static void main(String[] args) {
        SmallestNum smallestNum = new SmallestNum();
        System.out.println("Меньшее число ---> " + smallestNum.getSmallestNum());
    }


    private int getSmallestNum() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int a = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int b = scanner.nextInt();
        if (a < b) {
            return a;
        } else {
            return b;
        }

    }
}
