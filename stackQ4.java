package Assignment;

import java.util.*;

public class stackQ4 {
    public static void main(String[] args) {
        int[] arr = {5,10,-5};
        //+ve move right side  && -ve move left side
        // the higher number remove the lower number && if equal both remove
        int n = arr.length;

        Stack<Integer> st = new Stack<>();
        for(int i=0 ; i<n ;i++)
        {
            if(arr[i] < 0)
            {
                st.push(Math.abs(arr[i]));
                if(arr[i-1] < st.peek())
                {
                    arr[i-1] = st.peek();
                }else if(arr[i-1] == st.peek())
                {
                    arr[i-1] = 0;
                    arr[i] =  0;
                    st.pop();
                }
                else{
                    st.pop();
                }
                arr[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
