package Collections;

import java.util.ArrayList;

import java.util.List;


public class ArrayListWithIntegerType
{
    static void main(String[] args)
    {
        ArrayList<Integer> list1 = new ArrayList<>(20);

        ArrayList<Integer> list2 = new ArrayList<>(List.of(50,60,70,80,90));

        list1.add(10);  //[10]
        list1.add(0,5);       //[5,10]
        list1.addAll(1,list2);        //[5,50,60,70,80,90,10]
        list1.add(5,70);      //[5,50,60,70,80,70,90,10]


        list1.set(6,100);                   //[5,50,60,70,80,70,100,10]

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