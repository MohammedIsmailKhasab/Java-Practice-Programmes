package Collections;

import java.util.PriorityQueue;

public class PriorityQueueDemo
{
    static void main(String[] args)
    {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(29);
        pq.add(30);
        pq.add(4);
        pq.add(15);
        pq.add(22);

        System.out.println(pq.peek());

        pq.forEach((x)->System.out.println(x));
    }
}