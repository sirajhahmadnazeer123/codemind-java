import java.util.Scanner;
class Perfect
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int i,f=0;
        for(i=1;i<=a;i++)
        {
            if(i*i==a)
            {
                f=1;
            }
        }
        if(f==1)
        {
            System.out.print("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}