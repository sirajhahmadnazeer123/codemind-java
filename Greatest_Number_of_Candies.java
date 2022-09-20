import java.util.*;
class Solution
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
        int b=sc.nextInt();
        int m=0;
        for(int i=0;i<n;i++)
        {
            if(m<a[i])
            {
                m=a[i];
            }
        }
        int d=m-b;
        for(int i=0;i<n;i++)
        {
            if(a[i]>=d)
            {
                System.out.printf("True ");
            }
            else
            {
                System.out.printf("False ");
            }
        }
    }
}