import java.util.*;
class asc
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c=0;
        int d=0;
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=1;i<n;i++)
        {
            d++;
            if(arr[i-1]<arr[i])
            {
                c++;
            }
        }
        if(c==d)
        {
            System.out.print("yes");
        }
        else
        {
            System.out.print("no");
        }
    }
}