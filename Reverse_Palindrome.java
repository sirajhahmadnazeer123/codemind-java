import java.util.*;
class Palindrome
{
    public static int pal(int n)
    {
        int d=0,r;
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
        int a;
        a=sc.nextInt();
        int c=0;
        while(a>0)
        {
            c=pal(a);
            a=a+c;
            if(a==pal(a))
            {
                System.out.print(a);
                break;
            }
        }
        
    }
}