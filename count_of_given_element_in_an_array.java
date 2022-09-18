import java.util.Scanner;
class average
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a,i,x[],h,p=0;
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
       System.out.println(p);
        
    }
}