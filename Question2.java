import java.util.Scanner;

public class Question2
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    System.out.print("Input height in meters: ");
    double height = in.nextDouble();
    System.out.print("\nInput weight in kilogram: ");
    double weight = in.nextDouble();
    System.out.print("\nYour height is " + height + " m");
    System.out.print("\nYour weight is " + weight + " kg");
  }
}
