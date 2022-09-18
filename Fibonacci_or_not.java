import java.util.Scanner;
class jasmine
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,a=0,b=1,c=a+b;
        n=sc.nextInt();
        if(n==0)
        {
            System.out.println("False");
        }
        else
        {
            while(c<n)
            {
                c=a+b;
                a=b;
                b=c;
            }
        }
        if(c==n)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}