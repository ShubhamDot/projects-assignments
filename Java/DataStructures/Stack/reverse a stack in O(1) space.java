// the idea behind is to reverse a stack usng linkedlist which would take O(1) space


class StackNode {
    int data;
    StackNode next;
    public StackNode(int data)
    {
        this.data = data;
        this.next = null;
    }
}
 
class Stack {
    StackNode top;

    public void push(int data)
    {
        if (this.top == null) {
            top = new StackNode(data);
            return;
        }
        StackNode s = new StackNode(data);
        s.next = this.top;
        this.top = s;
    }
    public StackNode pop()
    {
        StackNode s = this.top;
        this.top = this.top.next;
        return s;
    }
 

    public void display()
    {
        StackNode s = this.top;
        while (s != null) {
            System.out.print(s.data + " ");
            s = s.next;
        }
        System.out.println();
    }
 

    public void reverse()
    {
        StackNode prev, cur, succ;
        cur = prev = this.top;
        cur = cur.next;
        prev.next = null;
        while (cur != null) {
 
            succ = cur.next;
            cur.next = prev;
            prev = cur;
            cur = succ;
        }
        this.top = prev;
    }
}
 
public class reverseStackWithoutSpace {
    public static void main(String[] args)
    {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        System.out.println("Original Stack");
        s.display();
 
        // reverse
        s.reverse();
 
        System.out.println("Reversed Stack");
        s.display();
    }
}
