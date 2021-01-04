import java.util.*;
import java.io.*;

class Main
{
  static boolean anag(char[] a, char[] b) {
    if(a.length != b.length) return false;
    Arrays.sort(a);
    Arrays.sort(b);
    
    for(int i = 0; i < a.length;i++) {
      if(a[i] != b[i]) return false;
    }
        return true;
  }
  public static void main(String args[])
  {
    boolean found = true;
    Scanner sc = new Scanner(System.in);
    String s1 = new String(sc.next());
    char[] a = s1.toCharArray();
    
    String s2 = new String(sc.next());
    char[] b = s2.toCharArray();
    
    if(anag(a,b)) {
      System.out.println("Anagram");
    } else System.out.println("Not anagrams");
    
  }
}
