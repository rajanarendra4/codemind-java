import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
     Scanner sc=new Scanner(System.in);
     int n,x[],A,B,c=0,d=0,i;
     n=sc.nextInt();
     x=new int[n];
     for(i=0;i<n;i++)
     {
        x[i]=sc.nextInt();
     }
     A=sc.nextInt();
     B=sc.nextInt();
     for(i=0;i<n;i++)
     {
        if(x[i]<A || x[i]>B)
        {
            c=c+x[i];
        }
        else
        {
            d=d+x[i];
        }
     }
     System.out.println(d);
    }
}