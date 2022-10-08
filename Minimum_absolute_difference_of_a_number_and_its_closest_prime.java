import java.util.*;
class vamsi
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int k=0,m=0,d,i,c=2,n,j,p;
        int a[] = new int[1000];
        int b[] = new int[1000];
        k=0;
        m=0;
        n=sc.nextInt();
        for(i=0;i<n+100;i++)
        {
            c=2;
            for(j=2;j<i;j++)
            {
                if(i%j==0)
                {
                    c++;
                }
            }
            if(c==2)
            {
                a[k]=Math.abs(n-i);
                b[k]=i;
                m++;
                k++;
            }
        }
        d=a[0];
        for(i=0;i<m;i++)
        {
            if(d>a[i])
            {
                d=a[i];
                p=b[i];
            }
        }
        System.out.print(d);
    }
}