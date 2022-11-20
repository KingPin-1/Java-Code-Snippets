
import java.util.*;

public class anyBaseToAnyBase {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sourceBase = scn.nextInt();
        int  destBase= scn.nextInt();
        int ares = 0;
        if ( sourceBase == 10){
            ares = dectoAnyBase(n , destBase);
        }
        else{
            int res = anyBaseToDecimal(n,sourceBase);
            ares = dectoAnyBase(res,destBase);
        }
        System.out.println(ares);
    }

    public static int anyBaseToDecimal(int n , int b ){
        int ans = 0;
        int i = 0;
        while ( n != 0 ){
            ans += (n%10)*(int)Math.pow(b,i);
            n = n / 10;
            i++;
        }
        return ans;
    }

    public static int dectoAnyBase(int n , int b) {
        int ans = 0;
        int power = 1;
        while (n != 0) {
            int rem = n % b;
            ans = ans + rem*power;
            n = n / b;
            power  *= 10;
        }
        return ans;
    }

}
