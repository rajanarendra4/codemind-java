import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,x[];
        n=sc.nextInt();
        x=new int[n];
        for(int i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(x[i]%2==0)
            {
                count++;
            }
        }
        if(count==n)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}