package OOP.Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList1 {
    public static void main(String[] args) {

        ArrayList ob1 = new ArrayList();
        ob1.add(1);
        ob1.add("asdasdasd");
        ob1.add('c');

        for (Object arr :ob1
             ) {

            System.out.println(arr);
        }
        Iterator itr = ob1.iterator();
        while (itr.hasNext()){
            Object value = itr.next();
            System.out.println(value);

        }
    }
}
