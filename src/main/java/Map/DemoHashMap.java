package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class DemoHashMap {
    public static void main(String[] args) {
        HashMap hm = new HashMap();
        hm.put(1,"Ismail");
        hm.put(2,"isna");
        hm.put(3,"isnaa");
        hm.put(4,"isna2");
        hm.put(null,"aaa");
        System.out.println(hm);

        Set set = hm.entrySet();
        System.out.println(set);

        Iterator itr = set.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}