import java.util.Scanner;
class vamsi
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        if(a.length()==10)
        {
            if(a.charAt(0)!='0')
            {
                System.out.print("Valid");
            }
        }
        else
        {
            System.out.print("Invalid");
        }
       
    }
}