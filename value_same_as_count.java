import java.util.*;
class birds
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,x[],i;
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        int[] p=new int[100];
        int l=0;
        p[l]=x[0];
        for(i=0;i<n;i++)
        {
            int c=0;
            for(int j=0;j<l;j++)
            {
                if(p[j]==x[i])
                {
                    c++;
                }
            }
            if(c==0)
            {
                p[l++]=x[i];
            }
        }
        int o=0;
        for(int j=0;j<l;j++)
        {
            int s=0;
            for(i=0;i<n;i++)
            {
                if(p[j]==x[i])
                {
                    s++;
                }
            }
            if(s==p[j])
            {
                o++;
            }
        }
        System.out.print(o);
    }
}