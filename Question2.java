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
    double BMI = weight / (height * height);
    System.out.print("\nThe Body Mass Index (BMI) is " + BMI + " kg/m2");
  }
}
