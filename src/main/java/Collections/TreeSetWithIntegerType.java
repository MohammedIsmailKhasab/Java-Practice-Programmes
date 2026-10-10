package Collections;

import java.util.List;
import java.util.TreeSet;

public class TreeSetWithIntegerType
{
    public static void main(String[] args)
    {
        TreeSet<Integer> ts = new TreeSet<>(List.of(10,20,50,70,20));

        ts.add(15);
        ts.addAll(List.of(10,20,50,70,20));

        System.out.println(ts.ceiling(55));
        System.out.println(ts);
    }
}
