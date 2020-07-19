package firstMacJava;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListTest {

    public static void main(String[] args) {

        List<String> c2 = new ArrayList<>();

        c2.add("abc1");
        c2.add("abc2");
        c2.add("abc3");
        c2.add("java");
        Iterator it = c2.iterator();

        while (it.hasNext()) {
            Object object = (Object) it.next();

        }

    }
}