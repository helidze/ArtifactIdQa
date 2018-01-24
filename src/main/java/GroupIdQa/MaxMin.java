package GroupIdQa;

import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        MaxMin maxMin = new MaxMin();
        maxMin.getMinMax();
    }

    public void getMinMax() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите 1-е число: ");
        int a = sc.nextInt();
        System.out.print("Введите 2-е число: ");
        int b = sc.nextInt();
        System.out.print("Введите 3-е число: ");
        int c = sc.nextInt();

        if (a == b && a == c) {
            System.out.println("Min and max sum are equal to : " + (a + b));
            return;
        }
        int[] arr = {a, b, c};
        int min_pos = 0;
        int max_pos = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[min_pos] > arr[i]) {
                min_pos = i;
            }
            if (arr[max_pos] < arr[i]) {
                max_pos = i;
            }
        }
        int middle_pos = arr.length - (min_pos + max_pos);
        System.out.println("Min sub: " + (arr[min_pos] + arr[middle_pos]));
        System.out.println("Max sub: " + (arr[max_pos] + arr[middle_pos]));
    }
}
