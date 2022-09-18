import java.util.*;
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
        List<Integer> l=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            l.add(a[i]);
        }
        System.out.println(Collections.min(l));
    }
}