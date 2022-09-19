import java.util.*;
class Unique
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int f=0;
        for(int i=0;i<n;i++)
        {
            int c=0;
            for(int j=0;j<n;j++)
            {
                if(i!=j)
                {
                    if(a[i]==a[j])
                    {
                        c+=1;
                    }
                }
            }
            if(c==0)
            {
                f=1;
                System.out.format("%d ",a[i]);
            }
        }
        if(f==0)
        {
            System.out.println(-1);
        }
    }
}