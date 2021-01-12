import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            long i;
            long n = sc.nextLong();
            for( i = 1; n > i; i++) {
             n = n - i;
            }
            BigInteger two = new BigInteger("2");
            BigInteger ans = ((two.pow((int)i)).add(two.pow((int)n-1))).mod(new BigInteger("1000000007"));
            System.out.println(ans);
        }
    }
}
