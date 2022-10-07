import java.util.*;
class vamsi
{
    static boolean palin(int n)
    {
        int temp=n;
        int d,rev=0;
        while(n!=0)
        {
            d=n%10;
            rev=rev*10+d;
            n/=10;
        }
        if(rev==temp)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		for(int i=a;i<=b;i++)
		{
		    if(palin(i))
		    {
		        System.out.printf("%d ",i);
		    }
		}
	}
}