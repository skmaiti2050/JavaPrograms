import java.lang.*;
class GenerateRandom
{
  public static void main(String args[])
  {
    System.out.println("Random number generation from 1 to 100 to check multiple of 3");
    int x = 1 + (int)(Math.random()*((100-1) + 1));
    if(x % 3 == 0)
      System.out.println(x + " is a multiple of 3");
    else
      System.out.println(x + " is not a multiple of 3");
  }
}
