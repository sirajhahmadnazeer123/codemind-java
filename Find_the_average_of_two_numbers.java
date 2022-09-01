import java.util.Scanner;
class Triangle
{
 public static void main(String args[])
    { 
     Scanner sc=new Scanner(System.in);
        int a,b;
        float s;
        a=sc.nextInt();
        b=sc.nextInt();
        s=(float)(a+b)/2;
        System.out.format("%.4f",s);
 }
}