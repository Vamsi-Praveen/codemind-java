import java.util.*;
class palin
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int rev=0;
        while(temp!=0)
        {
            int d = temp%10;
            rev=(rev*10)+d;
            temp = temp/10;
        }
        if(rev==n)
        {
            System.out.print("2");
        }
        else
        {
            System.out.print("1");
        }
    }
}