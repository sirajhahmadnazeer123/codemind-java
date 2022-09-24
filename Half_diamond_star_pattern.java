import java.util.*;
class Diamond
{
     public static void main(String []args)
     {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(); 
        int i, j;
        if (n>=3)
        {
            for (i = 0; i < n; i++)
        {
             for (j = 0; j < i + 1; j++)
                System.out.print("*");
           System.out.print("
");
        }
        for (i = 1; i < n; i++) 
        {
            for (j = i; j < n; j++)
               System.out.print("*");
          System.out.print("
");
        }
        }
        else
        {
            System.out.println("The pattern is not possible");
        }
     }
}
