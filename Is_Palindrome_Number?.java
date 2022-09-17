import java.util.Scanner;
class Palindrome
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int r,d=0;
        int n=a;
        while(n!=0)
        {
            r=n%10;
            n=n/10;
            d=d*10+r;
        }
        if(d==a)
        {
            System.out.println("2");
        }
        else
        {
            System.out.println("1");
        }
    }
}