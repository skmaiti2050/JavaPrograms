import java.lang.*;
import java.util.Scanner;
class RightTriangle
{
  public static void main(String args[])
  {
      double hyp = 0, side1 = 0, side2 = 0;
      Scanner s = new Scanner(System.in);
      System.out.println("Enter sides of the triangle");
      double x = s.nextDouble();
      double y = s.nextDouble();
      double z = s.nextDouble();
      if(x > y && x > z)
        {
            hyp = x;
            side1 = y;
            side2 = z;
            
        }
        else if(y > z)
        {
            hyp = y;
            side1 = x;
            side2 = z;
        }
        else
        {
            hyp = z;
            side1 = x;
            side2 = y;
        }
      if(side1 > 0 && side2> 0 && hyp > 0)
      {
          if(hyp * hyp == (side1 * side1) + (side2 * side2))
              System.out.println("The triangle is a right angled triangle");
          else System.out.println("The triangle is not a right angled triangle");
      } else System.out.println("All the sides of the triangle should be non-zero positive numbers");
  }
}
