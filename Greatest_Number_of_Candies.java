import java.util.Scanner;
class vamsi
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        int max=arr[0];
        for(int i=0;i<n;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        for(int i=0;i<n;i++)
        {
            if((arr[i]+k)>=max)
            {
                System.out.printf("True ");
            }
            else
            {
                System.out.printf("False ");
            }
        }
           
    }
}