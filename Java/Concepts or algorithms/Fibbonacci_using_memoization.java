public class Fibbonacci_using_memoization {
    // Fibonacci Series
    // using Recursion
    static int[] term = new int[1000];
    static int fib(int n)
    {
    
        // Base case
        if (n <= 1)
            return n;
        
        if(term[n] != 0){
            return term[n];
        }

        else{
            // recursive calls
            term[n] = fib(n - 1) + fib(n - 2);

            return term[n];
        }
    }
 
    public static void main(String[] args) {
        //fibonacci using memoization 
        //example of memoization
        System.out.println(fib(6));
 
    }
}
