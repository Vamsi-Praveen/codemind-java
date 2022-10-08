import java.util.Scanner;
class vamsi
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=0;
        for(int i=1;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(i*j==n)
                {
                    System.out.printf("%d %d",i,j);
                    c=1;
                }
            }
        }
        if(c==0)
        {
            System.out.print("-1");
        }
        
    }
}