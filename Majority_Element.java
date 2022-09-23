import java.util.*;
class Majority
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
        int max=0;
        int c=0,res=0;
        for(int i=0;i<n;i++)
        {
            c=0;
            for(int j=0;j<n;j++)
            {
                if(a[i]==a[j])
                {
                    c++;
                }
            }
           if(c>max)
           {
               res=a[i];
               max=c;
           }
           else if(max==c )
           {
               if(res>a[i])
               {
                   res=a[i];
               }
           }
        }
        System.out.println(res);
    }
}