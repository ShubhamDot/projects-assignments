import java.io.*;
import java.util.*;
 

class Node {
    int data;
    Node next;
    Node(int val)
    {
        data = val;
        next = null;
    }
}
 
class GFG {
 
    
    static int frequency = 0;
 
    
 
    static Node push(Node head, int new_data)
    {
        
        Node new_node = new Node(new_data);
 
        
        new_node.next = head;
 
        
        head = new_node;
 
        return head;
    }
 
    
    static int count(Node head, int key)
    {
        if (head == null)
            return frequency;
        if (head.data == key)
            frequency++;
        return count(head.next, key);
    }
 
    
    public static void main(String args[])
    {
        
        Node head = null;
 
        head = push(head, 1);
        head = push(head, 3);
        head = push(head, 1);
        head = push(head, 2);
        head = push(head, 1);
 
        
        System.out.print("count of 1 is " + count(head, 1));
    }
}
