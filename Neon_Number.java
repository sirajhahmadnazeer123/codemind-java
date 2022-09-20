import java.util.*;
class neon
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a,v,temp,t=0,l;
        a=sc.nextInt();
        temp=a;
        v=a*a;
        while(v!=0)
        {
            l=v%10;
            t+=l;
            v/=10;
        }
        if(temp==t)
        {
            System.out.println("Neon Number");
        }
        else
        {
            System.out.println("Not Neon Number");
        }
        
    }
}