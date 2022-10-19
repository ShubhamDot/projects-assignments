class LinkedList {
    Node head; 
 
    
    public void push(int new_data)
    {
        
        Node new_node = new Node(new_data);
 
        
        new_node.next = head;
 
        
        head = new_node;
    }
 
    
    public boolean search(Node head, int x)
    {
        
        if (head == null)
            return false;
 
        
        if (head.data == x)
            return true;
 
        
        return search(head.next, x);
    }
 
    
    public static void main(String args[])
    {
        
        LinkedList llist = new LinkedList();
 
        
        llist.push(10);
        llist.push(30);
        llist.push(11);
        llist.push(21);
        llist.push(14);
 
          
        if (llist.search(llist.head, 21))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
 

class Node {
    int data;
    Node next;
    Node(int d)
    {
        data = d;
        next = null;
    }
}
