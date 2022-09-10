import java.util.Scanner;
class area
{
    public static void main(String args[])
    {
        int a,i,c=0;
        float r;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        int[] arr=new int[a];
        for(i=0;i<a;i++)
        {
            arr[i]=sc.nextInt();
            if(arr[i]%2!=0)
            {
                c++;
            }
        }
        if(c<=2)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    sc.close();
    }
}