import java.util.*;
class compound
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        double a,b,c;
        double d,l,o;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        d=1+(b/100);
        l=Math.pow(d,c);
        o=(a*l);
        System.out.format("%.2f",o);
        
        
        
    }
}