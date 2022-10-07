import java.util.*;
class vamsi
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int c=0;
		int arr[] = new int[n];
		for(int i=0;i<n;i++)
		{
		    arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
		   if(arr[i]%2==0)
		   {
		       c+=1;
		   }
		}
		if(c==n)
		{
		    System.out.print("True");
		}
		else
		{
		    System.out.print("False");
		}
	}
}