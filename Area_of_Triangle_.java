import java.util.*;
import java.lang.Math;
class area
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        double s = (a+b+c)/2.0;
        double area = (s*(s-a)*(s-b)*(s-c));
        area = Math.sqrt(area);
        System.out.printf("%.2f",area);
        
    }
}