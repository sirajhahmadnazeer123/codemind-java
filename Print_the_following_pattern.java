import java.util.Scanner;
class print
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a;
        a=sc.nextInt();
        for(int i=1;i<=a;i++)
        {
            for(int j=i;j<=a;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
       
    }
}