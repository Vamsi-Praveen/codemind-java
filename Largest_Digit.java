import java.util.Scanner;
class vamsi
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int d,max=0;
        while(n!=0)
        {
           d=n%10;
           if(d>max)
           {
               max=d;
           }
           n=n/10;
        }
        System.out.print(max);
       
    }
}