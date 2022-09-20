import java.util.*;
class circle
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a;
        double pi=3.14;
        float b;
        a=sc.nextInt();
        b=(float)pi*a*a;
        System.out.format("%.2f",b);
    }
}