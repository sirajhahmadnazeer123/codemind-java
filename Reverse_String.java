import java.util.*;
class alloparo
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s;
        int i;
        s=sc.nextLine();
        String h="";
        for(i=s.length()-1;i>=0;i--)
        {
            h+=s.charAt(i);
        }
        System.out.println(h);
        
    }
}