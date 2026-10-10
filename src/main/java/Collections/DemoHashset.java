package Collections;

import java.util.HashSet;

public class DemoHashset {
    public static void main(String[] args) {
        HashSet<Integer> myHashSet = new HashSet<Integer>(6,0.5f);
        myHashSet.add(6);
        myHashSet.add(7);
        myHashSet.add(8);
        myHashSet.add(9);
        myHashSet.add(9);
        System.out.println(myHashSet);
    }
}