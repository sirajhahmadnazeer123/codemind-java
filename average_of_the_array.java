import java.util.Scanner;
class average
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a,i,x[],sum=0;
        float h;
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
        h=(float)sum/a;
        System.out.format("%.2f",h);
    }
}