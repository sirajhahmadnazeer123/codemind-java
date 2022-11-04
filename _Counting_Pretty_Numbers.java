import java.util.Scanner;
class Pretty
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        while(a>0)
        {
            int x,y;
            x=sc.nextInt();
            y=sc.nextInt();
            int c=0;
            for(int i=x;i<=y;i++)
            {
                int r=i%10;
                if(r==2 || r==3 || r==9)
                {
                    c++;
                }
            }
            System.out.print(c);
            System.out.println();
            a--;
        }
    }
}