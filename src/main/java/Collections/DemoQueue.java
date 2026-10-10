package Collections;

import java.util.LinkedList;
import java.util.Queue;

//Demo On Queue Interface
public class DemoQueue {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.add("Rahman");
        queue.add("Ismail");
        queue.add("Rahman1");

        System.out.println(queue.poll());

    }
}
