import java.util.*;
class vamsi
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int arr[] = new int[n];
		int c = 0;
		for(int i=0;i<n;i++)
		{
		    arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
		    for(int j=0;j<n;j++)
		    {
		        if(arr[i]==arr[j] && i!=j)
		        {
		            arr[j]=-1;
		        }
		    }
		    if(arr[i]%2==0)
		    {
		        c+=1;
		    }
		}
		System.out.println(c);
		
	}
}