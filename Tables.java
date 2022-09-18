import java.util.Scanner;
class pinkvenom
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,i,b,c;
        a=sc.nextInt();
        b=sc.nextInt();
        for(i=1;i<=b;i++)
        {
            if(i%2==0)
            {
                continue;
            }
            else
            {
               c=a*i;
               System.out.println(a+" x "+i+" = "+c);
            }
        }
    }
}