import java.util.Scanner;
class Found
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a,x[],h,i,p=0;
        a=sc.nextInt();
        x = new int[a];
        for(i=0;i<a;i++)
        {
            x[i]=sc.nextInt();
        }
        h=sc.nextInt();
        for(i=0;i<a;i++)
        {
            if(x[i]==h)
            {
                p+=1;
            }
        }
        if(p>=1)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}