import java.util.*;
class vamsi
{
    static boolean isself(int n)
    {
        int temp=n;
        int k=0,c=0,d;
        while(n!=0)
        {
            d=n%10;
            if(d==0)
            {
                return false;
            }
            else if(temp%d==0)
            {
                c+=1;
            }
            k+=1;
            n=n/10;
        }
        if(c==k)
        {
            return true;
        }
        return false;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int m=sc.nextInt();
        for(int i=n;i<=m;i++)
        {
            if(isself(i))
            {
                System.out.printf("%d ",i);
            }
        }
    }
}