import java.util.*;
class Solution 
{
    public String reverseWords(String s) {
        if (s == null || s.isEmpty()) {
            return s;
        }
        
        char[] chars = s.toCharArray();
        int start = 0, end = 0;
        while (end < chars.length) {
            if (chars[end] == ' ') {
                reverse(chars, start, end - 1);
                start = end + 1;
                end = start + 1;
            } else {

                end++;
            }
        }
        

        reverse(chars, start, end - 1);
        
        return new String(chars);
    }
    
    private void reverse(char[] chars, int start, int end) {
        while (start < end) {
            swap(chars, start, end);
            start++;
            end--;
        }
    }
    
    private void swap(char[] chars, int i, int j) {
        char tmp = chars[i];
        chars[i] = chars[j];
        chars[j] = tmp;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Solution p=new Solution();
        String s=sc.nextLine();
        System.out.println(p.reverseWords(s));
    }
}