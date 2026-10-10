package Map;

import java.util.HashMap;

public class HashmapDemo1
{
    static void main(String[] args)
    {
        HashMap<String,Integer> map = new HashMap<>();

        map.put("Adam",97);
        map.put("Adil",95);

        System.out.println(map);
    }
}