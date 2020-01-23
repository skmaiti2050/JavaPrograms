import java.lang.*;
class Light
{
   public static void main(String args[])
   {
     int lightspeed;
     long days,seconds,distance;
     days = 1000;
     lightspeed = 186500;
     seconds =  days*24*60*60;
     distance = seconds * lightspeed;
     System.out.println("In " + days + " days light will travel " + distance + " miles");
   }
}
class CharDemo
{
    public static void main(String args[])
    {
        char ch1,ch2;
        ch1 = '%'; ch2 = 88;
        System.out.print("\nBefore incrementing character 2 ASCII value\n");
        System.out.println("1st Character: " + ch1 + "\n2nd Character: " + ch2);
        ch2++;
        System.out.print("\nAfter incrementing character 2 ASCII value\n");
        System.out.println("1st Character: " + ch1 + "\n2nd Character: " + ch2);
    }
}
