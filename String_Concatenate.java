import java.util.*;
class st
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String s1 = sc.nextLine();
        String s2 = s.concat(s1);
        char[] c = s2.toCharArray();        
        java.util.Arrays.sort(c);          
        String newString = new String(c);  
        System.out.println(newString);     
    }
}