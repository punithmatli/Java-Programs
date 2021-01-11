import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(), sum = 0;
        while(t-- > 0) {
            int n = sc.nextInt();
            int[][] a = new int[n][n];
            for(int i = 0; i < n; i++) {
                for(int j = 0; j < n; j++) {
                    a[i][j] = sc.nextInt();
                }
            }
            for(int k = n-1; k >= 0 ;k--) {
                sum = 0;
                for(int j = 0, i = k ; j < n && i < n; i++, j++) {
                    sum += a[j][i];
                }
                System.out.print(sum+ " ");
            }
            for(int k = 1; k < n ;k++) {
                sum = 0;
                for(int j = 0, i = k ; j < n && i < n; i++, j++) {
                    sum += a[i][j];
                }
                System.out.print(sum+ " ");
            }
        System.out.println();    
        }
    }
}
