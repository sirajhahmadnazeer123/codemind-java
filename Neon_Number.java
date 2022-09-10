import java.util.Scanner;
class Neon
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a,s=0,p,m;
        a=sc.nextInt();
        p=a*a;
        while(p>0)
        {
            m=p%10;
            s+=m;
            p=p/10;
            
        }
        if(s==a)
        {
            System.out.println("Neon Number");
        }
        else
        {
            System.out.println("Not Neon Number");
        }
    }
}