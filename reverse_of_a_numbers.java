import java.util.Scanner;
class Reverse
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a,t=0,r;
        a=sc.nextInt();
        while(a>0)
        {
            r=a%10;
            t=t*10+r;
            a=a/10;
        }
        System.out.println(t);
    }
}