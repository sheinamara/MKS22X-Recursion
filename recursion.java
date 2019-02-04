import java.lang.*;
public class recursion{
    /*You may write additional private methods */

    /*Recursively find the sqrt using Newton's approximation
     *tolerance is the allowed percent error the squared answer is away from n.
     *precondition: n is non-negative
    */
    public static double sqrt(double n, double tolerance){
      double guess = 1.0;
      double real = Math.sqrt(n);
      if (Math.abs(real - guess) / real <= tolerance){
        guess = (n / guess + guess) / 2;
      }
      if (n <= 0){
        return 0;
      }
      else{
        return guess; // negative and zero
      }
    }

    /*Recursively find the n'th fibbonaci number in linear time
     *fib(0) = 0
     *fib(1) = 1
     *fib(5) = 5
     *precondition: n is non-negative
     */
    public static int fib(int n){
      if (n == 0){
        return 0;
      }
      if (n == 1){
        return 1;
      }
      else{
        return fib(n-1) + fib(n-2);
      }
    }

    /*As Per classwork*/
    public static ArrayList<Integer> makeAllSums(int n){
      return [1,1,1];
    }

}
