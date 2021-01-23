import java.io.*;
import java.util.*;
import java.math.*;

public class LCS{
    static int getLcs(String s1, String s2, int x, int y) {
        if(x==0 || y==0) return 0;
        else if(s1.charAt(x-1) == s2.charAt(y-1)) {
            return getLcs(s1, s2, x-1,y-1) + 1;
        }
        else {
            return Integer.max(getLcs(s1,s2,x-1,y), getLcs(s1,s2,x,y-1));
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s1= new String(sc.nextLine());
        String s2= new String(sc.nextLine());
        System.out.println(getLcs(s1, s2,s1.length(),s2.length()));
    }
}
