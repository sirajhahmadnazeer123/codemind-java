import java.util.Scanner;
class profile
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int l,n,i;
        l=sc.nextInt();
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            int p,s;
            p=sc.nextInt();
            s=sc.nextInt();
            if(p<l || s<l)
            {
                System.out.println("UPLOAD ANOTHER");
            }
            else if(s==p)
            {
                System.out.println("ACCEPTED");
            }
            else if(s<p || s>p)
            {
                System.out.println("CROP IT");
            }
        }
    }
}