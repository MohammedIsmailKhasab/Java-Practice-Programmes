package Collections;


//Demo On LinkedList
import java.util.LinkedList;

public class DemoLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<Integer>();
        LinkedList<Integer> l2 = new LinkedList<Integer>();
        l2.add(15);
        l2.add(20);
        l2.add(30);

        l1.add(6);
        l1.add(5);
        l1.add(4);
        l1.add(3);
        l1.add(2);
        l1.add(0,5);
        l1.add(0,1);
        l1.addAll(0, l2);
        l1.addFirst(99);
        for(int i = 0;i < l1.size(); i++){
            System.out.println(l1.get(i));
        }
    }
}