import java.util.*;
class Even
{
    public static int evendig(int n)
    {
        int i=0,f=0;
        while(n!=0)
        {
          n=n/10;
          f++;
        }
        if(f%2==0)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        int c=0;
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(evendig(a[i])==1)
            {
                c++;
            }
        }
        System.out.println(c);
    }
}