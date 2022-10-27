import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,x[],c=0,d=0;
        n=sc.nextInt();
        x=new int[n];
        for(int i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        for(int j=0;j<n;j++)
        {
          if(x[j]!=999)
          {
              c=1;
              for(int k=0;k<n;k++)
              {
                  if(x[j]==x[k] && j!=k)
                  {
                      c++;
                      x[k]=999;
                  }
              }
              if(x[j]!=999 && x[j]%2==1)
              {
                  d=d+x[j];
              }
          }
        }
        System.out.println(d);
    }
}
