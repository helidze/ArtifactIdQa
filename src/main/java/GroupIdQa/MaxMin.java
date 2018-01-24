package GroupIdQa;

import java.util.Arrays;
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


        int[] arr = {a, b, c};
        Arrays.sort(arr);
        int minVal = arr[0] + arr[1];
        int maxVal = arr[arr.length - 2] + arr[arr.length - 1];
        System.out.println("Сумма минимальных чисел: " + minVal);
        System.out.println("Сумма максимальных чисел: " + maxVal);
    }
}
