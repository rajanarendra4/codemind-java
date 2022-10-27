import java.util.Scanner;
class Main
{
    public static boolean isprime(int n)
    {
        if(n<2)
        {
            return false;
        }
        int count=0;
        for(int i=2;i<=(int)Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                count++;
            }
        }
        if(count==0)
             return true;
        else
             return false;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            int a;
            a=sc.nextInt();
            int f=0;
            for(int j=2;j<=a;j++)
            {
                if((a%j == 0)&&isprime(j) && isprime(a/j)&& j!=(a/j))
                {
                    System.out.println("YES");
                    f=1;
                    break;
                }
            }
            if(f==0)
            System.out.println("NO");
        }
    }
}