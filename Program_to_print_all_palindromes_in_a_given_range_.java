import java.util.*;
class Palindrome
{
    public static int pal(int n)
    {
        int r,d=0;
        while(n!=0)
        {
            r=n%10;
            n=n/10;
            d=d*10+r;
        }
        return d;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,i;
        a=sc.nextInt();
        b=sc.nextInt();
        for(i=a;i<=b;i++)
        {
            if(i==pal(i))
            {
                System.out.print(i+" ");
            }
        }
    }
}