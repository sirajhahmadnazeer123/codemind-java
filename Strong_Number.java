import java.util.Scanner;
class strong
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a,t,i,o;
        a=sc.nextInt();
       int total=0;
        t=a;
        while(a!=0)
        {
          i=1;
          int fact=1;
            o=a%10;
            while(i<=o)
            {
                fact=fact*i;
                i++;
            }
            total=total+fact;
            a=a/10;
        }
        if(total==t)
        {
            System.out.println("The number " + t + " is a strong number");
        }
        else
        {
             System.out.println("The number " + t + " is not a strong number");
        }
    }
}