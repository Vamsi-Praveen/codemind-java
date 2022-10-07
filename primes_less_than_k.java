import java.util.*;
class vamsi
{
     static boolean is_prime(int n){
        int c=0,i=1;
        while(i<=n)
        {
            if(n%i==0){
                c+=1;
            }
            i+=1;
        }
        if(c==2){
            return true;
        }
        else{
            return false;
        }
     }
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		int c =0;
		for(int i=0;i<n;i++)
		{
		    arr[i]=sc.nextInt();
		}
		int k = sc.nextInt();
		for(int i=0;i<n;i++)
		{
		    if(is_prime(arr[i]) && (arr[i]<=k))
		    {
		        c+=1;
		    }
		}
		System.out.println(c);
	}
}