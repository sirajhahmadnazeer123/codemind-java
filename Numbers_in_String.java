import java.util.Scanner;
class Sum
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String a=sc.nextLine();
        int c=0;
        for(int i=0;i<a.length();i++)
        {
            if(Character.isDigit(a.charAt(i))) 
            {
                c=c+Character.getNumericValue(a.charAt(i));
            }
        }
         
    
       System.out.print(c);
    }
}