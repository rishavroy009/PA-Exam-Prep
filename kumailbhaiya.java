import java.util.Scanner;

public class kumailbhaiya {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int p=0;p<t;p++){
            int c1=sc.nextInt();
            int c2=sc.nextInt();
            int c3=sc.nextInt();
            int c4=sc.nextInt();
            int n=sc.nextInt();
            int m=sc.nextInt();
            int rick[]=new int[n];
            int bus[]=new int[m];
            for(int i=0;i<n;i++){
                rick[i]=sc.nextInt();
            }
            for(int i=0;i<m;i++){
                bus[i]=sc.nextInt();
            }
            int sumr=0;
            for(int i=0;i<n;i++){
                sumr=sumr+Math.min(rick[i]*c1,c2);
            }
            int totalr=Math.min(sumr,c3);
            int sumb=0;
            for(int i=0;i<m;i++){
                sumb=sumb+Math.min(bus[i]*c1,c2);
            }
            int totalb=Math.min(sumb,c3);
            System.out.print(Math.min((totalb+totalr),c4));
        }
    }
}
