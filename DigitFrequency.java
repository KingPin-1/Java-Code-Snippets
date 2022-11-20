import java.util.*;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int d = scn.nextInt();
        int f = getDigitFrequency(n, d);
        System.out.println(f);
    }

    public static int getDigitFrequency(int n, int d) {
        // write code here
        int cnt = 0 ;
        while ( n != 0 ){
            int dig = n % 10 ;
            cnt = (dig == d) ? ++cnt:cnt ; // POST INCREMENT DOESN'T WORK
//            if ( dig == d){
//                cnt++;
//            }
            n = n /10;
        }
        return cnt;
    }
}
