import java.util.Scanner;
class newrule
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a=0,b=1,c,n,i;
        c=sc.nextInt();
        System.out.format("%d %d ",a,b);
        for(i=1;i<c-1;i++)
        {
            n=a+b;
            a=b;
            b=n;
            System.out.format("%d " , n);
        }
    }
}