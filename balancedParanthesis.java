import java.io.*;
import java.util.Scanner;
import java.util.Stack;
class Main
{
  static boolean isBalanced(String s) {
    Stack<Character> st = new Stack<>();
    for(int i = 0; i < s.length();i++) {
     	switch(s.charAt(i)) {
          case '}': if(st.peek() != '{') return false; else st.pop(); break;
          case ']': if(st.peek() != '[') return false; else st.pop();  break;
          case ')': if(st.peek() != '(') return false; else st.pop();  break;
          default : st.push(s.charAt(i)); break;
        }
    }
    return st.isEmpty();
  }
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    System.out.println(isBalanced(s) ? "Balanced" : "Not Balanced");
  }
}
