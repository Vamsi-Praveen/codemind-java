import java.util.*;
class vamsi
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int c=0,s=0;
		int arr[] = new int[n];
		for(int i=0;i<n;i++)
		{
		    arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
		    s+=arr[i];
		}
		System.out.printf("%.2f",(float)s/n);
	}
}