class GFG
{
static class node
{
    int key;
    int count;
    node left, right;
};
 

static node newNode(int item)
{
    node temp = new node();
    temp.key = item;
    temp.left = temp.right = null;
    temp.count = 1;
    return temp;
}

static void inorder(node root)
{
    if (root != null)
    {
        inorder(root.left);
        System.out.print(root.key + "(" +
                         root.count + ") ");
        inorder(root.right);
    }
}
 

static node insert(node, int key)
{

    if (node == null) return newNode(key);

    if (key == node.key)
    {
    (node.count)++;
        return node;
    }
 

    if (key < node.key)
        node.left = insert(node.left, key);
    else
        node.right = insert(node.right, key);

    return node;
}
 

static node minValueNode(node node)
{
    node current = node;

    while (current.left != null)
        current = current.left;
 
    return current;
}
 

static node deleteNode(node root, int key)
{
    // base case
    if (root == null) return root;
 

    if (key < root.key)
        root.left = deleteNode(root.left, key);
 

    else if (key > root.key)
        root.right = deleteNode(root.right, key);
 

    else
    {

        if (root.count > 1)
        {
            (root.count)--;
            return root;
        }
 

        if (root.left == null)
        {
            node temp = root.right;
            root=null;
            return temp;
        }
        else if (root.right == null)
        {
            node temp = root.left;
            root = null;
            return temp;
        }
 

        node temp = minValueNode(root.right);
 

        root.key = temp.key;
        root.count = temp.count;

        root.right = deleteNode(root.right,
                                temp.key);
    }
    return root;
}
 

public static void main(String[] args)
{

    node root = null;
    root = insert(root, 12);
    root = insert(root, 10);
    root = insert(root, 20);
    root = insert(root, 9);
    root = insert(root, 11);
    root = insert(root, 10);
    root = insert(root, 12);
    root = insert(root, 12);
 
    System.out.print("Inorder traversal of " +
                     "the given tree " + "\n");
    inorder(root);
 
    System.out.print("\nDelete 20\n");
    root = deleteNode(root, 20);
    System.out.print("Inorder traversal of " +
                     "the modified tree \n");
    inorder(root);
 
    System.out.print("\nDelete 12\n");
    root = deleteNode(root, 12);
    System.out.print("Inorder traversal of " +
                     "the modified tree \n");
    inorder(root);
 
    System.out.print("\nDelete 9\n");
    root = deleteNode(root, 9);
    System.out.print("Inorder traversal of " +
                     "the modified tree \n");
    inorder(root);
}
}
