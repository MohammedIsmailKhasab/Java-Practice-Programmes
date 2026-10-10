package Collections;

//Demo on  ArrayListwithStringType

import java.util.ArrayList;

public class ArrayListwithStringType
{
    public static void main(String[] args)
    {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");

        for(String s : list) {
            System.out.println(s);
        }
    }
}