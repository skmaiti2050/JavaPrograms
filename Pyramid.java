import java.lang.*;
import java.util.Scanner;
public class Pyramid
{
  public static void main(String args[])
  {
      System.out.println("Enter the height of pyramid");
      Scanner s = new Scanner(System.in);
      int n = s.nextInt();
       for (int i = 0; i < n; i++) {
           for (int j = 0; j < n - i; j++) {
               System.out.print(" ");
           }
           for (int k = 0; k <= i; k++) {
               System.out.print("1" + " ");
           }
           System.out.println();
       }
   }
}
