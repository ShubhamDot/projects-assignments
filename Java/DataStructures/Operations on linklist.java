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
  
  public void delete_at_pos(Node node)
  {
    
  }
}
