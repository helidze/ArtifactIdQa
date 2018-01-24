package GroupIdQa;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class USDCurrency {
    public static void main(String[] args) {
        USDCurrency usdCurrency = new USDCurrency();
        usdCurrency.currencyConverter();

    }

    public void currencyConverter() {
        Scanner scanner = new Scanner(System.in);
        Map<String, Double> bankAndCurrency = new HashMap<>();
        bankAndCurrency.put("International Invest", 28.9500);
        bankAndCurrency.put("Universal Bank", 28.9700);
        bankAndCurrency.put("ПУМБ", 29.0000);
        bankAndCurrency.put("ПриватБанк", 28.9000);
        bankAndCurrency.put("OTPBank", 28.8500);

        double a = Collections.max(bankAndCurrency.values());
        for (Map.Entry e : bankAndCurrency.entrySet()
                ) {
            if ((double) e.getValue() >= a) {
                System.out.println(e);
            }
        }
        System.out.println("Введите сумму наличных в гривне: ");
        int cash = scanner.nextInt();

        System.out.println("Результат обмена гривны на доллары= " + cash / a + " $");
    }
}
