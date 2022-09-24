import java.util.*;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int k=0;k<n;k++)
        {
            String s=sc.next();
            int c=0;
            for(int i=0;i<s.length();i++)
            {
                if(s.charAt(i)>='0' && s.charAt(i)<='9')
                {
                    c+=1;
                }
            }
            if(c>=1)
            {
                System.out.println("Yes");
            }
            else
            {
                System.out.println("No");
            }
        }
    }
}