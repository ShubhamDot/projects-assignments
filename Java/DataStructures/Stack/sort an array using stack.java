import java.io.*;
import java.util.*;
 
class GFG
{

    static Stack<Integer> sortStack(Stack<Integer> input)
    {
        Stack<Integer> tmpStack =
                       new Stack<Integer>();
     
        while (!input.empty())
        {

            int tmp = input.peek();
            input.pop();
 
            while (!tmpStack.empty() &&
                    tmpStack.peek() < tmp)
            {

                input.push(tmpStack.peek());
                tmpStack.pop();
            }
     

            tmpStack.push(tmp);
        }
     
        return tmpStack;
    }
     
    static void sortArrayUsingStacks(int []arr,
                                     int n)
    {

        Stack<Integer> input =
                       new Stack<Integer>();
        for (int i = 0; i < n; i++)
            input.push(arr[i]);
     

        Stack<Integer> tmpStack =
                       sortStack(input);
     

        for (int i = 0; i < n; i++)
        {
            arr[i] = tmpStack.peek();
            tmpStack.pop();
        }
    }
     

    public static void main(String args[])
    {
        int []arr = {10, 5, 15, 45};
        int n = arr.length;
     
        sortArrayUsingStacks(arr, n);
     
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
}
