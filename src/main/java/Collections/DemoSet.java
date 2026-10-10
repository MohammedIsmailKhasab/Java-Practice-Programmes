package Collections;

import java.util.HashSet;
import java.util.Set;

public class DemoSet {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        set.add("a");
        set.add("b");
        set.add("c");

        System.out.println(set);
    }
}
