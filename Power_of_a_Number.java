import java.util.*;
class vamsi
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int p = (int)Math.pow(n,a);
		System.out.println(p%b);
	}
}