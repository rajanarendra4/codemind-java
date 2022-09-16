 import java.util.Scanner;
 class Main 
{
    static int reverseDigits(int num)
    {
        int rev = 0;
        while (num > 0)
        {
            rev = rev * 10 + num % 10;
           num=num/10;
        }
        return rev;
    }
    static int square(int num)
    {
        return (num * num);
    }
    static boolean checkAdamNumber(int num)
    {
        int a = square(num);
        int b = square(reverseDigits(num));
        if (a == reverseDigits(b))
        return true;
        return false;       
    }
 
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
         
        if (checkAdamNumber(n))
        System.out.println("True");
        else
        System.out.println("False");   
    }
 
}
