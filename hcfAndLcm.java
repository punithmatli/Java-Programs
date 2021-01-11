import java.io.*;
import java.util.*;

public class Solution {
    static long gcd(long a, long b){
        if(b==0) return a;
        return gcd(b, a%b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            long a = sc.nextInt();
            long b = sc.nextInt();
            long hcf = 0;
            if(a > b) hcf = gcd(a,b);
            else hcf = gcd(b,a);

            System.out.println((a * b)/hcf +" "+hcf);
        }
    }
}
