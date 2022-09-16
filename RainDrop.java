import  java.util.Scanner;
class Raindrop
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a;
        a=sc.nextInt();
        if(a%3==0 && a%5==0 && a%7==0)
        {
            System.out.print("PlingPlangPlong");
        }
        else if (a%5==0 && a%3==0 && a%7!=0)
        {
            System.out.print("PlingPlang");
        }
        else if(a%3!=0 && a%5==0 && a%7==0)
        {
            System.out.print("PlangPlong");
        }
        else if(a%3==0 && a%5!=0 && a%7==0)
        {
            System.out.print("PlingPlong");
        }
        else
        {
            if(a%3==0)
            {
                System.out.print("Pling");
            }
            else if(a%5==0)
            {
                System.out.print("Plang");
            }
            else if (a%7==0)
            {
                System.out.print("Plong");
            }
            else
            {
                System.out.print(a);
            }
        }
    }
}