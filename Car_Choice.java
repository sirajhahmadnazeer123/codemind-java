import java.util.Scanner;
class Cars
{
    public static void main(String args[])
    {
       Scanner sc = new Scanner(System.in);
       int e,i;
       e=sc.nextInt();
       for(i=1;i<=e;i++)
       {
           
          float a,b,c,d;
          a=sc.nextFloat();
          b=sc.nextFloat();
          c=sc.nextFloat();
          d=sc.nextFloat();
          float x=c/a;
          float y=d/b;
          if(x>y)
            {
                System.out.println("1");
            }
          else if(x<y)
            {
                System.out.println("-1");
            }
          else
            {
                System.out.println("0");
            }
        }
    }
}