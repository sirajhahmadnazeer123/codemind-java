import java.util.Scanner;  
class Auto  
  {  
public static void main(String args[])  
    {  
     Scanner in = new Scanner(System.in);  
      int num = in.nextInt();  
      int count=0;  
      int square = num*num;  
      int temp = num;    
      while(temp>0)  
          {  
            count++;  
            temp=temp/10;  
           }   
    int lastDigit = (int) (square%(Math.pow(10, count)));   
if(num == lastDigit)  
     System.out.println("Automorphic Number");  
else  
   System.out.println("Not an Automorphic Number");  
    }  
}  