import java.util.Scanner;
class Ptring
{
    public static void main(String args[])
    
    {
        Scanner sc = new Scanner(System.in);
            String o = sc.nextLine();
            int r,c=0,k;
            k=o.length();
            for(r=0;r<o.length();r++)
            {
                if(o.charAt(r)>=48 && o.charAt(r)<=57)
                {
                
                    c+=Character.getNumericValue(o.charAt(r));;
                }
            }
            System.out.print(c);
        
    }
    
}