import java.lang.Math;
    import java.util.Scanner;
    import java.util.Random;
    public class ran {   
    
    static int getran(int min, int max) {
    Random random = new Random();
    return random.nextInt(max - min) + min;
    }
    
    public static void main(String args[])   
    {   
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the range for the 2nd method :");
    int rangestart = sc.nextInt();    
    System.out.println("starting range is: " + rangestart + "\n");
    // one way to use the math function  
    System.out.println("1st method for random Number is to use Math.random(): " + Math.random() + "\n");   
      // second way to use the java.util.Random library
    System.out.println("2nd method for random Number we can us ethe random library present the in java.util.Random: \n" +"random number for your given starting range is :"+ getran(rangestart, Integer.MAX_VALUE));  
    }   
    }  
