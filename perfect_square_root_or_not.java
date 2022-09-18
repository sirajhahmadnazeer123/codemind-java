import java.util.Scanner;
class Modulus
   {
       public static void main(String args[])
       {
           Scanner sc=new Scanner(System.in);
           int a;
           double b;
           a=sc.nextInt();
           b=Math.pow(a,1.0/2);

        if(b-(int)b>0)
        {
           System.out.println("False");
         } 
         else
        {
           System.out.println("True");
         } 
       }
   }