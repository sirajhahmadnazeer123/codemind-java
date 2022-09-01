import java.util.Scanner;
class goat
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a;
        float b;
        a=sc.nextInt();
        b=(float)(32+(a*(1.8)));
        System.out.format("%.2f",b);
        
    }
}