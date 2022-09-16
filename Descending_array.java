import java.util.Scanner;
class count
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,i,c=0;
        a=sc.nextInt();
        b=sc.nextInt();
        int [] arr=new int[a];
        for (i=0;i<a-1;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(i=0;i<a-1;i++)
        {
         if (arr[i]<=arr[i+1])
         {
             System.out.println("no");
             c++;
             break;
         }
        }
        if(c==0)
        {
            System.out.println("yes");
        }
    }
}