package Collections;


import java.util.LinkedList;
import java.util.List;

public class LinkedListWithIntegerType
{
    static void main(String[] args)
    {
                LinkedList<Integer> list1 = new LinkedList<>();

                LinkedList<Integer> list2 = new LinkedList<>(List.of(50,60,70,80,90));

                list1.add(10);
                list1.add(0,5);
                list1.addAll(1,list2);
                list1.add(5,70);

                list1.set(6,100);

                list1.addFirst(3);
                list1.addLast(233);
                list1.pollFirst();

        System.out.println(list1);


//        System.out.println(list1.contains(25));
//        System.out.println(list1.get(2));
////        System.out.println(list1.indexOf(50));
//        System.out.println(list1.lastIndexOf(70));
//        System.out.println(list1.remove(1));
//
//        for(Integer i:list1)
//            System.out.println(i);

//        Iterator<Integer> it = list1.iterator();

    }
}