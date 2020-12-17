import java.io.*;
import java.util.Scanner;

public class MyClass {
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] memo = new int[n+1];
      System.out.println(fib(n, memo));
    }
    
    static int fib(int n, int[] memo) {
        if(n==0 || n==1) return n;
        else if(memo[n] == 0) {
            memo[n] = fib(n-1,memo) + fib(n-2,memo);
        }
        return memo[n];
    }
}
