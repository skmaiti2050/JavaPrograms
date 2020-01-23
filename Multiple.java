import java.lang.*;
class Multiple
{
    public static void main(String args[])
    {
        int a,b,comp;
        a = 9;
        b = 3;
        comp = a % b;
        if (comp == 0)
        {
            System.out.println(a + " is a multiple of " + b);
        }
        else
        {
            System.out.println(a + " is a not a multiple of " + b);
        }
    }
}
