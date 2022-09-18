import java.util.Scanner;
class reverse
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a;
        a=sc.nextInt();
        int r,d=0;
        while(a!=0)
        {
            r=a%10;
            a=a/10;
            d=d*10+r;
        }
        System.out.println(d);
    }
}