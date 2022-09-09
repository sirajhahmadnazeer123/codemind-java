import java.util.Scanner;
class dope
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        int p=0;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        for(int i=a;i<=b;i++)
        {
            if(i%c==0)
            {
                p++;
            }
        }
        System.out.print(p);
    }
}