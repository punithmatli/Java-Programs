import java.io.*;
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = new String(sc.next());
		int count=1;
		StringBuilder sb = new StringBuilder();
		sb.append(s.charAt(0)+"");
		for(int i=1; i<s.length();i++) {
		    if(s.charAt(i) != s.charAt(i-1)) {
		        sb.append(count+""+s.charAt(i));
		        count = 1;
		    } else count++;
		}
		sb.append(count+"");
		System.out.println(sb);
	}
}
