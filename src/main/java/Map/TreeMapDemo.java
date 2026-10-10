package Map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo
{
    public static void main(String[] args)
    {
        TreeMap<Integer,String> tm = new TreeMap<>(Map.of(0,"Rahman",1,"Abdullah",2,"Shafi",3,"nadeem"));

        tm.put(4,"Rahman1");
        tm.put(5,"Abdullah2");

        Map.Entry<Integer,String> e = tm.firstEntry();

        System.out.println(e.getKey()+" "+e.getValue());

//        System.out.println(tm.get(4));
//        System.out.println(tm.ceilingEntry(5).getValue());
        System.out.println(tm);
    }
}