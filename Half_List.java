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
        for(int i=n-1;i>(n/2)-1;i--)
        {
            System.out.format("%d ",a[i]);
        }
        for(int i=0;i<n/2;i++)
        {
            System.out.format("%d ",a[i]);
        }
    }
}