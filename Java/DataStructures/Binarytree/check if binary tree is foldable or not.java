class Node {
    int data;
    Node left, right;
 
    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
 
class BinaryTree {
    Node root;
 
    
    boolean isFoldable(Node node)
    {
        boolean res;
 
        
        if (node == null)
            return true;
 
       
        mirror(node.left);
 
        
        res = isStructSame(node.left, node.right);
 
        
        mirror(node.left);
 
        return res;
    }
 
    boolean isStructSame(Node a, Node b)
    {
        if (a == null && b == null)
            return true;
        if (a != null && b != null
            && isStructSame(a.left, b.left)
            && isStructSame(a.right, b.right))
            return true;
 
        return false;
    }
 
    
    void mirror(Node node)
    {
        if (node == null)
            return;
        else {
            Node temp;

            mirror(node.left);
            mirror(node.right);
 

            temp = node.left;
            node.left = node.right;
            node.right = temp;
        }
    }
 
    /* Driver program to test above functions */
    public static void main(String args[])
    {
        BinaryTree tree = new BinaryTree();
 
        
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.right.left = new Node(4);
        tree.root.left.right = new Node(5);
 
        if (tree.isFoldable(tree.root))
            System.out.println("tree is foldable");
        else
            System.out.println("Tree is not foldable");
    }
}
