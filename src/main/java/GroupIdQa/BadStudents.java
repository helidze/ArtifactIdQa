package GroupIdQa;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class BadStudents {
    public static void main(String[] args) {
        getBadStudents();
    }

    public static void getBadStudents(){
        Map<String,Integer> results = new HashMap<>();
        results.put("Петров",5);
        results.put("Иванов",4);
        results.put("Сидоров",2);
        results.put("Васильев",1);
        results.put("Петров.A",3);
        results.put("Петров.B",4);
        results.put("Петров.C",1);
        results.put("Петров.D",2);

        for (Map.Entry e: results.entrySet()
             ) {
            if ((int) e.getValue() <= 2){
                System.out.println(e);
            }
        }

    }
}
