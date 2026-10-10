package Map;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo
{
    public static void main(String[] args)
    {
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>(10);

        lhs.add(1);
        lhs.add(2);
        lhs.add(3);
        lhs.add(13);
        lhs.add(5);
        lhs.add(6);
        lhs.add(7);
        lhs.add(8);
        lhs.add(9);
        lhs.add(10);
        lhs.add(11);
        lhs.add(12);

        lhs.forEach(System.out::println);
    }
}