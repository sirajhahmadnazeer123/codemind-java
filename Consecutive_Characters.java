import java.util.*;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int c=0,c1=0;
        for(int i=0;i<s.length()-1;i++)
        {
            if(s.charAt(i)==s.charAt(i+1))
            {
                c++;
            }
            else
            {
                if(c1<c)
                {
                    c1=c;
                }
                c=0;
            }
        }
        if(c1<c)
        {
            c1=c;
        }
        System.out.println(c1+1);
    }
}