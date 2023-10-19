import java.util.ArrayList;
import java.util.Scanner;

public class prepbuddy {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            while(n>=1){
                int p=n;
                int f=1;
                ArrayList<Integer> arr=new ArrayList<>();
                while(p!=0){
                    arr.add(p%10);
                    p=p/10;
                }
                for(int j=0;j<arr.size()-1;j++){
                    if(arr.get(j)>arr.get(j+1)){

                    }
                    else{
                        f=0;
                        break;
                    }
                }
                if(f==1){
                    System.out.println(n);
                    break;
                }
                n--;
            }
        }
    }
}
