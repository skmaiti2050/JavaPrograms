import java.lang.*;
class Currency
{
    public static void main(String args[])
    {
        double c1, c2, inr, usd;
        c1 = 70;
        c2 = 50;
        usd = c2 * 0.014;
        inr = c1  * 71.3;
        System.out.println("50 Rupees in Dollars is " + usd);
        System.out.println("70 Dollars in Indian Rupees is " + inr);
    }
}
