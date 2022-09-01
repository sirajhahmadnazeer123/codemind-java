import java.util.Scanner;
class pink
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c,d;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        d=512*2*a*b*c;
        System.out.println(d);
    }
}