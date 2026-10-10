package Map;

import java.util.*;
public class Hashing
{
    public static void main(String[] args)
    {
        //country(key),population(value)
        HashMap<String, Integer> map = new HashMap<>();

        //Insertion
        map.put("India", 120);
        map.put("US", 30);
        map.put("China", 150);

        System.out.println(map);

        map.put("China", 180);
        System.out.println(map);

//        //Search
//        if(map.containsKey("China"))
//        {
//            System.out.println("key is present in the map");
//        }
//        else
//        {
//            System.out.println("key is not present in the map");
//        }
            //get method
//        System.out.println(map.get("China")); //key exists
//        System.out.println(map.get("Indonesia")); //key doesn't exist
        //for loop and for each
//        int arr[] = {12, 15, 30};
//        for(int i = 0; i < 3; i++)
//        {
//            System.out.print(arr[i]+ " ");
//        }
//        System.out.println();
//
//        for(int val: arr)
//        {
//            System.out.print(val+ " ");
//        }
//        System.out.println();
        //Iteration Using Hashmap
//        for ( Map.Entry<String, Integer> e : map.entrySet() )
//        {
//            System.out.println(e.getKey());
//            System.out.println(e.getValue());
//        }
        //remove method        map.remove("China");
        System.out.println(map);

    }
}