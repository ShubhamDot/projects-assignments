class LinkedList
{
    Node head;  // head of list
 
    
    class Node
    {
        int data;
        Node next;
          
        
        Node(int d) {data = d; next = null; }
    }
  
  //Inserting at beg
  public void Insert_at_beg(int new_data)
  {
      
      Node new_node = new Node(new_data);

      
      new_node.next = head;

      
      head = new_node;
  }
  
  //Inserting after a specific given node
  public void insertAfter(Node prev_node, int new_data)
  {
      
      if (prev_node == null) {
          System.out.println(
              "The given previous node cannot be null");
          return;
      }

      
      Node new_node = new Node(new_data);

      
      new_node.next = prev_node.next;

      
      prev_node.next = new_node;
  }
  
  //inserting a node at the end of a specific node
  public void Insert_at_end(int new_data)
  {
      Node new_node = new Node(new_data);

      
      if (head == null)
      {
          head = new Node(new_data);
          return;
      }

      
      new_node.next = null;

      
      Node last = head;
      while (last.next != null)
          last = last.next;

      
      last.next = new_node;
      return;
  }
  
  public void delete_at_beg()
  {
    Node temp = new Node();
    temp = head;
    head = head.next;
  }  
  
   //delete at a spefic given key
  public void delete_at_pos(int key)
    {
        Node temp = head, prev = null;
 
        
        if (temp != null && temp.data == key) {
            head = temp.next; // Changed head
            return;
        }
 
        
        while (temp != null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }
 
        
        if (temp == null)
            return;
 
        
        prev.next = temp.next;
    }
    
    //deleting node at the end of the linklist
    public void delete_at_end()
    {
        Node end = head;
        while(end.next != NULL)
        {
            end = end.next;
        }
        
        end.next = NULL;
    }
}
