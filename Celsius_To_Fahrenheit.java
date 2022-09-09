import java.util.Scanner;
class gopi
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        int a;
        float b;
        a=sc.nextInt();
        b=(float) (a*9)/5+32;
        System.out.format("%.2f",b);
    }
}