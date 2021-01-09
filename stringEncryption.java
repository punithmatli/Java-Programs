import java.io.*;
import java.util.*;
class Main
{
	static ArrayList recur(String s, ArrayList<Character> al, int low, int high) {
		if(low > high) return al;
		int mid = (low + high) / 2;
		al.add(s.charAt(mid));
		recur(s, al, low, mid - 1);
		recur(s, al, mid + 1, high);
		return al;	
	}
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
	int t = sc.nextInt();
	  while(t-- > 0) {
		int n = sc.nextInt();
		String s = sc.next();
		 // System.out.println(n +" "+s);
		 ArrayList<Character> al = new ArrayList<Character>();
		 al = recur(s, al, 0, n-1);
		  for(char ch : al) {
			System.out.print(ch+"");  
		  }
		  System.out.println();
	  }
  }
}
