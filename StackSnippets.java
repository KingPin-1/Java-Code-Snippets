import java.util.*;

public class StackSnippets {
    public static void fun(){
        int[] a = {8,1,3,5,12,5,14,6,7,9};
        int[] ans = ngr(a);
        System.out.println("Next Greater Right : " + Arrays.toString(ans));
        ans = nsr(a);
        System.out.println("Next Smaller Right : " + Arrays.toString(ans));
        ans = ngl(a);
        System.out.println("Next Greater Left : " + Arrays.toString(ans));
        ans = nsl(a);
        System.out.println("Next Smaller Left : " + Arrays.toString(ans));

    }

    public static int[] ngr(int[] arr){
        //Next Greater Element to the right
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        st.push(0);
        int[] ans = new int[n];
        for( int i = 1 ; i < n ; i++ ){
            while( !st.isEmpty() && arr[st.peek()] < arr[i] ){
                int idx = st.pop();
                ans[idx] = arr[i];
            }
            st.push(i);
        }
        while( !st.isEmpty() ){
            ans[st.pop()] = -1;
        }

        return ans;
    }

    public static int[] nsr(int[] arr){
        //Next Greater Element to the right
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        st.push(0);
        int[] ans = new int[n];
        for( int i = 1 ; i < n ; i++ ){
            while( !st.isEmpty() && arr[st.peek()] > arr[i] ){
                int idx = st.pop();
                ans[idx] = arr[i];
            }
            st.push(i);
        }
        while( !st.isEmpty() ){
            ans[st.pop()] = -1;
        }

        return ans;
    }

    public static int[] ngl(int[] arr){
        //Next Greater Element to the right
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        st.push(n-1);
        int[] ans = new int[n];
        for( int i = n-1 ; i >= 0 ; i-- ){
            while( !st.isEmpty() && arr[st.peek()] < arr[i] ){
                int idx = st.pop();
                ans[idx] = arr[i];
            }
            st.push(i);
        }
        while( !st.isEmpty() ){
            ans[st.pop()] = -1;
        }

        return ans;
    }

    public static int[] nsl(int[] arr){
        //Next Greater Element to the right
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        st.push(n-1);
        int[] ans = new int[n];
        for( int i = n-1 ; i >= 0 ; i-- ){
            while( !st.isEmpty() && arr[st.peek()] > arr[i] ){
                int idx = st.pop();
                ans[idx] = arr[i];
            }
            st.push(i);
        }
        while( !st.isEmpty() ){
            ans[st.pop()] = -1;
        }

        return ans;
    }

    public static void main(String[] args) {
        fun();
    }
}
