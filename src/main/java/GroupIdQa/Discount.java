package GroupIdQa;

import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        Discount discount = new Discount();
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите сумму покупки: ");
        discount.getDiscount(sc.nextDouble());
    }

    private double getDiscount(double purchase) {
        if (purchase <= 1000) {
            System.out.println("\nСумма покупки:" + purchase);
            System.out.println("\nК сожалению у вас нет скидки");
            System.out.println("\nК оплате: " + purchase);

        } else if (purchase >= 1001 && purchase <= 2000) {
            double twoPercents = purchase * 0.02;
            System.out.println("\nСумма покупки:" + purchase);
            System.out.println("\nВаша скидка составляет = " + twoPercents);
            System.out.println("\nК оплате: " + (purchase - twoPercents));
        } else if (purchase >= 2001 && purchase <= 5000) {
            System.out.println("\nСумма покупки:" + purchase);
            double fivePercents = purchase * 0.05;
            System.out.println("\nВаша скидка составляет = " + fivePercents);
            System.out.println("\nК оплате: " + (purchase - fivePercents));
        } else {
            System.out.println("\nСумма покупки:" + purchase);
            double sevenPercents = purchase * 0.07;
            System.out.println("\nВаша скидка составляет = " + sevenPercents);
            System.out.println("\nК оплате: " + (purchase - sevenPercents));
        }
        return 0;
    }

}
