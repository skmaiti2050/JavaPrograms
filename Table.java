import java.lang.*;
class Table
{
    public static void main(String args[])
    {
        int n,square,cube;
        n = 0;
        square = 0;
        cube = 0;
        System.out.println("Number\tSquare\tCube\t");
        System.out.println(n + "\t" + square + "\t" + cube);
        n++;
        square = n * n;
        cube = n * n * n;
        System.out.println(n + "\t" + square + "\t" + cube);
        n++;
        square = n * n;
        cube = n * n * n;
        System.out.println(n + "\t" + square + "\t" + cube);
        n++;
        square = n * n;
        cube = n * n * n;
        System.out.println(n + "\t" + square + "\t" + cube);
    }
}
