import java.util.*;
class count
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int v=0,c=0,d=0,w=0;
        for(int i=0;i<s.length();i++)
        {
            if("aeiou".contains(Character.toString(s.charAt(i))))
            {
                v+=1;
            }
            else if(Character.isDigit(s.charAt(i)))
            {
                d+=1;
            }
            else if(s.charAt(i) == ' ')
            {
                w+=1;
            }
            else
            {
                c+=1;
            }
        }
        System.out.printf("Vowels: %d
",v);
        System.out.printf("Consonants: %d
",c);
        System.out.printf("Digits: %d
",d);
        System.out.printf("White spaces: %d
",w);
        
    }
}