import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Claudia {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<n;i++){
            arr.add(sc.nextInt());
        }
        Collections.sort(arr);
        int k=arr.get(arr.size()-1);
int f=1;
        for(int i=0;i<arr.size()-1;i++){
            if(k%arr.get(i)==0&&f!=0){
                int p=k/arr.get(i);
                if(p%2==0||p%3==0){

                }
                else{
                    f=0;
                    break;
                }
            }
            else{
                f=0;
                break;
            }
        }
        if(f==1){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
