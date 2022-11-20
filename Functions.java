public class Functions {

    public static int add(int a , int b ){
        return a + b ;
    }
    public static int mul(int a , int b ){
        return a * b ;
    }
    public static int square(int a ){
        return a*a ;
    }
    public static int cube(int a  ){
        return a*a*a ;
    }

    public static int power( int a , int b ){
        int res = 1;
        for ( int i = 1 ; i <= b ; i++){
            res *= a;
        }
        //return (int)Math.pow(a,b);
        return res;
    }

    public static int fact( int n ){
        int ans = 1;
        for ( int i = 1; i<= n ; i++ )
            ans *= i;
        return ans;
    }

    public static int exp1(int x){
        //4x^3 + 3x
        int res = cube(x);
        res *= 4;
        res += 3*x;
        return res;
    }

    public static int exp2(int x, int y){
        //x^2 + y^3
        int res = cube(y);
        res += square(x);
        return res;
    }

    public static void main (String[] args) {
        int a = 5 ;
        int b = 4 ;
        System.out.println("a is : " + a + " and b is : " + b);
        System.out.println("ADD: " + add(a,b) );
        System.out.println("MULTIPLICATION OF a AND b : " + mul(a,b) );
        System.out.println("SQUARE OF a  : " + square(a));
        System.out.println("CUBE OF a : " + cube(a));
        System.out.println("a RAISED TO b is : " + power(a,b));
        System.out.println("FACTORIAL OF 7 is : " + fact(7));
        System.out.println("4x^3 + 3x, where x is 5, is : " + exp1(5));
        System.out.println("x^2 + y^3, where x is 3 and y is 2, is : " + exp2(3,2));
    }

}
