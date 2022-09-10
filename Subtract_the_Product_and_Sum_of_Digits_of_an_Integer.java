import java.util.Scanner;
class Rope
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a,p=1,o=0,temp;
        a=sc.nextInt();
        while(a>0)
        {
            temp=a%10;
            p*=temp;
            o+=temp;
            a=a/10;
        }
        System.out.println(p-o);
    }
}