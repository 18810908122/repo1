package firstMacJava;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test2 {

    public static String classmodify(Set<?> s) {
        return "set";
    }

    public static String classmodify(List<?> s) {
        return "List";
    }

    public static String classmodify(Collection<?> s) {
        return "Collection";
    }

    public static void main(String[] args) {
        Collection<?>[] collection = {
                new HashSet<String>(),
                new ArrayList<BigDecimal>(),
                new HashMap<String, String>().values()

        };

        for (Collection<?> collection2 : collection) {
            System.out.println(classmodify(collection2));
        }

    }

}
