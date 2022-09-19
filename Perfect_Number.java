import java.util.Scanner;
class Dio
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a,c=0,i;
        a=sc.nextInt();
        for(i=1;i<a;i++)
        {
            if (a%i==0)
            {
                c+=i;
            }
        }
        if(c==a)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}