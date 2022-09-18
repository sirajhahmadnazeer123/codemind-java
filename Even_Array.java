import java.util.Scanner;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int c=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]%2==0)
            {
                c++;
            }
        }
        if(c==n)
        {
            System.out.println("True");
        }
        else
        {
             System.out.println("False");
        }
    }
}