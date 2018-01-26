package GroupIdQALevel2;

import java.util.Scanner;

public class Kratnoje4islo {

    public static void main(String[] args) {
        Kratnoje4islo kratnoje4islo = new Kratnoje4islo();
        kratnoje4islo.getKratnoje4islo();
    }

    private void getKratnoje4islo() {
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


}
