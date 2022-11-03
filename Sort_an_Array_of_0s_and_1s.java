import java.util.Scanner;
class Sort
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int [] x=new int[a];
        for(int i=0;i<a;i++)
        {
            x[i]=sc.nextInt();
        }
        for(int i=0;i<a;i++)
        {
            if(x[i]==0)
            {
                
            
               System.out.format("%d ",x[i]);
            }
        }
        for(int i=0;i<a;i++)
        {
            if(x[i]==1)
            {
                
            
               System.out.format("%d ",x[i]);
            }
        }
        
        
        
    }
}