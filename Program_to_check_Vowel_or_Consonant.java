import java.util.Scanner;
class vowel
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        {
           char p;
           int c=0;
           p=sc.nextLine().charAt(0);
           if(p=='a' || p=='A')
           {
               c=1;
           }
           else if(p=='e' || p=='E')
           {
               c=1;
           }
           else if(p=='i' || p=='I')
           {
               c=1;
           }
           else if(p=='o' || p=='O')
           {
               c=1;
           }
            else if(p=='u' || p=='U')
           {
               c=1;
           }
           if(c==1)
           {
               System.out.println("Vowel");
           }
           else
           {
               System.out.println("Consonant");
           }
        }
    }
}