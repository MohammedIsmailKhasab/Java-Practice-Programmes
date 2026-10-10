package Collections;

import java.util.HashSet;

public class HashsetDemo
{
    public static void main(String[] args)
        {
        HashSet<Integer> hs = new HashSet<Integer>();

        hs.add(10);
        hs.add(20);
        hs.add(30);
        hs.add(10);

        System.out.println(hs);

        }
}