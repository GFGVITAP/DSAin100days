import javax.naming.LinkRef;

import org.w3c.dom.Node;

public class linkedlist {
    public static void main(String[] args) {
        LinkedList ll= new LinkedList();
        //addding elements in the linkedlist
        ll.addfirst(2);
        ll.addfirst(1);
        //the time complexity of adding an element takes a time complexity of O(1); constant time complexity
        ll.addlast(3);
        ll.addlast(4);
        //the complexity of this code is also O(1).

        
    }
    
}
class LinkedList{
    public static class Node{
    int data;
    Node next;
    public Node(int data){
        this.data= data;
        this.next= null;
    }
  }
  public static Node head;
  public static Node tail;

  //adding nodes in linkedlist from the head side
  public  void addfirst(int data){
    //step1:create a new node
    Node n1= new Node(data);
     if(head == null){// this means if the linkedlist is empty
        head= tail= n1;
        return;
    }
    //step2: point the next of the created node to head
    n1.next= head;//here we are creating a link
    //step3: change head = new node
    head = n1;

  }
  //adding elemnets from the tail side of the linkedlist
  public void addlast(int data){
    //step1: create a new node
    Node n2= new Node(data);
    //we have a special case where the linkedlise is empty
    if(head==null){
        head = tail =n2;
        return;
    }
    //step2: point the nest of the tail to the new node
    tail.next= n2;
    //step3: make the new node as tail
    tail = n2;
    
  }

}