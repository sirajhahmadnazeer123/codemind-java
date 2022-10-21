import java.util.*;
class Disarium
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        int a,s=0,d=0;
        a=sc.nextInt();
        int temp=a;
        String o = Integer.toString(a);  
        int len = o.length();  
        while(temp>0)
        {
          d=temp%10;
          s+=(int)Math.pow(d,len);
          len--;
          temp=temp/10;
        }
        if(s==a)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
        
    }
}