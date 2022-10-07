import java.util.*;
class vamsi
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int l,b,w,a1,a2,s,c,cost;
        l =sc.nextInt();
        b =sc.nextInt();
        w =sc.nextInt();
        c =sc.nextInt();
        a1=(l+2*w)*(b+2*w);
        a2=l*b;
        s=a1-a2;
        cost=s*c;
        System.out.print(cost);
    }
}
