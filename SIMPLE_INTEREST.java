import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int p,t,r,i;
        p=sc.nextInt();
        t=sc.nextInt();
        r=sc.nextInt();
        i=(p*t*r)/100;
        System.out.println(i);
        
    }
}