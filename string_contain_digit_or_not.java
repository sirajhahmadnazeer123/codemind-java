import java.util.*;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int c=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)>='0' && s.charAt(i)<='9')
            {
                c+=1;
            }
        }
        if(c==0)
        {
            System.out.println("Doesn't contain digit");
        }
        else
        {
            System.out.format("Contains %d digit",c);
        }
    }
}