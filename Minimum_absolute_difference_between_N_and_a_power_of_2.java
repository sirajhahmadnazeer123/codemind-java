import java.util.*;
class Solution
{
static int minAbsDiff(int n)
{
    int left = (int)Math.pow(2, (int)(Math.log(n) /Math.log(2)));
    int right = left * 2;
    return Math.min((n - left), (right - n));
}
 
public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    int n =sc.nextInt();
    System.out.println(minAbsDiff(n));
}
}