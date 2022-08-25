import java.util.*;
class avg
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        float n,m;
        n=sc.nextFloat();
        m=sc.nextFloat();
        float avg = (n+m)/2;
        System.out.printf("%.4f",avg);
    }
}