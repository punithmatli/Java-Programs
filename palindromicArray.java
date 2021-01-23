import java.io.*;
import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while(t-- > 0) {
      boolean ans = true;
     	int n = sc.nextInt(); 
      int[] a = new int[n];
      int count = 0;
      for(int i=0;i<n;i++) {
        a[i] = sc.nextInt();
      }
      int start = 0, end=n-1, left =a[0], right = a[n-1];
      while(start < end) {
      if(left == right) {
         start++; end--;
        left = a[start]; right = a[end];
        ans = true;
      } else if(left < right) {
        count++;
        start++;  left += a[start];
      } else {
        count++;  end--;
        right+=a[end];
      }
      }
      System.out.println(count);
    }
  }
}
