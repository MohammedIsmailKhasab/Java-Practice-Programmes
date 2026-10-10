package Collections;

import java.util.Iterator;
import java.util.Vector;

public class DemoVector {
    public static void main(String[] args) {
        Vector<String> v1 = new Vector<>();
        v1.add("apple");
        v1.add("orange");
        v1.add("pear");
        v1.add("banana");
        Iterator<String> iterator = v1.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}