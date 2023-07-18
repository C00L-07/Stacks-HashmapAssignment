package Assignment;

import java.util.Stack;

public class StacksQ3 {
    public static void main(String[] args) {
        String str = ("52CD+");
        Stack<Integer> st = new Stack<>();
        Stack<Integer> gt = new Stack<>();
        for(int i = 0; i<str.length() ; i++)
        {
            char ch = str.charAt(i);
            int ascii = ch;
            if(ascii >= 48 & ascii <= 57)
            {
                st.push(ch-48);
            }else {
                if(ch == 'C') st.pop();
                if(ch == 'D') st.push(2*st.peek());
                if(ch == '+')
                {
                    int ans = 0;
                    for(int j=0 ; j<2 ; j++)
                    {
                        gt.push(st.peek());
                        ans += st.pop();
                    }
                    while (gt.size() > 0)
                    {
                        st.push(gt.pop());
                    }
                    st.push(ans);
                }
            }
        }
        int totalSum = 0;
        while (st.size() > 0)
        {
            totalSum += st.pop();
        }
        System.out.println(totalSum);
    }
}
