import java.util.Scanner;

public class govinda {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(check(n)){

            int sum=0;
            int p=n;
            while(p!=0){
                sum=sum+(p%10);
                p=p/10;
            }
            int k=primer(n);
            if(k==sum){
                System.out.println(1);
            }
            else{
                System.out.println(0);
            }
        }
        else{
            System.out.println(0);
        }
    }
    public static int primer(int n){
        int psum=0;
        while(n!=1){
            for(int i=2;i<=n;i++){
                if(n%i==0){
                    int y=i;
                    while(y!=0){
                        psum=psum+(y%10);
                        y=y/10;
                    }
                    n=n/i;
                    break;
                }
            }
        }
        return psum;

    }
    public static boolean check(int n){
        for(int i=2;i<n;i++){
            if(n%i==0){
                return true;
            }
        }
        return false;
    }
}
