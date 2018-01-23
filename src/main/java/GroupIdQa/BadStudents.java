package GroupIdQa;


import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

public class BadStudents {
    public static void main(String[] args) {
        getBadStudents();
    }

    public static void getBadStudents() {


        Map<String, Integer> results = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            int random = ThreadLocalRandom.current().nextInt(1, 5);
            results.put("student" + i, random);
        }
        for (Map.Entry e : results.entrySet()
                ) {
            if ((int) e.getValue() <= 2) {
                System.out.println(e);
            }
        }

    }
}
