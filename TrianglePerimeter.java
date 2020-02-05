import java.lang.*;
import java.util.Scanner;
class TrianglePerimeter
{
  public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter value of sides of the triangle");
        double a = s.nextDouble();
        double b = s.nextDouble();
        double c = s.nextDouble();
        double perimeter = 0;
        perimeter = a + b + c;
		if(a <= 0 || b <= 0 || c <= 0)
			System.out.println("Sides of the triangle cannot be zero");
		else if(a+b>c && b+c>a && a+c>b)
			System.out.println("Perimeter of triangle: " + perimeter + " units");
		else System.out.println("Sides of the triangle are invalid");
    }
}