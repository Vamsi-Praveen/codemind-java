import java.util.Scanner;
class one{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int i,temp,d,sum=0,p=1;
        temp=n;
        while(n>0)
        {
            d=n%10;
            p*=d;
            sum+=d;
            n/=10;
        }
        if(sum==p){
            System.out.print("Spy Number");
        }
        else{
            System.out.print("Not Spy Number");
        }
    }
}