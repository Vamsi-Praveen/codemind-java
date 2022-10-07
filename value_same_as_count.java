import java.util.*;
class vamsi
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int count=0,i=0,j,m,k=0;
		int n=sc.nextInt();
		int a[]=new int[n];
		int b[]=new int[100];
		for(i=0;i<n;i++)
		{
		    a[i]=sc.nextInt();
		}
		for(i=0;i<n;i++)
        {
            count=0;
            for(j=0;j<n;j++)
            {
                if(a[i]==a[j])
                count++;
            }
            if(count==a[i])
            {
                b[k]=a[i];
                k++;
            }
        }
        for(i=0;i<k;i++)
        {
            for(j=i+1;j<k;j++)
            {
                if(b[i]==b[j])
                {
                    for(m=j;m<k;m++)
                    b[m]=b[m+1];
                    k--;
                    j--;
                }
            }
        }
        for(i=0;i<k;i++)
        {
            
        }
        System.out.printf("%d ",i);
    }
}
        