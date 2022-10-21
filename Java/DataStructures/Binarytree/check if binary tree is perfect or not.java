//we are going to check wether the binary tree is perfect or not by checking the number of nodes it has
// A perfect binary tree has 2 ^ h - 1 nodes 

import java.io.*;
 
class GFG
{
   
static class newNode{
    public int key;
    public newNode right,left;
    public newNode(int k){
        this.key = k;
        this.right = this.left = null;
    }
};
 

static int getLength(newNode root){
    if(root == null)
        return 0;
    return 1 + getLength(root.left) + getLength(root.right);
}
 

static boolean isPerfect(newNode root){
    int length = getLength(root);
    return (length & (length+1))== 0;
}
 

public static void main(String args[])
{
    newNode root = new newNode(10);
    root.left = new newNode(20);
    root.right = new newNode(30);
 
    root.left.left = new newNode(40);
    root.left.right = new newNode(50);
    root.right.left = new newNode(60);
    root.right.right = new newNode(70);
 
    if (isPerfect(root))
        System.out.println("Yes");
    else
        System.out.println("No");
}
}
