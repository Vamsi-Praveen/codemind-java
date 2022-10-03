import java.util.*;
class number
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int c = 0;
        for(int i=0;i<s.length();i++)
        {
            char temp = s.charAt(i);
            if(Character.isDigit(temp))
            {
                int b = Integer.parseInt(String.valueOf(temp));
                c=c+b;
            }
            
        }
        System.out.print(c);
    }
}