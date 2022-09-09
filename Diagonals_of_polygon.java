import java.util.Scanner;
class flop
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a,b;
        a=sc.nextInt();
        b=a*(a-3)/2;
        System.out.print(b);
    }
}
