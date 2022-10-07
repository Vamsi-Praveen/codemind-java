import java.util.*;
class vamsi
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int temp=n;
        int d,e=0,o=0,i=0;
        while(n!=0)
        {
            d=n%10;
            if(d%2==0)
            {
                e+=1;
            }
            else if(d%2!=0)
            {
                o+=1;
            }
            n/=10;
            i+=1;
        }
        if(e==i)
        {
            System.out.println("Even");
        }
        else if(o==i)
        {
            System.out.println("Odd");
        }
        else
        {
            System.out.println("Mixed");
        }
	}
}