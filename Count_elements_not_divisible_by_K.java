import java.util.*;
class count
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n,k,c=0;
        n=sc.nextInt();
        k=sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]= sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i]%k!=0)
            {
                c++;
            }
        }
        System.out.print(c);
        
    }
}