package Assignment;


import java.util.*;


public class StacksQ1 {
    public static int maximalRectangle(int[][] matrix) {
        if(matrix.length == 0)  return 0;
        int maxArea = 0;
        int row = matrix.length;
        int col = matrix[0].length;
        int[] arr = new int[col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[j] = matrix[i][j] == 1 ? arr[j] + 1 : 0;
            }

            maxArea = Math.max(maxArea, findMaxAreaInHistogram(arr));
        }
        return maxArea;
    }
    public static int findMaxAreaInHistogram(int[] arr){
        int len = arr.length;
        int maxArea = 0;
        int[] left = new int[len];
        int[] right = new int[len];
        Stack<Integer> stack = new Stack<>();

        for(int i=0;i<len;i++){
            if(stack.isEmpty()){
                stack.push(i);
                left[i] = 0;
            }else{
                while(!stack.isEmpty() && arr[stack.peek()] >= arr[i])
                    stack.pop();
                left[i] = stack.isEmpty() ? 0 : stack.peek()+1;
                stack.push(i);
            }
        }

        while(!stack.isEmpty())
            stack.pop();

        for(int i=len-1;i>=0;i--){
            if(stack.isEmpty()){
                stack.push(len-1);
                right[i] = len - 1;
            }else{
                while(!stack.isEmpty() && arr[stack.peek()] >= arr[i])
                    stack.pop();
                right[i] = stack.isEmpty() ? len-1 : stack.peek()-1;
                stack.push(i);
            }
        }

        int[] area = new int[len];
        for(int i=0;i<len;i++){
            area[i] = (right[i] - left[i] + 1) * arr[i];
            maxArea = Math.max(maxArea, area[i]);
        }
        return maxArea;
    }

    public static void main(String[] args){
        int[][] arr = {{0,1,1,0},
                       {0,1,0,0},
                       {0,0,0,1}};
        System.out.println("The maximum area is : " + maximalRectangle(arr));
    }
}
