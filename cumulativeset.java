import java.util.Scanner;

public class cumulativeset {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=0;
        for(int i=1;i<=n;i++){
            int o=i;
            while(o!=0){
                if((o&1)==1){
                    c++;
                }
               o=o>>1;
            }
        }
        System.out.println(c);
    }
}
