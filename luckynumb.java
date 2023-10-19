import java.util.Scanner;

public class luckynumb {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int p=n;
        int k=n;
        int c=0;
        while(p!=0){
            c++;
            p=p/10;
        }
     
        int sum=0;
        while(n!=0){
            double d=Math.pow((n%10),c);
            sum=sum+(int)d;
            n=n/10;
        }
        System.out.println(sum==k);
    }
}
