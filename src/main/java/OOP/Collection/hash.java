package OOP.Collection;

import java.util.HashSet;

public class hash {
    public static void main(String[] args) {
        HashSet<String> values = new HashSet<>();
        values.add("0String");
        values.add("1String");
        values.add("2String");
        values.add("3String");
        values.add("4String");

        for (String s : values
                ) {
            System.out.println(s);
        }


    }
}
