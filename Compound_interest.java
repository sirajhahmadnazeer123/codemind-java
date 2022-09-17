import java.util.Scanner;
class intrest
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        double p,r,t;
        double d,s,o;
        p=sc.nextDouble();
        r=sc.nextDouble();
        t=sc.nextDouble();
        d=1+(r/100);
        s=Math.pow(d,t);
        o=(p*s);
        System.out.format("%.2f",o);
    }
}