import java.util.*;
class Sitadel
{
    static int is_prime(int n)
    {
        if(n==1)
        {
            return 0;
        }
        else
        {
            for(int i=2;i<=Math.sqrt(n);i++)
            {
                if(n%i==0)
                {
                    return 0;
                }
            }
            return 1;
        }
    }
    static int is_palindrome(int m)
    {
        int a = m;
        int s=0,b;
        while(m!=0)
        {
            b=m%10;
            s=s*10+b;
            m=m/10;
        }
        if(a==s)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
    public static void main(String asd[])
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        for(int i=n+1;i!=0;i++)
        {
            if(is_prime(i)==1)
            {
                if(is_palindrome(i)==1)
                {
                    System.out.print(i);
                    break;
                }
            }
        }
        
    }
}