import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            int temp;
            int sum = (n+2) * (n+1) / 2;
            for(int i = 0; i < n; i++) {
                sum -= sc.nextInt();
            }
            System.out.println(sum);
        }
    }
}
