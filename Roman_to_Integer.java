import java.util.*;
import java.util.HashMap;
class Roman
{
    public static void RomantoNumber(String s) 
    {
        Map<Character,Integer> L=new HashMap<>();
        Scanner sc=new Scanner(System.in);
        if(s==null || s.length()==0)
        {
            System.out.print(0);
        }
        L.put('I', 1);
    	L.put('V', 5);
    	L.put('X', 10);
    	L.put('L', 50);
    	L.put('C', 100);
    	L.put('D', 500);
    	L.put('M', 1000);
    	int len=s.length(),res=L.get(s.charAt(len-1));
        for(int i=len-2;i>=0;i--) 
        {
            if(L.get(s.charAt(i))>=L.get(s.charAt(i+1)))
            {
                res=res+L.get(s.charAt(i));
            }
            else
            {
                res=res-L.get(s.charAt(i));
            }
            
        }
        System.out.print(res);
    }
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        RomantoNumber(s);
    }
}