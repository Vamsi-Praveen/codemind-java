import java.util.*;
class disk
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int s = sc.nextInt();
        int b = sc.nextInt();
        int dc = 512*b*s*t*2;
        System.out.println(dc);
    }
}