package Map;

import java.util.HashMap;
import java.util.Map;

public class DemoMap {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put(1,"Ismail");
        map.put(2,"isna");
        map.put(3,"isnaa");

//        map.clear();

//        System.out.println(map.containsKey(6));//it gives boolean answer true or false
//
//        System.out.println(map.containsValue("isnaa"));//it gives boolean answer true or false
//
//        System.out.println(map);
//
//        System.out.println(map.get(3));
//
//        System.out.println(map.remove(3));
        System.out.println(map.size());
    }
}