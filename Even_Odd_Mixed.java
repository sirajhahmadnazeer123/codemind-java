import java.util.Scanner;
class mexico
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a,e=0,c=0,i,l,b=0;
        a=sc.nextInt();
        l=a;
        while(l!=0)
        {
            l/=10;
            b++;
        }
        while(a!=0)
        {
            i=a%10;
            if(i%2==0)
            {
                e++;
            }
            else
            {
                c++;
            }
            a/=10;
        }
        if(e==b)
        {
            System.out.println("Even");
        }
        else if(c==b)
        {
            System.out.println("Odd");
        }
        else
        {
            System.out.println("Mixed");
        }
        
    }
}