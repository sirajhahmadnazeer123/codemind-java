import java.util.Scanner;
class venom
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int n,b;
        n=sc.nextInt();
        b=n*(n-1)/2;
        System.out.println(b);
    }
}