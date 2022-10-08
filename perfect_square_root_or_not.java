import java.util.Scanner;
class vamsi
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double s = Math.sqrt(n);
        if((int)s*s==n){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
       
    }
}