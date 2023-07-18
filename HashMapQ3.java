package Assignment;

import java.util.HashMap;
import java.util.Map;

public class HashMapQ3 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        Map<Integer , Integer> mp = new HashMap<>();
        for(var i : arr)
        {
            if(!mp.containsKey(i))
            {
                mp.put(i,1);
            }else{
                mp.put(i,mp.get(i)+1);
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");
    }
}
