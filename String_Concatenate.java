import java.util.*;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String s1=sc.next();
        String l=s1.concat(s);
        char tempArray[] = l.toCharArray();
        Arrays.sort(tempArray);
        System.out.println(new String(tempArray));
    }
}