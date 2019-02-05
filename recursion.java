import java.lang.*;
import java.util.ArrayList;

// i wasn't going to use helper methods but got the helpful tip from vishwaa (thankfully)
public class recursion{
    /*You may write additional private methods */

    /*Recursively find the sqrt using Newton's approximation
     *tolerance is the allowed percent error the squared answer is away from n.
     *precondition: n is non-negative
    */
    public static double sqrt(double n, double tolerance){
      // just chose 1.0 to start with
      // might change to n / 2 ?
      return sqrtHelper(n, 1.0, tolerance);
    }

    public static double sqrtHelper(double n, double guess, double tol){
      // we don't need to worry about negative numbers because it's a precondition

      // zero and one base case
      if (n == 0 || n == 1){
        return n;
      }

      // if the perecent error is fine, return the guess
      if (Math.abs(guess * guess - n) < n * tol){
        return g;
      }

      // if there is too much of a percent error, do it again
      else{
        return sqrtHelper(n, (n / guess + guess) / 2, tol);
      }
    }

    /*Recursively find the n'th fibbonaci number in linear time
     *fib(0) = 0
     *fib(1) = 1
     *fib(5) = 5
     *precondition: n is non-negative
     */
    public static int fib(int n){
      return fibHelper(n, 0, 1);
    }

    public static int fibHelper(int n, int x, int y){
      // base case zero
      if (n == 0){
        return 0;
      }

      // base case one and two
      if (n == 1 || n == 2){
        return 1;
      }

      return fibHelper(n - 1, y, y+x);
    }

    /*As Per classwork*/
    public static ArrayList<Integer> makeAllSums(int n){
      ArrayList<Integer> sum = new ArrayList<Integer>();
      makeAllSumsHelper(n, 0, sum);
      return sum;
    }

    public static void makeAllSumsHelper(int n, int current, ArrayList<Integer> sum){
      // base case
      if (n == 0){
        sum.add(current);
      }

      else{
        makeAllSumsHelper(n - 1, current, sum);
        makeAllSumsHelper(n - 1, current + n, sum);
      }
    }
}
