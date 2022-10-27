import java.util.Scanner;
class Pattern
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int i,j;
        for(i=1;i<=a;i++)
        {
            for(j=1;j<=a;j++)
            {
                if(i==j ||(i==a+1-j) )
                {
                    System.out.print(a-i+1+" ");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}