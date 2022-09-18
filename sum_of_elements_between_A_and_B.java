import java.util.Scanner;
class Sum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x[],i,n;
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        int a=sc.nextInt();
        int b=sc.nextInt();
        int l=0;
        for(i=0;i<n;i++)
        {
            if(x[i]>=a && x[i]<=b)
            {
                l+=x[i];
            }
        }
        System.out.print(l);
    }
}