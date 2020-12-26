import java.io.*;
import java.util.*;

public class Main
{
  LinkedListNode head;
  static class LinkedListNode
  {
    int data;
    LinkedListNode next;
      LinkedListNode (int d)
    {
      data = d;
      next = null;
    }
  }
  LinkedListNode addAtFirst (LinkedListNode head, int value)
  {
    LinkedListNode n = new LinkedListNode (value);
    //System.out.println (n.data + " " + head.data);
    n.next = head;
    return n;
  }
  int traverseList (LinkedListNode head)
  {
    if (head != null)
      {
	LinkedListNode n = head;
	while (n != null)
	  {
	    System.out.print (n.data + " ");
	    n = n.next;
	  }
      }
    return 0;
  }
  LinkedListNode addAtLast (LinkedListNode head, int value)
  {
    LinkedListNode n = new LinkedListNode (value);
    LinkedListNode temp = head;
    while (temp.next != null)
      {
	temp = temp.next;
      }
    temp.next = n;
    return head;
  }

  LinkedListNode removeAtFirst (LinkedListNode head)
  {
    if (head == null)
      return head;
    return head.next;
  }

  LinkedListNode removeAtLast (LinkedListNode head)
  {
    if (head == null || head.next == null)
      return null;
    LinkedListNode n = head;
    while (n.next.next != null)
      {
	n = n.next;
      }
    n.next = null;
    return head;
  }

  void removeDups (LinkedListNode head)
  {//This method is to remove duplicates
    if (head == null)
      return;
    HashSet < Integer > set = new HashSet < Integer > ();
    LinkedListNode prev = head;
    LinkedListNode curr = head.next;
    set.add (prev.data);
    while (curr != null)
      {
	if (set.contains (curr.data))
	  {
	    prev.next = curr.next;
	  }
	else
	  {
	    set.add (curr.data);
	    prev = prev.next;
	  }
	curr = curr.next;
      }
  }
  LinkedListNode reverseLinkedList(LinkedListNode head) {
     if(head == null || head.next == null) return head;
     LinkedListNode prev = null, curr = head, next = head;
     while(curr != null) {
         next = curr.next;
         curr.next = prev;
         prev = curr;
         curr = next;
     }
     return prev;
     }

  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);
    Main ll = new Main ();
    ll.head = new LinkedListNode (1);
     ll.head = ll.addAtFirst (ll.head, 2);
    ll.head = ll.addAtFirst (ll.head, 3);
    ll.head = ll.addAtLast (ll.head, 2);
    ll.head = ll.addAtLast (ll.head, 7);
    //ll.head = ll.removeAtFirst (ll.head);
    //ll.head = ll.removeAtLast (ll.head);
    ll.removeDups (ll.head);
    ll.head = ll.reverseLinkedList(ll.head);
    ll.traverseList (ll.head);
  }
}
