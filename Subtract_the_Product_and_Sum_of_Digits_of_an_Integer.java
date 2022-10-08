import java.util.*;
class vamsi
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int p=1,s=0,d;
        while(n!=0)
        {
            d=n%10;
            p=p*d;
            s=s+d;
            n/=10;
        }
        System.out.print(p-s);
    }
}