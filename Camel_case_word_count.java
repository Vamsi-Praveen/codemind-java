import java.util.*;
class camel
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int c = 1;
        for(int i=1;i<s.length();i++)
        {
            if(Character.isUpperCase(s.charAt(i)))
            {
                // System.out.print(s.charAt(i));
                c++;
            }
        }
        System.out.print(c);
    }
}