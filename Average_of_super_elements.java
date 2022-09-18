import java.util.Scanner;
class Sum
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
        y[0]=x[0];
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
         int z=0;
         int p=0;
        for(int j=0;j<l;j++)
        {
            int s=0;
            for(i=0;i<n;i++)
            {
                if(y[j]==x[i])
                {
                    s++;;
                }
            }
            if(s==y[j])
            {
                z+=y[j];
                p++;
            }
        }
        if(p==0)
        {
            System.out.print("-1");
        }
        else
        {
        float v;
        v=(float)z/p;
        System.out.format("%.2f",v);
        }
        
    }
}