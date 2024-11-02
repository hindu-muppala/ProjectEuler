import java.math.BigInteger;
import java.util.Scanner;

class euler {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print(Euler(in.nextInt()));

    }

    public static int Euler(int m) { 
        int ans=0;

        System.out.print(" io -- io");


        for (int i = m - 1; i >= 0; i++) {

            // do the euler sum
            // Euler sum
           ans+= factorialDivide(i);
        }
        return ans;
    }

    public static int factorialDivide(int n) {

        BigInteger a = new BigInteger("1");

        for (int i = 1; i < n; i++) {

            a.multiply(new BigInteger(Integer.toString(i)));

        }

        BigInteger result = new BigInteger("1");

        return result.divide(a).intValue();
    }
}