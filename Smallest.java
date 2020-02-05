import java.lang.*;
import java.util.Scanner;
class Smallest
{
  public static void main(String args[])
  {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter 3 numbers:");
    int n1 = s.nextInt();
    int n2 = s.nextInt();
    int n3 = s.nextInt();
    if(n1 <= n2 && n1 <= n3)
    {
        System.out.println("Smallest number is: " +n1);
    }
    else if(n2 <= n1 && n2 < n3)
    {
        System.out.println("Smallest number is: " +n2);
    }
    else
    {
        System.out.println("Smallest number is: " +n3);
    }
  }
}
