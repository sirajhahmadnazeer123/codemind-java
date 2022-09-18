import java.util.Scanner;
class cindrella
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,c=0;
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                c++;
            }
        }
        if(c<=2)
        {
            System.out.println("prime");
        }
        else
        {
            System.out.println("not a prime");
        }
    }
}