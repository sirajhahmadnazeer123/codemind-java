import java.util.Scanner;
class largestdigit
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,s=0,r;
        a=sc.nextInt();
        while(a!=0)
        {
            r=a%10;
            if(s<r)
            {
                s=r;
            }
            a=a/10;
        }
        System.out.print(s);
    }
}