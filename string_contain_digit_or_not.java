import java.util.*;
class vamsi
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int c = 0;
        for(int i=0;i<s.length();i++)
        {
            if(Character.isDigit(s.charAt(i)))
            {
                c+=1;
            }
        }
        if(c!=0)
        {
            System.out.printf("Contains %d digit",c);
        }
        else
        {
            System.out.println("Doesn't contain digit");
        }
    }       
}
