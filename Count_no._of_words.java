import java.util.*;
class count
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int c=1;
        for(int i=0;i<s.length();i++)
        {
            char t = s.charAt(i);
            if(t == ' ')
            {
                c+=1;
            }
        }
        System.out.println(c);
    }
}