import java.util.*;
class square
{                                                                   
    private double a,A; 
    public square(double x)
    {
        A = x;
    }
    public void cal()
    {
        a = Math.sqrt(A);
    }
    public void per()
    {
        double  P = 4 * a;
        System.out.print("Enter side of a area: " + P);
    }
}
 class a4
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side of a area: ");
        double a = sc.nextDouble();   
        square z = new square(a);
        z.cal();
        z.per();
    }
}