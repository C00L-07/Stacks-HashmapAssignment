package Assignment;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapQ2 {
    public static void main(String[] args) {
        Map<Integer , String> mp = new HashMap<>();
        mp.put(5,"Rahul");
        mp.put(7,"Laxman");
        mp.put(1,"Ram");
        mp.put(4,"Kirrish");
        mp.put(2,"Lakshay");

        TreeMap<String, Integer> map = new TreeMap<>();

        for(var e : mp.entrySet())
        {
            map.put(e.getValue() , e.getKey());
        }

        System.out.println(map);

    }
}
