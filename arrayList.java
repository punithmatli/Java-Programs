import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList[] list = new ArrayList[n+1];
        int d;
        for(int i=1; i <= n;i++) {
            d = sc.nextInt();
            list[i] = new ArrayList<Integer>();
            for(int j=0;j<d;j++) {
                int temp = sc.nextInt();
                list[i].add(temp);
            }
        }
        
        int q = sc.nextInt();
        for(int i=1; i <= q;i++) {
            int l = sc.nextInt();
            int c = sc.nextInt();
            if((l <= n) && (list[l].size() >= c) && (list[l].size() != 0)) {
                System.out.println(list[l].get(c-1));
            }
            else {
                System.out.println("ERROR!");
            }
        }
    }
}
