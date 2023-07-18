package Assignment;

import java.util.HashMap;
import java.util.TreeMap;

public class HashMapQ4 {
    public static void main(String[] args) {
        int[] arr = {4,2,7,1,9};
        TreeMap<Integer , Integer> mp = new TreeMap<>();
        for(var i : arr)
        {
            mp.put(i,1);
        }
        System.out.println(mp.lastEntry().getKey());

    }
}
