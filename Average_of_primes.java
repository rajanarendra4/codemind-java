import java.util.Scanner;
class Main
{
    public static boolean isprime(int n)
    {
        if(n<2)
        return false;
        int count=0;
        for(int i=2;i<=(int)Math.sqrt(n);i++)
        {
            if(n%i==0)
              count++;
        }
        if(count==0)
             return true;
        else
             return false;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,s=0,count=0,x[],i;
        n=sc.nextInt();
        x=new int[n];
        float average;
        for(i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
            if(isprime(x[i]))
            {
              s=s+x[i];
              count++;
            }
        }
        average=(float)s/count;
        System.out.printf("%.2f",average);
    }
}