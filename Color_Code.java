import java.util.Scanner;
class Colour
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        char z;
        z=sc.nextLine().charAt(0);
         if(z=='v' || z=='V')
           {
               System.out.println("Violet");
           }
           else if(z=='I' || z=='i')
           {
               System.out.println("Indigo");
           }
           else if(z=='B' || z=='b')
           {
               System.out.println("Blue");
           }
           else if(z=='o' || z=='O')
           {
               System.out.println("Orange");
           }
            else if(z=='g' || z=='G')
           {
               System.out.println("Green");
           }
           else if(z=='y' || z=='Y')
           {
               System.out.println("Yellow");
           }
           else if(z== 'r' ||z== 'R' )
           {
               System.out.println("Red");
           }
           else{
               System.out.println("-1");
           }
    }
}