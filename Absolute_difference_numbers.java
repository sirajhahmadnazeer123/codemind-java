import java.util.*;
class Abs
{
    public static int rev(int n)
    {
        int k=0,s=0,g=0;
        for(int i=0;i<n;i++)
        {
            k=n%10;
            s=s*10+k;
            n=n/10;
        }
        return s;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int k=0,s=0,g=0;
        for(int i=m;i>0;i--)
        {
            k=n%10;
            s=s*10+k;
            n=n/10;
        }
        int f=0;
        for(int i=m;i>0;i--)
        {
            int pow=(int)Math.pow(10,(int)Math.log10(n));
            f=n/pow;
            g=g*10+f;
            n=n%pow;
        }
        System.out.print(Math.abs(g-rev(s)));
    }
}