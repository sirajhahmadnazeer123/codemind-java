import java.util.Scanner;
class Hydra
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a,v,temp,m=1,s=0;
        a=sc.nextInt();
        while(a!=0)
        {
            v=a%10;
            m*=v;
            s+=v;
            a=a/10;
            
        }
        if(m==s)
        {
            System.out.println("Spy Number");
        }
        else
        {
            System.out.println("Not Spy Number");
        }
        
    }
}