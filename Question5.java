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
    for (int i=0; i < set.length; i++) {
     count[set[i]]++;
    }
    int index = count.length-1;
    int mode;
    for (int i=count.length-2; i >=0; i--) {
        if (count[i] >= count[index])
            mode = i;
    }
    System.out.print(mode);
  }
}
