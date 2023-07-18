package Assignment;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapQ1 {
    public static void main(String[] args) {
        Map<Integer , String> mp = new HashMap<>();
        mp.put(5,"Rahul");
        mp.put(7,"laxman");
        mp.put(1,"Ram");
        mp.put(4,"Kirrish");
        mp.put(2,"Lakshay");

        TreeMap<Integer , String> map = new TreeMap<>();

        for(var e : mp.entrySet())
        {
            map.put(e.getKey() , e.getValue());
        }

        System.out.println(map);

    }
}
