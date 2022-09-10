import java.util.Scanner;
class Spy
{
    public static void main(String args[])
    {
        Scanner sc =    new Scanner(System.in);
        int a,p=1,s=0,y;
        a=sc.nextInt();
        while(a>0)
        {
            y=a%10;
            p*=y;
            s+=y;
            a=a/10;
        }
        if(s==p)
        {
            System.out.println("Spy Number");
        }
        else{
            System.out.println("Not Spy Number");
        }
    }
}