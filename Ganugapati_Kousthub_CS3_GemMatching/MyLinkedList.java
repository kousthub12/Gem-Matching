import java.util.*;
import java.io.*;
public class MyLinkedList
{
    private Node head;
    private int count;
    public MyLinkedList()
    {
        head = null;
        count = 0;
       
    }
    public void addFirst(Object obj)
    {
        Node node = new Node(obj);
        node.next = head;
        head = node;
        count++;
    }
    public void addBefore(Object obj, int index)
    {
    Node node = new Node(obj);
    if (getSize() == 0)
    {
    addFirst (obj);
    return;
    }
    if(index==0)
    {
    node.next = head;
    head = node;
    }
    else if (index > (getSize() -1))
    {
    Node lastElement = (Node)getNode(getSize()-1);
    lastElement.next = node;
    }
    else
    {
    Node elementBefore = (Node)getNode(index - 1);
    Node elementAfter = (Node)getNode(index);
    elementBefore.next = node;
    node.next = elementAfter;
    }
    count++;
   
    }
    public Object get(int ind)
    {
    Node node = (Node) getNode(ind);
    return node.data;
    }
    private Object getNode(int ind)
    {
    //System.out.println("Inside Get. The index value is: " + ind);
        if(ind < 0 || (count > 0 && ind >= count))
        {
            throw new IndexOutOfBoundsException();
        }
       
        Node currPoint = head;
        //System.out.println("Size is: " + getSize());
       // System.out.println("Head is: " + head);
        int i = 1;
        while(currPoint != null && i <= ind)
        {
            currPoint = currPoint.next;
            i++;
        }
        return currPoint;
    }
   
    public String toString()
    {
      Node currPntr = head;
      String s = "";
      while (currPntr != null)
      {
           s = s + currPntr.toString() + "\n";
           currPntr = currPntr.next;
      }
      return s;
    }
    public int getSize()
    {
        return count;
    }
   public Object removeFirst()
   {
  Node elemantRemoved = head;
  head = head.next;
  count--;
  return elemantRemoved.data;
  
 
 
 
   }
}