import java.util.*;
class prime
{
    public static boolean isprime(int n)
    {
        if(n<2)
        {
            return false;
        }
        for(int i=2;i*i<=n;i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        for(int h=1;h<=a;h++)
        {
            int b=sc.nextInt();
            int f=0;
            for(int k=1;k<b;k++)
            {
                for(int j=1;j<=k;j++)
                {
                    if(b==k*j && k!=j)
                    {
                        if(isprime(k) && isprime(j))
                        {
                            f=1;
                            break;
                        }
                    }
                }
            }
            if(f==1)
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
        }
    }
}