package Map;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo
{
    public static void main(String[] args)
        {
            LinkedHashMap<Integer,String> lhm = new LinkedHashMap<>(5,.75F,true);

            lhm.put(1,"A");
            lhm.put(2,"B");
            lhm.put(3,"C");
            lhm.put(4,"D");
            lhm.put(5,"E");
            lhm.put(6,"F");
            lhm.put(9,"G");
            String s=lhm.get(2);
            s=lhm.get(5);
            s=lhm.get(1);

            lhm.forEach((k,v)->System.out.println(k+" "+v));

        }
}