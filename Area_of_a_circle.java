import java.util.Scanner;
class deepak
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int a;
        float c;
        a=sc.nextInt();
        c=(float)((a*a)*3.14);
        System.out.format("%.2f",c);
    }
}
