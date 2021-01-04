/*
In this lockdown a family of N members decided to play a game the rules of which are :-

All N members are made to sit uniformly in a circle (ie. from 1 to N in clockwise direction).
The game start with the person sitting at first position.
A song is played in the background. The lyrics of the song are denoted by a string which consists of only letters 'x' and 'y'. Assume that each lyric of the song is a single letter. 
If the lyric 'x' occurs in the song, the member who is currently holding the Parcel passes it on to the next member. This passing takes place in clockwise direction.
If the lyric 'y' occurs in the song, the member who is currently holding the Parcel loses his/her chances of winning the game. He/she hands over the parcel to the next member (in clockwise direction) and moves out.
The game continues until a single member survives in the end. He/she will be the winner of the game.
Note that the song repeats continuously ie. while the game is going on, if at all the song ends, the stereo system will automatically start playing the song from the start without any delay.
You have to find out the member who wins the game.



Input :

The input consists of 2 lines. The first line consists of N, the member of family in the class. The next line consists of a string denoting the lyrics of the song the teacher plays.

Output :

Print a single integer denoting the roll number of the student who wins the game.



Constraints :

2≤N≤100000

1≤|S|≤10000, where |S| denotes the length of the input string. It is guaranteed that at least 1 lyric in the song will be a 'y'



Sample Input:

3

xyx



Sample Output:

1



Explanation:

Starting from 1 lyrics : 'x' therefore he passes the ballto 2nd 

2nd turn lyrics : 'y' therefore 2nd member gets out of game and passes to 3rd

3rd turn lyrics : 'x' therefore 3rd passes ball to first.

4th turn lyrics : 'x' passes to 3rd 

5th turn lyrics: 'y' therefore gets eliminated.

Hence person sitting at position 1 won this game. 
*/

import java.io.*;
import java.util.*;
import java.lang.String;
class Main
{
	static int getWinner(int n, String s) {
		Queue<Integer> q1 = new LinkedList<Integer>();
		Queue<Integer> q2 = new LinkedList<Integer>();
		for(int i=1;i<=n;i++) {
			q1.add(i);	
		}
		
		int stringCount = 0;
		boolean first = true;
		boolean second = false;
		int slen = s.length();
		while(true) {
			if(q1.size() + q2.size() == 1) break;
			//else if(q2.size() == 1) return q2.peek();
			else if(first == true){
				stringCount = stringCount % slen;
				if(s.charAt(stringCount) == 'y') {
					q1.remove();
				}
				else if(s.charAt(stringCount) == 'x') {
					q2.add(q1.poll());
				}
				if(q1.isEmpty()) {
					first = false;
					second = true;
				}
			}
			else if(second == true) {
				stringCount = stringCount % slen;
				if(s.charAt(stringCount) == 'y') {
					q2.remove();	
				}
				else if(s.charAt(stringCount) == 'x') {
					q1.add(q2.remove());	
				}
				if(q2.isEmpty()) {
					first = true;
					second = false;
				}
			}
			stringCount++;
		}
		if(q2.isEmpty()) return q1.peek();
		else return q2.peek();
	}
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
	  int n = sc.nextInt();
	  String s = new String(sc.next());
	  System.out.println(getWinner(n, s));	
  }
}
 
