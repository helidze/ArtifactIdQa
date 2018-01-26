package GroupIdQALevel2;

import java.util.Scanner;

public class Kratnoje4islo {

    public static void main(String[] args) {
        Kratnoje4islo kratnoje4islo = new Kratnoje4islo();
        kratnoje4islo.getKratnoje4islo();


    }
    private void getKratnoje4islo(){
        int [] arr = new int[10];
        int g = 1;
        Scanner scanner = new Scanner(System.in);
        int kratnoje = scanner.nextInt();
        for (int i = 1; i < arr.length ; i=i+13) {
            arr[i] = arr [i] + i;
            if (arr[i] % kratnoje == 0){
                g*=arr[i];
                System.out.println(g);
            }
        }

    }


}
