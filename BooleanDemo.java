import java.lang.*;
class BooleanDemo
{
    public static void main(String args[])
    {
          boolean b1;
          b1 = true;
          System.out.println("Boolean Value b1: " + b1);
          b1 = 2 > 3;
          if (b1)
          {
              System.out.println("2 > 3: " + b1); //Boolean Value is True
          }
          else
          {
              System.out.println("2 > 3: " + b1); //Boolean Value is False
          }
    }
}
