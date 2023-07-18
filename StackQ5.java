package Assignment;
import java.util.*;

public class StackQ5 {
    public static int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int []nge = new int [n];
        for(int i=0;i<n;i++)nge[i] = 0;

        Stack<Integer>st = new Stack();


        for(int i = n-1; i>=0; --i){

            while(!st.empty() && temperatures[st.peek()] <= temperatures[i])
                st.pop();

            if(!st.empty())
                nge[i] = st.peek()-i;

            st.push(i);
        }
        return nge;
    }
    public static void main(String[] args){
        int []a = {60 , 45 , 34 , 65 , 38 , 79 , 80};
        System.out.println("The desired output is : ");

        int []arr = dailyTemperatures(a);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
