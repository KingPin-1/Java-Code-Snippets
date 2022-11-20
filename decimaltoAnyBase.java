import java.util.*;

public class decimaltoAnyBase {
    public static void main(String[] args) {
//        System.out.println("Hello World!!");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        System.out.println(dectoAnyBase(n , b));
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