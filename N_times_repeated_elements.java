import java.util.*;
class Sample
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
        int[] y=new int[100];
        int l=0;
        y[l]=x[0];
        for(i=0;i<n;i++)
        {
            int c=0;
            for(int j=0;j<l;j++)
            {
                if(y[j]==x[i])
                {
                    c++;
                }
            }
            if(c==0)
            {
                y[l++]=x[i];
            }
        }
        int k=sc.nextInt();
        int h=0;
        for(int j=0;j<l;j++)
        {
            int s=0;
            for(i=0;i<n;i++)
            {
                if(y[j]==x[i])
                {
                    s++;
                }
            }
            if(s==k)
            {
                System.out.print(y[j]+" ");
                h++;
            }
        }
        if(h==0)
        {
            System.out.print("-1");
        }
       
    }
}