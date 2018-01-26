package GroupIdQa;

import java.util.Scanner;

public class FindTheSameNumber {
    public static void main(String[] args) {
        int numbers = 0;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите трёхзначное число");
            numbers = scanner.nextInt();
        } while (numbers < 100 || numbers > 999);

        isTheSameNumbersPresented(numbers);
    }

    private static boolean isTheSameNumbersPresented(int numbers) {
        int b, c, d, e;


        b = numbers / 100;
        c = numbers % 100;
        d = c / 10;
        e = c % 10;

        if (b == d && d == e) {
            System.out.println("все числа одинаковые");
        } else if (b == d || d == e || b == e) {
            System.out.println("Две цифры одинаковые");
        } else
            System.out.println("Одинаковых цифр нет");

        return false;
    }

}
