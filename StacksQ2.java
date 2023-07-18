package Assignment;

import java.util.Stack;

import java.util.Stack;

public class StacksQ2 {
    public static void main(String[] args) {
        String str = "3[a2[c]]";  // accaccacc
        Stack<Integer> it = new Stack<>();
        Stack<String> st = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isDigit(ch)) {
                int num = Character.getNumericValue(ch);
                it.push(num);
            } else if (ch == '[') {
                st.push("");
            } else if (ch == ']') {
                int repeat = it.pop();
                String substring = st.pop();
                StringBuilder sb = new StringBuilder();
                for (int j = 0; j < repeat; j++) {
                    sb.append(substring);
                }
                if (st.isEmpty()) {
                    st.push(sb.toString());
                } else {
                    st.push(st.pop() + sb.toString());
                }
            } else {
                if (st.isEmpty()) {
                    st.push(String.valueOf(ch));
                } else {
                    st.push(st.pop() + ch);
                }
            }
        }

        String output = st.pop();
        System.out.println(output);
    }
}
