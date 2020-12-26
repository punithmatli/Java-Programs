import java.io.*;
import java.util.*;

class LinkedListNode
{
  int data;
  LinkedListNode next;
    LinkedListNode (int d)
  {
    data = d;
    next = null;
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

  LinkedListNode removeAtFirst ()
  {
    if (this == null)
      return this;
    return this.next;
  }

  LinkedListNode removeAtLast ()
  {
    if (this == null || this.next == null)
      return null;
    LinkedListNode n = this;
    while (n.next.next != null)
      {
	n = n.next;
      }
    n.next = null;
    return this;
  }

  LinkedListNode removeDups ()
  {
    if (this == null)
      return this;
    HashSet < Integer > set = new HashSet < Integer > ();
    LinkedListNode prev = this;
    LinkedListNode curr = this.next;
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
    return this;
  }
}

public class Main
{
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);
    LinkedListNode head = new LinkedListNode (1);
      head = head.addAtFirst (head, 2);
      head = head.addAtFirst (head, 3);
      head = head.addAtLast (head, 2);
      head = head.addAtLast (head, 7);
    //head = head.removeAtFirst();
    //head = head.removeAtLast();

      head = head.removeDups ();
      head.traverseList (head);
  }
}
