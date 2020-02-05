import java.lang.*;
import java.util.Scanner;
class ProductSales
{
    public static void main(String args[])
    {
        int choice;
		double item1 = 2.98, item2 = 4.50, item3 = 9.98, item4 = 4.49, item5 = 6.87; 
		double item1_final = 0, item2_final = 0, item3_final = 0, item4_final = 0, item5_final = 0, salesFinal = 0;

        System.out.println("\nEnter details of product sold");
		System.out.println("\nItem\tValue\n1\t$ " + item1 + "\n2\t$ " + item2 + "\n3\t$ " + item3 + "\n4\t$ " + item4 + "\n5\t$ " + item5);
        do
        {
            System.out.println("\nEnter item number from 1 to 5, 6 to display total, 0 to exit");
            Scanner s = new Scanner(System.in);
            choice = s.nextInt();
          switch(choice)
          {
              case 1:
              {
                  System.out.println("Enter number of item 1 sold");
                  int item1_quantity = s.nextInt();
                  if(item1_quantity <= 0)
					  System.out.println("Item cannot be 0 or less than 0");
                  else item1_final += item1 * item1_quantity;
                  break;
              }
              case 2:
              {
                  System.out.println("Enter number of item 2 sold");
                  int item2_quantity = s.nextInt();
                  if(item2_quantity <= 0)
					  System.out.println("Item cannot be 0 or less than 0");
                  else item2_final += item2 * item2_quantity;
                  break;
              }
              case 3:
              {
                  System.out.println("Enter number of item 3 sold");
                  int item3_quantity = s.nextInt();
                  if(item3_quantity <= 0)
					  System.out.println("Item cannot be 0 or less than 0");
                  else item3_final += item3 * item3_quantity;
                  break;
              }
              case 4:
              {
                  System.out.println("Enter number of item 4 sold");
                  int item4_quantity = s.nextInt();
                  if(item4_quantity <= 0)
					  System.out.println("Item cannot be 0 or less than 0");
                  else item4_final += item4 * item4_quantity;
                  break;
              }
			  case 5:
              {
                  System.out.println("Enter number of item 5 sold");
                  int item5_quantity = s.nextInt();
                  if(item5_quantity <= 0)
					  System.out.println("Item cannot be 0 or less than 0");
                  else item5_final += item5 * item5_quantity;
                  break;
              }
			  case 6:
			  {
				   System.out.println("\nTotal sales by the mail-order house is $" + salesFinal);
				   break;
			  }
			  case 0:
			  {
				   System.out.println("\nExiting program");
				   break;
			  }
              default: System.out.println("Invalid option");
        }
			salesFinal = (item1_final + item2_final + item3_final + item4_final);
      } while(choice != 0);
   }
}