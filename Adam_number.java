import java.util.Scanner;
class adam
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a;
        a=sc.nextInt();
        int d=a*a;
        int r,l=0;
        while(a!=0)
        {
            r=a%10;
            a=a/10;
            l=l*10+r;
        }
        int f=l*l;
        int z,m=0;
        while(f!=0)
        {
            z=f%10;
            f=f/10;
            m=m*10+z;
        }
        if(m==d)
        {
            System.out.print("True");
        }
        else
        {
            System.out.print("False");
        }
    }
}