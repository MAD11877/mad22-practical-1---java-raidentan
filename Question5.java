import java.util.Scanner;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    Scanner in = new Scanner(System.in);
    /**System.out.print("Enter a number: ");*/
    int number = in.nextInt();
    int a;
    int set[] = new int [number];
    for (a = 0; a < number; a++){
       for(int i=0; i<number; i++) {
         /**System.out.print("Enter an integer: ");*/
         set[i] = in.nextInt();
       }
    }
    
    double maxValue = -1.0d;
    int maxCount = 0;
    for (int i = 0; i < set.length; ++i) {
      double currentValue = set[i];
      int currentCount = 1;
      for (int j = i + 1; j < set.length; ++j) {
        if (Math.abs(set[j] - currentValue) < epsilon) {
            ++currentCount;
        } 
      }
      if (currentCount > maxCount) {
         maxCount = currentCount;
         maxValue = currentValue;
      } else if (currentCount == maxCount) {
         maxValue = Double.NaN;
      }
    }
    System.out.print(maxValue);
  }
}
