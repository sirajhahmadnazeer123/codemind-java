import java.util.Scanner;
import java.lang.*;
class IP
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String a=sc.nextLine();
        int i;
        StringBuilder sb=new StringBuilder();
        for(i=0;i<a.length();i++)
        {
            if(a.charAt(i) == '.')
            {
                sb.append("[.]");
            }
            else
            {
                sb.append(a.charAt(i));
            }
        }
        System.out.print(sb);
    }
}