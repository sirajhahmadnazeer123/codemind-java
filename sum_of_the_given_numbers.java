import java.util.Scanner;
class blankspace
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a,i;
        a=sc.nextInt();
        for(i=1;i<=a;i++)
        {
          int b,c;
          b=sc.nextInt(); 
          c=sc.nextInt();
          System.out.println(b+c);
        }
    }
}
