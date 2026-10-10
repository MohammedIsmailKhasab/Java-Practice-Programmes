package Collections;

import java.util.ArrayDeque;

public class ArrayDequeWIthIntegerType
{
    static void main(String[] args)
    {

        ArrayDeque<Integer> dq = new ArrayDeque<>();

        dq.offerLast(12);
        dq.offerLast(24);
        dq.offerLast(50);
        dq.offerLast(60);

//        dq.pollFirst();
        dq.offerFirst(1);
        dq.offerFirst(2);
        dq.offerFirst(3);
        dq.offerFirst(4);

        dq.forEach((x)->System.out.println(x));
    }
}