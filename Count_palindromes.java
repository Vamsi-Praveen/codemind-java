import java.util.*;
class palin
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c =0;
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(palin(arr[i])==true)
            {
                c++;
            }
        }
        System.out.println(c);
    }
    static boolean palin(int n)
    {
        int temp=n;
        int rev=0;
        boolean a = true;
        boolean b = false;
        while(temp!=0)
        {
            int d = temp%10;
            rev=(rev*10)+d;
            temp=temp/10;
        }
        if(rev==n)
        {
            return a;
        }
        else
        {
            return b;
        }
        
    }
}