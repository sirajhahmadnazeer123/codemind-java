import java.util.*;
class Solution
{
    public static void ExcelColumn(int n) 
    {
          StringBuilder sb = new StringBuilder();
        while (n != 0) {
            int rem = n % 26;
            if (rem == 0) {
                rem += 26;
            }
            if (n >= rem) {
                n -= rem;
                sb.append((char) (rem + 64));
            }
            n /= 26;
        }
    System.out.println(sb.reverse().toString());
}
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ExcelColumn(n);
    }
}