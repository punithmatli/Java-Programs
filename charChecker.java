import java.io.*;
import java.util.*;
//import java.lang.*;
//import java.math.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = new String(sc.next());
		int[] arr = new int[10];
		for(int i=0; i<s.length();i++) {
		    if(s.charAt(i) >= '1' && s.charAt(i) <= '9') {
		        arr[s.charAt(i) - '0']++;
		    }
		}
		boolean found = true;
		for(int i = 1;i < arr.length;i++) {
		    if(arr[i] == 0) {
		        found = false;
		        break;
		    }
		}
		if(found == false) System.out.println("No");
		else System.out.println("Yes");
	}
}
