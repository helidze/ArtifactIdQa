package GroupIdQALevel2;

import org.testng.annotations.Test;

import java.util.Scanner;

public class AllTasksInOneL2 {
    public static void main(String[] args) {

    }
    @Test
    public void getKratnoje4islo() {
        int n = 20;
        int[] arr = new int[n];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите кратное число");
        int kratnoje = scanner.nextInt();
        int i = 0;
        for (i = 0; i < n; i++) {
            arr[i] = i;
            if (arr[i] % kratnoje == 0) {
                System.out.println(arr[i]);
            }
        }

    }
    @Test
    public int getSmallestNum() {
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
