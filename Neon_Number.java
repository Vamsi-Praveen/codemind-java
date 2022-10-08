import java.util.Scanner;
class one{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int i,temp,d,sum=0;
        temp=n;
        n=n*n;
        while(n>0)
        {
            d=n%10;
            sum+=d;
            n/=10;
        }
        if(sum==temp){
            System.out.print("Neon Number");
        }
        else{
            System.out.print("Not Neon Number");
        }
    }
}