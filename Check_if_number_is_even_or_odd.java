import java.util.Scanner;
class number
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int d;
        d=sc.nextInt();
        if(d%2==0)
        {
            System.out.println("Even");
        }
        else
        {
         System.out.println("Odd");   
        }
    }
}