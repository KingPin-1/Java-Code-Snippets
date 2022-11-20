
import java.util.*;

public class anyBaseToDecimal {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        System.out.println(anyBaseToDecimal1(n,b));
    }

    public static int anyBaseToDecimal1(int n , int b ){
        int ans = 0;
        int i = 0;
        while ( n != 0 ){
            ans += (n%10)*(int)Math.pow(b,i);
            n = n / 10;
            i++;
        }
        return ans;
    }
}
