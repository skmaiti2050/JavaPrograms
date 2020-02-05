import java.lang.*;
import java.util.Scanner;
class SalesCommission
{
  public static void main(String args[])
    {
        double item1 = 239.99, item2 = 129.75, item3 = 99.95, item4 = 350.89;
        System.out.println("\nItem\tValue\n1\t$ " + item1 + "\n2\t$ " + item2 + "\n3\t$ " + item3 + "\n4\t$ " + item4);
        Scanner s = new Scanner(System.in);
        System.out.println("\nEnter the number of item 1 sold");
        int item1_total = s.nextInt();
        double item1_final = item1_total * item1;
        System.out.println("\nEnter the number of item 2 sold");
        int item2_total = s.nextInt();
        double item2_final = item2_total * item2;
        System.out.println("\nEnter the number of item 3 sold");
        int item3_total = s.nextInt();
        double item3_final = item3_total * item3;
        System.out.println("\nEnter the number of item 4 sold");
        int item4_total = s.nextInt();
        double item4_final = item4_total * item4;
        double total_sales = item1_final + item2_final + item3_final + item4_final;
        System.out.println("\nTotal Sales by salesperson is $ "+ total_sales);
        double sales_final = (200 + (total_sales/100)*9);
        System.out.println("\nYou have recieved $" + sales_final);
    }
}