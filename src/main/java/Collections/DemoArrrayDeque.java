package Collections;

import java.util.ArrayDeque;

public class DemoArrrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad1 = new ArrayDeque<>();
        ad1.add(6);
        ad1.add(55);
        ad1.add(44);
        ad1.addFirst(4);
        System.out.println(ad1.getFirst());
        System.out.println(ad1.getLast());
    }
}