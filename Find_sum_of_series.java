import java.util.Scanner;
class series
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        int a;
        float sum=0;
        a=sc.nextInt();
        for(float i=1;i<=a;i++)
        {
            sum=sum+(1/i);
        }
        System.out.format("%.2f",sum);
    }
}