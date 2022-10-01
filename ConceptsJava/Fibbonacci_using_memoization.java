public class Fibbonacci_using_memoization {
    // Fibonacci Series
    // using Recursion
    static int fib(int n)
    {
    
        // Base case
        if (n <= 1)
            return n;
    
        // recursive calls
        return fib(n - 1) + fib(n - 2);
    }
 
    public static void main(String[] args) {
        //fibonacci using memoization 
        //example of memoization
        System.out.println(fib(6));
 
    }
}
