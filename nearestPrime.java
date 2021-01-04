import java.io.*;
import java.util.*;
class Main
{
  static boolean isPrime(int n) {
    for(int i = 2; i < n;i++) {
		if(n%i == 0) return false;
    }
    return true;
  }
  static int getPrime(int n) {
    if(isPrime(n)) return n;
    for(int i = 1; i < 10000; i++) {
       if(isPrime(n-i)) return n-i;
       if(isPrime(n+i)) return n+i;
    }
    return 0;
  }
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while(t-- > 0) {
      int n = sc.nextInt();
      System.out.println(getPrime(n));
    }
  }
}
