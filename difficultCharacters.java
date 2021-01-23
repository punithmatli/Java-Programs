import java.io.*;
import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int t= sc.nextInt();
    sc.nextLine();
    while(t-- > 0) {
    char[] ch = new char[26];
    int k=0;
    for(char c='a';c<='z';c++) ch[k++] = c;
    int[] a = new int[26];
      String st = new String(sc.nextLine());
      for(int i=0; i<st.length();i++) {
       	a[st.charAt(i)-'a']++; 
      }
      int[] newAr = Arrays.copyOf(a, 26);
      Arrays.sort(newAr);
      for(int i=0;i<26;i++) {
        for(int j=25;j>=0;j--) {
          if(newAr[i] == a[j]) {
          	System.out.print(ch[j]+" ");
            a[j] = -1;
            break;
          }
        }
      }
      System.out.println();
    }
  }
}
