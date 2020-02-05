import java.lang.*;
import java.util.Scanner;
class BMI
{
  public static void main(String args[])
  {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter height in centimeters");
        double height = s.nextDouble();
        System.out.println("Enter weight in kilograms");
        double weight = s.nextDouble();
        if(height > 0 && weight > 0)
        {
            double bmi = (weight/height/height)*10000;
            if(bmi < 18.5)
            System.out.println("Underweight");
            else if (bmi >= 18.5 && bmi < 25)
            System.out.println("Normal weight");
            else if (bmi >= 25 && bmi < 30)
            System.out.println("Overweight");
            else System.out.println("Obesity");
        } else System.out.println("Are you a human? :p");
    }
}
