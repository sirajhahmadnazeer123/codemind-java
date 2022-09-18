import java.util.Scanner;
class coingame
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int p,s;
        p=sc.nextInt();
        s=sc.nextInt();
        if(p%2==0 || s%2==0)
        {
            System.out.println("Player 1");
        }
        else
        {
            System.out.println("Player 2");
        }
    }
}