import java.util.Scanner;
class average
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a,i,x[],sum=0;
        int h;
        a=sc.nextInt();
        x = new int[a];
        for(i=0;i<a;i++)
        {
            x[i]=sc.nextInt();
        }
        for(int ele:x)
        {
            sum+=ele;
        }
        h=sum/a;
        int n=0;
        for(i=0;i<a;i++)
        {
            if(x[i]>=h)
            {
                n++;
            }
        }
        System.out.println(n);
    }
}