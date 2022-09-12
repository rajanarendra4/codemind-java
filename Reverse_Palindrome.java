import java.util.Scanner;
class Main
{
    public static int num(int n)
    {
        int temp=n,sum=0,r,rev=0;
        while(n>0)
        {
            r=n%10;
            rev=rev*10+r;
            n=n/10;
        }
        sum=temp+rev;
        return sum;
    }
    public static boolean palindrome(int n)
    {
        int temp=n,r,rev=0;
        while(n>0)
        {
            r=n%10;
            rev=rev*10+r;
            n=n/10;
        }
        if(temp==rev)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,a=0;
        n=sc.nextInt();
        a=num(n);
        while(a>0)
        {
            if(palindrome(a))
            {
                System.out.println(a);
                break;
            }
            a=num(a);
        }
    }
}