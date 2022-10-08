import java.util.Scanner;
class vamsi
{
    static boolean prime(int n)
    {
        if(n==1 || n==0)
        {
            return false;
        }
        for(int i=2;i<n/2;i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=0;
        if(prime(n)){
            System.out.println("prime");
        }
        else{
            System.out.println("not a prime");
        }
       
    }
}