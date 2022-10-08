import java.util.*;
class vamsi
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[] = new int[100];
        int arr1[] = new int[100];
        int c[] = new int[100];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            arr1[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            c[i]=arr[i]+arr1[i];
        }
        for(int i=0;i<n;i++)
        {
            System.out.printf("%d
",c[i]);
        }
    }
}