import java.util.*;
class vamsi
{
    static int fac(int n)
    {
        int f=1;
        for(int i=1;i<=n;i++)
        {
            f=f*i;
        }
        return f;
    }
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0;i<n;i++)
		{
		    int a = sc.nextInt();
		    System.out.println(fac(a));
		}
	}
}