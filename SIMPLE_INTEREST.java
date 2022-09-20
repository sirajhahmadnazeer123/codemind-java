import java.util.*;
class simple
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner (System.in);
        int p,t,r;
        int l;
        p=sc.nextInt();
        t=sc.nextInt();
        r=sc.nextInt();
        l=p*t*r/100;
        System.out.println(l);
    }
}