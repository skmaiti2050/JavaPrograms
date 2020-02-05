import java.lang.*;
import java.util.Scanner;
class BasicCalculator
{
  public static void main(String args[])
  {
      System.out.println("1: Addition\t2: Subtraction\t3: Product\t4: Division");
      Scanner s = new Scanner(System.in);
      System.out.println("Enter your choice:");
      int choice = s.nextInt();
      switch(choice)
      {
         case 1:  System.out.println("Enter 2 numbers: ");
                  Scanner a = new Scanner(System.in);
                  double n1 = a.nextDouble();
                  double n2 = a.nextDouble();
                  double add = n1 + n2;
                  System.out.println("Sum is: " + add);
                  break;

         case 2:  System.out.println("Enter 2 numbers: ");
                  Scanner b = new Scanner(System.in);
                  double n3 = b.nextDouble();
                  double n4 = b.nextDouble();
                  double sub = n3 - n4;
                  System.out.println("Subtraction is: " + sub);
                  break;

         case 3:  System.out.println("Enter 2 numbers: ");
                  Scanner p = new Scanner(System.in);
                  double n5 = p.nextDouble();
                  double n6 = p.nextDouble();
                  double prod = n5 * n6;
                  System.out.println("Product is: " + prod);
                  break;

         case 4:  System.out.println("Enter 2 numbers: ");
                  Scanner d = new Scanner(System.in);
                  double n7 = d.nextDouble();
                  double n8 = d.nextDouble();
                  double div = n7 / n8;
                  System.out.println("Division is: " + div);
                  break;
                  
         default: System.out.println("Invalid choice");
  }
 }
}
