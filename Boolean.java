import java.lang.*;
class Boolean
{
    public static void main(String args[])
    {
          boolean b1;
          b1 = true;
          System.out.println("Boolean Value b1: " + b1);
          b1 = 100 > 101;
          if (b1)
          {
              System.out.println("100 > 101: " + b1); //Boolean Value is True
          }
          else
          {
              System.out.println("100 > 101: " + b1); //Boolean Value is False
          }
    }
}
