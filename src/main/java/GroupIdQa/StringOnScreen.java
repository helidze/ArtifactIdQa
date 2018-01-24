package GroupIdQa;

import java.util.Scanner;

public class StringOnScreen {
    public static void main(String[] args) {
        StringOnScreen stringOnScreen = new StringOnScreen();
        stringOnScreen.getStringNTimes();
    }

    public void getStringNTimes() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите любую строку: ");
        String s = sc.next();
        System.out.print("Введите сколько раз вывести строку: ");
        int i = sc.nextInt();
        int j = 0;

        while (j != i) {
            System.out.println(s);
            j++;
        }
    }
}
